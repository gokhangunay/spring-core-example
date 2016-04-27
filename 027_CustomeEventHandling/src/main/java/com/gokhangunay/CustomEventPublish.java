package com.gokhangunay;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublish implements ApplicationEventPublisherAware{

	//olayi yaratiyor ve springe soyluyoruz
	
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void publish(){
		CustomEvent customEvent = new CustomEvent(this);
		applicationEventPublisher.publishEvent(customEvent); // 
	}

}
