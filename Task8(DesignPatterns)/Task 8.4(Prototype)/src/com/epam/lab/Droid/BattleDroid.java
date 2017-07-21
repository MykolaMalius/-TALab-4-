package com.epam.lab.Droid;
import org.apache.log4j.Logger;

public class BattleDroid extends Droid{	
	private static final Logger LOG = Logger.getLogger(BattleDroid.class);	
	public BattleDroid(){
		type = "BattleDroid";
	}
	@Override
	public void move() {
	LOG.info("BattleDroid moves");
	}
}
