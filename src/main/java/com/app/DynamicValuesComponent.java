package com.app;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:DynamicValues.properties")
public class DynamicValuesComponent {
	@Value("${dynamic.name}")
	private String name;
	
	@Value("${dynamic.value}")
	private Integer integerValue;
	
	@Value("${dynamic.sumInteger}")
	private Integer sumInteger;
	
	@Value("${dynamic.subtInteger}")
	private Integer subtInteger;
	
	@Value("${dynamic.multInteger}")
	private Integer multInteger;
	
	@Value("${dynamic.divDouble}")
	private Double divDouble;
	
	@Value("${dynamic.randomInteger}")
	private Integer randomInteger;
	
	@Value("${dynamic.randomDouble}")
	private Double randomDouble;
	
	@Value("${dynamic.maxValue}")
	private Integer maxValue;
	
	@Value("${dynamic.minValue}")
	private Integer minValue;
	
	@Value("${dynamic.stringLength}")
	private Integer stringLength;
	
	@Value("${dynamic.stringArray}")
	private String[] stringArray;
	
	@Value("${dynamic.randomInteger.string}")
	private String randomIntegerString;

	@Override
	public String toString() {
		return "DynamicValuesComponent [name=" + name + ", integerValue=" + integerValue + ", sumInteger=" + sumInteger
				+ ", subtInteger=" + subtInteger + ", multInteger=" + multInteger + ", divDouble=" + divDouble
				+ ", randomInteger=" + randomInteger + ", randomDouble=" + randomDouble + ", maxValue=" + maxValue
				+ ", minValue=" + minValue + ", stringLength=" + stringLength + ", stringArray="
				+ Arrays.toString(stringArray) + ", randomIntegerString=" + randomIntegerString + "]";
	}

}
