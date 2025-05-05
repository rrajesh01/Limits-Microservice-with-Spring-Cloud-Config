package com.rajesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.bean.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	private Limits limit;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(limit.getMinimum(),limit.getMaximum());
	}
}
