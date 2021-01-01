package com.rover.marsrover;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Controller
public class HomeController {

    @Autowired
    private RoverApiService roverApiService;

    @GetMapping("/")
    public String getHomeView(@RequestParam(required = false) String marsApiRoverData, ModelMap model){
        if(StringUtils.isEmpty(marsApiRoverData)){
            marsApiRoverData = "opportunity";
        }
        RoverApiResponse roverApiResponse = roverApiService.getRoverApiData(marsApiRoverData);
        model.put("roverApiResponse", roverApiResponse);
        return "index";
    }

}
