package com.guruji.demoProject1;

public class SampleHateoasBusinesImpl implements SampleHateoasBusiness{

	public SampleHateoasVO getCustomerInfo(String customerId) {
		SampleHateoasVO data=null;
		if(customerId.equalsIgnoreCase("0001")) {
			data=new SampleHateoasVO();
			data.setCustomerName("Hari baskar");
			data.setCompanyName("Jump cuts");			
		}
		if(customerId.equalsIgnoreCase("0002")) {
			data=new SampleHateoasVO();
			data.setCustomerName("Gopi,Sudhakar");
			data.setCompanyName("Madras Central");			
		}
		if(customerId.equalsIgnoreCase("0003")) {
			data=new SampleHateoasVO();
			data.setCustomerName("Mr.Unknown");
			data.setCompanyName("Mr.GK");			
		}
		return data;
	}

}
