package com.epam.lab.Droid;
import org.apache.log4j.Logger;

public class MedicDroid extends Droid{
	private static final Logger LOG = Logger.getLogger(MedicDroid.class);	
	public MedicDroid(){
		type = "MedicDroid";
	}
	@Override
	public void move() {
	 LOG.info("MedicDroid move");	
	}
}
