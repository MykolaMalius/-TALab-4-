package com.epam.lab.Droids;
import org.apache.log4j.Logger;

public class SuperDroid implements Droid{
	private static final Logger LOG = Logger.getLogger(SuperDroid.class);	
	@Override
	public void move() {
		LOG.info("SuperDroid moves");	
	}
	@Override
	public void attack() {
		LOG.info("SuperDroid attacks");	
	}
}
