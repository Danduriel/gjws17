package com.badogic.drop;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class EventCreator {
	static ArrayList <MyEvent> neutralEvents = new ArrayList<MyEvent>();	
	static ArrayList <MyEvent> goodEvents = new ArrayList<MyEvent>(); 
	static ArrayList <MyEvent> badEvents = new ArrayList<MyEvent>();
	
	public EventCreator() {
		//Add neutral Events
		neutralEvents.add(new MyEvent("test neutral", // Event Name
									"test description neutral", // Event description
									0,0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
		neutralEvents.add(new MyEvent("test neutral", // Event Name
				"test description neutral", // Event description
				0,0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten

		
		
		
		//Add good Events
		goodEvents.add(new MyEvent("test good", // Event Name
									"test description good", // Event description
									0,0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
		
		//Add bad Events
		badEvents.add(new MyEvent("test bad", // Event Name
								"test description bad", // Event description
								0,0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
	}
	
	// arrayID 0 = neutral, 1 = good, 2 = bad
	public static MyEvent getEventValue(int arrayID) {
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
