package com.epam.lab.Droids;
import org.apache.log4j.Logger;

public class AssaultDroid implements BattleDroid{
	private static final Logger LOG = Logger.getLogger(AssaultDroid.class);	
	@Override
	public void run() {
		LOG.info("AssaultDroid runs");		
	}
	@Override
	public void attack() {
		System.out.println("AssaultDroid attacks");
	}	
}
