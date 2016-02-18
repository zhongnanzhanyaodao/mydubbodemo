package org.mydubbo.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) throws InterruptedException {
		//com.alibaba.dubbo.container.Main.main(args);
		
		Main launcher=new Main();
		launcher.start();
		Thread.sleep(1000*60*10);
	}
	
	void start(){
		String configLocation="dubbo-provider.xml";
		ApplicationContext context =new  ClassPathXmlApplicationContext(configLocation);
		String [] names=context.getBeanDefinitionNames();
		System.out.print("Beans:");
		for (String string : names)
			System.out.print(string+",");
		System.out.println();
	}
}
