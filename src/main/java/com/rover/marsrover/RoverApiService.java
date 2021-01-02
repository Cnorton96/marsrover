package com.rover.marsrover;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RoverApiService {

    private static final String apiKey = "eTIfoiHIGW7GIN2vUzn48Aj9nsymx0492TWTJYTI";

    public RoverApiResponse getRoverApiData(String roverType, Integer marsSol){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<RoverApiResponse> responseEntity = restTemplate.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol="+marsSol+"&api_key="+apiKey, RoverApiResponse.class);
        System.out.println(responseEntity.getBody());
        return responseEntity.getBody();
    }
}
