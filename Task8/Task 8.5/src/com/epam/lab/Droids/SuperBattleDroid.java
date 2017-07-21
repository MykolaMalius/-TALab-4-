package com.epam.lab.Droids;
import org.apache.log4j.Logger;
import com.epam.lab.Adapter.SupportAdapter;

public class SuperBattleDroid implements SupportDroid{
	private static final Logger LOG = Logger.getLogger(SuperBattleDroid.class);	
	SupportAdapter supportAdapter;	
	@Override
	public void setType(String type) {
	 if(type.equalsIgnoreCase("MeidcDroid")){
		 LOG.info("You choose new type of droid" + type);
	 }
	 else if(type.equalsIgnoreCase("AssaultDroid")||type.equalsIgnoreCase("SniperDroid")){
		 supportAdapter = new SupportAdapter(type);
		 supportAdapter.support(type);
	 }
	}
	@Override
	public void support(String regenHealthLevel) {
	  LOG.info("Regen HealthLevel:"+ regenHealthLevel);		
	}
}
