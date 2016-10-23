package com.pita.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor{

	
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {
		System.out.println("Before Spring ontainer is initialize the postProcessBeanFactor() method is executed");
		
	}

}
