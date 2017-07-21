package com.epam.lab.Main;
import org.apache.log4j.PropertyConfigurator;

import com.epam.lab.DroidsFactory.JediDroidsFactory;
import com.epam.lab.DroidsFactory.SithDroidsFactory;

public class Main {
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");	
		JediDroidsFactory jediFactory = new JediDroidsFactory();
		jediFactory.createBattleDroids().attack();
		
		SithDroidsFactory sithFactory = new SithDroidsFactory();
		sithFactory.createSupportDroids().support();
	}
}
