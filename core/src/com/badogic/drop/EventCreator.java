package com.badogic.drop;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class EventCreator {
	static ArrayList <myEvent> neutralEvents = new ArrayList<myEvent>();	
	static ArrayList <myEvent> goodEvents = new ArrayList<myEvent>(); 
	static ArrayList <myEvent> badEvents = new ArrayList<myEvent>();
	
	public EventCreator() {
		//Add neutral Events
		neutralEvents.add(new myEvent("test neutral", // Event Name
									"test dialog neutral", // Event Dialog
									0,0,0,0,0)); // Dynamite, Beer, Zeal, Money, Progress
		//Add good Events
		goodEvents.add(new myEvent("test good", // Event Name
									"test dialog good", // Event Dialog
									0,0,0,0,0)); // Dynamite, Beer, Zeal, Money, Progress
		
		//Add bad Events
		badEvents.add(new myEvent("test bad", // Event Name
								"test dialog bad", // Event Dialog
								0,0,0,0,0)); // Dynamite, Beer, Zeal, Money, Progress
	}
	
	// arrayID 0 = neutral, 1 = good, 2 = bad
	public static myEvent getEventValue(int arrayID) {
		switch(arrayID) {
		case 0: {
				return neutralEvents.get(ThreadLocalRandom.current().nextInt(0, neutralEvents.size() + 1));
			}
		case 1: {
				return goodEvents.get(ThreadLocalRandom.current().nextInt(0, goodEvents.size() + 1));
			}
		case 2: {
				return badEvents.get(ThreadLocalRandom.current().nextInt(0, badEvents.size() + 1));
			}
		default: {
				return neutralEvents.get(0);
			}
		}
	}
}
