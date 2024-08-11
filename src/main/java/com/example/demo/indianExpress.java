package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class indianExpress implements Train {
	
	@Override
	public String run() {
		return "Train is running late because it is an indian railway system";
	}



}
