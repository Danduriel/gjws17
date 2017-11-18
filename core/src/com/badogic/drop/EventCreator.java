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

		
		//Add good Events
		goodEvents.add(new MyEvent("test good", // Event Name
									"test description good", // Event description
									0,0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
		
		
		//Add good Events
		goodEvents.add(new MyEvent("Dynamit LKW hat Last verloren", // Event Name
									"Ein vorbeifahrender LKW hat Dynamit verloren, ja im Jungel fahren LKWs.", // Event description
									+4,0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
		
		//Add good Events
		goodEvents.add(new MyEvent("Zeppelinabsturz", // Event Name
									"Die Hindenburg 3.1 ist nahe deines Lagers abgestürzt und hat Güter verloren.", // Event description
									0,+5,+6,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
		
		//Add good Events
		goodEvents.add(new MyEvent("Flussschwemme", // Event Name
											"Der naheliegende Fluss ist überschwemmt und hat Bierfässer mitgetragen.", // Event description
											0,+4,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
				
		//Add good Events
		goodEvents.add(new MyEvent("Local Outlet Sale", // Event Name
											"Das Sprengstoff Outlet deiner Wahl hatte einen Sale", // Event description
											+5,0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
				

		//Add good Events
		goodEvents.add(new MyEvent("B-Ware", // Event Name
									"Dein Sprengstoff-Guy schenkt dir als Treuebonus etwas B-Ware", // Event description
									+2,0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten

		//Add good Events
		goodEvents.add(new MyEvent("Gnädige Delphinsuperintelligenz", // Event Name
									"Die eigentliche Superintelligenz auf der Erde, aka. Delphine, unterstützen dich.", // Event description
									+5,0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten

		//Add good Events
		goodEvents.add(new MyEvent("Geheime Elfentechonologie", // Event Name
									"Ein Zug, ja ein Zug im Jungel, wirft dir Sprengstoff ab. Choo Choo.", // Event description
									+4,0,0,0,0,0,0)); 		// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
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
