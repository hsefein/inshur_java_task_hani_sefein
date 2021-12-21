package com.example.inshur_java_task_hani_sefein;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class WeatherController {
  
  // endpoint URL https://api.openweathermap.org/data/2.5/onecall?lat=50.824955973889&lon=-0.13878781625840952&exclude={part}&appid=3f159511ac64f5393feaa6f3c700c74b
  
  // OPEN WEATHER API KEY
  final String API_KEY = "3f159511ac64f5393feaa6f3c700c74b";
  String unit;
  
  private RestTemplate restTemplate;
  
  @Autowired
  public WeatherController(RestTemplateBuilder builder) {
    this.restTemplate = builder.build();
  }
  
  // PASSING LAT AND LON IN URL
  // e.g. http://localhost:8080/?lat=50.82&lon=-0.138
  @RequestMapping(path = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public @ResponseBody
  String getWeather(Double lat, Double lon, HttpServletRequest request) {
    final String API_URL_DAILY_FORCAST = "https://api.openweathermap.org/data/2.5/onecall?lat=" +lat+ "&lon=" +lon+ "&exclude=daily&appid=" +API_KEY+"";
  
    HttpSession session = request.getSession();
    session.setAttribute("lat", lat);
    session.setAttribute("lon", lon);
    
    ResponseEntity <String>responseDaily = restTemplate.getForEntity(API_URL_DAILY_FORCAST, String.class);
    
    return responseDaily.getBody();
  }
  
}
