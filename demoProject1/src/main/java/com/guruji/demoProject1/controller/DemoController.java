package com.guruji.demoProject1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruji.demoProject1.vo.DemoResponse;

@RestController
@RequestMapping("demo-api")
public class DemoController {

	@RequestMapping(value = "/get-info", method = RequestMethod.GET)
	public DemoResponse getDemoInfo() {
		DemoResponse response = new DemoResponse();
		response.setName("demo");
		return response;
	}

}
