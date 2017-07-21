package com.epam.lab.Droids;
import org.apache.log4j.Logger;

public class BattleDroid implements Droid{
	private static final Logger LOG = Logger.getLogger(BattleDroid.class);		
	@Override
	public void move() {
		LOG.info("BattleDroid moves");			
	}
	@Override
	public void attack() {
		LOG.info("BattleDroid attacks");		
	}
}
