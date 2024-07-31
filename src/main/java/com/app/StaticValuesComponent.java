package com.app;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StaticValuesComponent {
	@Value("Sree Sagar")
	private String name;
	
	@Value("30")
	private Integer value;
	
	@Value("#{12+24}")
	private Integer sumInteger;
	
	@Value("#{52-24}")
	private Integer subtInteger;
	
	@Value("#{9*2}")
	private Integer multInteger;
	
	@Value("#{18/9}")
	private Double divDouble;
	
	@Value("#{new java.util.Random().nextInt()}")
	private Integer randomInteger;
	
	@Value("#{new java.util.Random().nextDouble()}")
	private Double randomDouble;
	
	@Value("#{T(java.lang.Math).max(25, 55)}")
	private Integer maxValue;
	
	@Value("#{T(java.lang.Math).min(25, 55)}")
	private Integer minValue;
	
	@Value("#{'Spring'.length()}")
	private Integer stringLength;
	
	@Value("#{'A,B,C,D'.split(',')}")
	private String[] stringArray;

	@Override
	public String toString() {
		return "StaticValuesComponent [name=" + name + ", value=" + value + ", sumInteger=" + sumInteger
				+ ", subtInteger=" + subtInteger + ", multInteger=" + multInteger + ", divDouble=" + divDouble
				+ ", randomInteger=" + randomInteger + ", randomDouble=" + randomDouble + ", maxValue=" + maxValue
				+ ", minValue=" + minValue + ", stringLength=" + stringLength + ", stringArray="
				+ Arrays.toString(stringArray) + "]";
	}

}
