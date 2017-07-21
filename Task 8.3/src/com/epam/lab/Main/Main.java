package com.epam.lab.Main;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.epam.BlasterGun.BlasterGun;
import com.epam.lab.Droid.BattleDroid;
import com.epam.lab.Droid.Droid;

public class Main {
	private static final Logger LOG = Logger.getLogger(Main.class);	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");	
		Droid droid = new BattleDroid();
		LOG.info("BattleDroid EnergyLevel:" + droid.getEnergyLevel() + " Description:" + droid.getDescription());
		droid = new BlasterGun(droid);
		LOG.info("BlasterGun EnergyLevel:" + droid.getEnergyLevel() + " Description:" + droid.getDescription());	
	}
}
