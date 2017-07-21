package com.epam.lab.Main;
import org.apache.log4j.Logger;

import com.epam.lab.Droid.BattleDroid;
import com.epam.lab.Droid.Droid;
import com.epam.lab.DroidCache.DroidCache;

public class Main {
	private static final Logger LOG = Logger.getLogger(Main.class);	
	public static void main(String[] args) {
		  DroidCache.loadCache();
	      Droid clonedDroid1 = (Droid) DroidCache.getDroid("BattleDroid");
	      LOG.info("Droid : " + clonedDroid1.getType());		
	      Droid clonedDroid2 = (Droid) DroidCache.getDroid("MedicDroid");
	      LOG.info("Droid : " + clonedDroid2.getType());		
	}
}
