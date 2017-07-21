package com.epam.lab.SithDroids;
import org.apache.log4j.Logger;

import com.epam.lab.DroidsInterfaces.BattleDroid;
import com.epam.lab.JediDroids.MedicJediDroid;

public class AssaultDroid implements BattleDroid{
	private static final Logger LOG = Logger.getLogger(AssaultDroid.class);	
	@Override
	public void move() {
	    LOG.info("AssaultDroid runs to next position ");
	}
	@Override
	public void attack() {
		 LOG.info("AssaultDroid shoots from blaster rifle");		
	}
}
