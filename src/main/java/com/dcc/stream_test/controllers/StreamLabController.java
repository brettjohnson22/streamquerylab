package com.dcc.stream_test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dcc.stream_test.models.User;
import com.dcc.stream_test.service.StreamLabService;

@RestController
public class StreamLabController {

	@Autowired
	public StreamLabService service;
	
    @GetMapping("/test")
    public List<User> users(){
        return service.test();
    }
    
    @GetMapping("/problemOne")
    public long ProblemOne() {    	
    	return service.ProblemOne();
    }
	
    @GetMapping("/problemTwo")
    public void ProblemTwo() {
    	return service.ProblemTwo();
    }
    
    @GetMapping("/problemThree")
    public void ProblemThree() {
    	return service.ProblemThree();
    }
    
    @GetMapping("/problemFour")
    public void ProblemFour() {
    	return service.ProblemFour();
    }
    
    @GetMapping("/problemFive")
    public void ProblemFive() {
    	return service.ProblemFive();
    }
    
    @GetMapping("/problemSix")
    public void ProblemSix() {
    	return service.ProblemSix();
    }
    
    @GetMapping("/problemSeven")
    public void ProblemSeven() {
    	return service.ProblemSeven();
    }
    
    @GetMapping("/problemEight")
    public void ProblemEight() {
    	return service.ProblemEight();
    }
    
    @GetMapping("/problemNine")
    public void ProblemNine() {
    	return service.ProblemNine();
    }
    
    @GetMapping("/problemTen")
    public void ProblemTen() {
    	return service.ProblemTen();
    }
    
    @GetMapping("/problemEleven")
    public void ProblemEleven() {
    	return service.ProblemEleven();
    }
    
    @GetMapping("/problemTwelve")
    public void ProblemTwelve() {
    	return service.ProblemTwelve();
    }
    
    @GetMapping("/problemThirteen")
    public void ProblemThirteen() {
    	return service.ProblemThirteen();
    }
    
    @GetMapping("/problemFourteen")
    public void ProblemFourteen() {
    	return service.ProblemFourteen();
    }
    
    @GetMapping("/problemFifteen")
    public void ProblemFifteen() {
    	return service.ProblemFifteen();
    }
    
    @GetMapping("/problemSixteen")
    public void ProblemSixteen() {
    	return service.ProblemSixteen();
    }
    
    @GetMapping("/problemSeventeen")
    public void ProblemSeventeen() {
    	return service.ProblemSeventeen();
    }
    
    @GetMapping("/problemEighteen")
    public void ProblemEighteen() {
    	return service.ProblemEighteen();
    }
    
    @GetMapping("/problemNineteen")
    public void ProblemNineteen() {
    	return service.ProblemNineteen();
    }
    
    @GetMapping("/problemTwenty")
    public void ProblemTwenty() {
    	return service.ProblemTwenty();
    }
    
}
