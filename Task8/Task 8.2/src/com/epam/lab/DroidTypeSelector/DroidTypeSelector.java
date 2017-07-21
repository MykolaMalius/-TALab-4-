package com.epam.lab.DroidTypeSelector;
import com.epam.lab.Droids.BattleDroid;
import com.epam.lab.Droids.Droid;
import com.epam.lab.Droids.SniperDroid;
import com.epam.lab.Droids.SuperDroid;
import com.epam.lab.Enums.DroidType;

public class DroidTypeSelector {
    private Droid droid = null;
    public Droid getDroidType(DroidType droidType){
		switch(droidType){
		case BATTLE_DROID:
			droid = new BattleDroid();
			break;
		case SUPER_DROID:
			droid = new SuperDroid();
			break;
		case SNIPER_DROID:
			droid = new SniperDroid();
			break;
		}	
    	return droid; 	
    }   
}
