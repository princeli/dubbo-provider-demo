package com.princeli.dubbo.provider;

public class DemoServiceImpl implements DemoService {
    

    	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}