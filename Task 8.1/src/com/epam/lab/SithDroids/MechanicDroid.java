package com.epam.lab.SithDroids;
import org.apache.log4j.Logger;

import com.epam.lab.DroidsInterfaces.SupportDroid;

public class MechanicDroid implements SupportDroid{
	private static final Logger LOG = Logger.getLogger(MechanicDroid.class);	
	@Override
	public void move() {
		LOG.info("MechanicDroid goes for help broken droids");	
	}
	@Override
	public void support() {
		LOG.info("MechanicDroid repairs broken droids");	
	}
}
