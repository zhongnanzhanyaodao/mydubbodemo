package org.mydubbo.provider;

import org.mydubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		  return "Hello " + name;
	}

}
