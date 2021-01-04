package com.rover.marsrover;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.lang.reflect.InvocationTargetException;

@Controller
public class HomeController {

    @Autowired
    private RoverApiService roverApiService;

    @GetMapping("/")
    public String getHomeView(ModelMap model, HomeDto homeDto) throws InvocationTargetException, IllegalAccessException {
        if(StringUtils.isEmpty(homeDto.getMarsApiRoverData())){
           homeDto.setMarsApiRoverData("opportunity");
        }

        if(homeDto.getMarsSol() == null){
            homeDto.setMarsSol(1);
        }

        RoverApiResponse roverApiResponse = roverApiService.getRoverApiData(homeDto);
        model.put("roverApiResponse", roverApiResponse);
        model.put("homeDto", homeDto);
        model.put("roverCameras", roverApiService.getRoverCameras());
        return "index";

    }

}
