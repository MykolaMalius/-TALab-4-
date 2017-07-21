package com.epam.lab.JediDroids;
import org.apache.log4j.Logger;


import com.epam.lab.DroidsInterfaces.SupportDroid;

public class MedicJediDroid implements SupportDroid{
	private static final Logger LOG = Logger.getLogger(MedicJediDroid.class);	
	@Override
	public void move() {
		LOG.info("MedicDroid is moving");	
	}
	@Override
	public void support() {
		LOG.info("MedicDroid is treats");	
	}
}
