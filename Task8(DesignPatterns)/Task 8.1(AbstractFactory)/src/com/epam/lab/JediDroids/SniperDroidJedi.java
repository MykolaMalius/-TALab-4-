package com.epam.lab.JediDroids;
import org.apache.log4j.Logger;

import com.epam.lab.DroidsInterfaces.BattleDroid;

public class SniperDroidJedi implements BattleDroid{
	private static final Logger LOG = Logger.getLogger(SniperDroidJedi.class);	
	@Override
	public void move() {
		LOG.info("SniperDroid is moving");
	}
	@Override
	public void attack() {
		LOG.info("SniperDroid shoots from sniper rifle ");
	}
}
