package com.guruji.demoProject1;
//HATEOAS stands for “Hypermedia as the engine of application state”

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hateoas")
public class SampleHateoasController {

	@Autowired
	SampleHateoasBusiness sampleHateoasBusiness;
	
	@RequestMapping(value = "/info")
	public List<SampleHateoasVO> getCustomerInfolist(){
		
		return null;
	}
	
	// Adding HATEOAS Support
	@RequestMapping(value = "/info/{}", method = RequestMethod.GET, produces = { "application/hal+json" })
	public Resource<SampleHateoasVO> getCustomerInfo(@PathVariable String customerId) {
		SampleHateoasVO obj=sampleHateoasBusiness.getCustomerInfo(customerId);
		//ControllerLinkBuilder linkTo=
		
		return null;
	}
}
