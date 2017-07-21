package com.epam.lab.Adapter;
import org.apache.log4j.Logger;

import com.epam.lab.Droids.AssaultDroid;
import com.epam.lab.Droids.BattleDroid;
import com.epam.lab.Droids.SniperDroid;
import com.epam.lab.Droids.SupportDroid;

public class SupportAdapter implements SupportDroid {
	private static final Logger LOG = Logger.getLogger(SupportAdapter.class);	
	BattleDroid SuperDroid;
    public SupportAdapter(String type){
    	if(type.equalsIgnoreCase("AssaultDroid")){
    		SuperDroid = new AssaultDroid();
    	}else if(type.equals("SniperDroid")){
    		SuperDroid = new SniperDroid();
    	}   	
    }
	@Override
	public void support(String regenHealthLevel) {
		LOG.info("SuperDroid regen healthLevel");
	}
	@Override
	public void setType(String type) {
		if(type.equalsIgnoreCase("AssaultDroid")){
			SuperDroid.attack();
			}
		else if(type.equalsIgnoreCase("SniperDroid")){
			SuperDroid.attack();
		}
	}
}
