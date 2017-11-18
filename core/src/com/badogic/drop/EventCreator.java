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
									"test description neutral", // Event description
									0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress
		//Add good Events
		goodEvents.add(new myEvent("test good", // Event Name
									"test description good", // Event description
									0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress
		
		//Add bad Events
		badEvents.add(new myEvent("test bad", // Event Name
								"test description bad", // Event description
								0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress
	}
	
	// arrayID 0 = neutral, 1 = good, 2 = bad
	public static myEvent getEventValue(int arrayID) {
		switch(arrayID) {
		case 0: {
				return neutralEvents.get(ThreadLocalRandom.current().nextInt(0, neutralEvents.size()));
			}
		case 1: {
				return goodEvents.get(ThreadLocalRandom.current().nextInt(0, goodEvents.size()));
			}
		case 2: {
				return badEvents.get(ThreadLocalRandom.current().nextInt(0, badEvents.size()));
			}
		default: {
				return neutralEvents.get(0);
			}
		}
	}
}
