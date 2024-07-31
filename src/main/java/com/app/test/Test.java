package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.app.DynamicValuesComponent;
import com.app.StaticValuesComponent;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		StaticValuesComponent staticValuesComponent = applicationContext.getBean(StaticValuesComponent.class);
		System.out.println(staticValuesComponent);
		
		DynamicValuesComponent dynamicValuesComponent = applicationContext.getBean(DynamicValuesComponent.class);
		System.out.println(dynamicValuesComponent);
		
	}
}
