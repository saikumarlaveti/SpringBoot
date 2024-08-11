package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainController{
	
	//@Autowired
	Train ref;
	
	
    //using Constructor
	@Autowired
	public  TrainController(Train ref) {
		this.ref  = ref;
	}
	
//	@Autowired
//	public void  setTrain(Train ref) {
//		this.ref = ref;
//	}
	
	@GetMapping("/getPlane")
	public String getTrainDetails()
	{
		return ref.run() ;
	}
}
