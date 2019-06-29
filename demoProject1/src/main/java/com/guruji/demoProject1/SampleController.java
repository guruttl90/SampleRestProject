package com.guruji.demoProject1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sample")
public class SampleController {
	@RequestMapping(value = "/check",method = RequestMethod.GET)
	public SampleVO check() {
		SampleVO obj=new SampleVO();
		obj.setVar1("sample data1");
		obj.setVar2("sample data2");
		return obj;
	}
	
	
	
	
}
