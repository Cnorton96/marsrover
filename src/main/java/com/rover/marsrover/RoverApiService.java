package com.rover.marsrover;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@Service
public class RoverApiService {

    private static final String apiKey = "eTIfoiHIGW7GIN2vUzn48Aj9nsymx0492TWTJYTI";
    private Map<String, List<String>> roverCameras = new HashMap<>();

    public RoverApiService(){
        roverCameras.put("Opportunity", Arrays.asList("FHAZ", "RHAZ", "NAVCAM", "PANCAM", "MINITES"));
        roverCameras.put("Curiosity", Arrays.asList("FHAZ", "RHAZ", "MAST", "CHEMCAM", "MAHLI", "MARDI", "NAVCAM"));
        roverCameras.put("Spirit", Arrays.asList("FHAZ", "RHAZ", "NAVCAM", "PANCAM", "MINITES"));
    }


    public RoverApiResponse getRoverApiData(HomeDto homeDto) throws InvocationTargetException, IllegalAccessException {
        RestTemplate restTemplate = new RestTemplate();
        List<String> apiUrlEndpoints = urlEndPoint(homeDto);
        List<MarsPhoto> photos = new ArrayList<>();
        RoverApiResponse response = new RoverApiResponse();
        apiUrlEndpoints.stream()
                .forEach(url -> {
                    RoverApiResponse apiResponse = restTemplate.getForObject(url, RoverApiResponse.class);
                    photos.addAll(apiResponse.getPhotos());
                });
        response.setPhotos(photos);
        return response;
    }


    public List<String> urlEndPoint(HomeDto homeDto) throws InvocationTargetException, IllegalAccessException {
        List<String> urls = new ArrayList<>();
        Method[] methods = homeDto.getClass().getMethods();

        for(Method method : methods){
            if(method.getName().indexOf("getCamera") > -1 && Boolean.TRUE.equals(method.invoke(homeDto))){
              String cameraName = method.getName().split("getCamera")[1].toUpperCase();
              if(roverCameras.get(homeDto.getMarsApiRoverData()).contains(cameraName)){
                    urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key="+apiKey+"&camera="+cameraName);
              }
            }
        }
        return urls;
    }

    public Map<String, List<String>> getRoverCameras(){
        return roverCameras;
    }


}
