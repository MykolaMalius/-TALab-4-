package com.epam.lab.Droids;
import org.apache.log4j.Logger;

public class SniperDroid implements BattleDroid{
	private static final Logger LOG = Logger.getLogger(SniperDroid.class);	
	@Override
	public void run() {
	  LOG.info("SniperDroid run");		
	}
	@Override
	public void attack() {
		LOG.info("SniperDroid shoots from sniper-rifle");	
	}	
}
