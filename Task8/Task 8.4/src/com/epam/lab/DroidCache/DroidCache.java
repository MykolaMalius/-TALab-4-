package com.epam.lab.DroidCache;
import java.util.Hashtable;

import com.epam.lab.Droid.*;

public class DroidCache {
	private static Hashtable<String, Droid> droidMap  = new Hashtable<String, Droid>();
	public static Droid getDroid(String droidType){
         Droid cachedDroid = droidMap.get(droidType);
	     return (Droid) cachedDroid.clone();
	   }
	public static void loadCache() {
	     BattleDroid battleDroid = new BattleDroid();
	     battleDroid.setType("BattleDroid");
	     battleDroid.setType("MechanicDroid");
	     droidMap.put(battleDroid.getType(),battleDroid);
	     droidMap.put(battleDroid.getType(),battleDroid);

	     MedicDroid medicDroid = new MedicDroid();
	     medicDroid.setType("MedicDroid");
	     droidMap.put(medicDroid.getType(),medicDroid);
	   }
}
