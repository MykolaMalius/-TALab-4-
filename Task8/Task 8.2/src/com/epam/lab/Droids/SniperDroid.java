package com.epam.lab.Droids;
import org.apache.log4j.Logger;

public class SniperDroid implements Droid {
	private static final Logger LOG = Logger.getLogger(SniperDroid.class);	
	@Override
	public void move() {
	  LOG.info("SniperDroid moves");
	}
	@Override
	public void attack() {
		LOG.info("SniperDroid attacks");
	}
}
