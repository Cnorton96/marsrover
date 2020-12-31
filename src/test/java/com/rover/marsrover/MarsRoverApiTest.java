package com.rover.marsrover;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class MarsRoverApiTest {

    @Test
    public void smallTest(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<RoverApiResponse> responseEntity =
                restTemplate.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=800&camera=fhaz&api_key=DEMO_KEY", RoverApiResponse.class);
        System.out.println(responseEntity.getBody());
    }

}
