package com.badogic.drop;

import java.util.concurrent.ThreadLocalRandom;

public class Gamesim {
	

	public int turn;
	public EventCreator EventCreator = new EventCreator();
	public myEvent tempEvent = new myEvent("","",0,0,0,0,0);
	public String dialog = "";
	
	
	public Gamesim(double zeal, int max, int prog, int turn) {	
		this.turn = turn;
	}
	
	public void update() {
		//Führt neues Random Event aus
		tempEvent = EventCreator.getEventValue(ThreadLocalRandom.current().nextInt(0,2+1));
		dialog = tempEvent.dialog;
		
				
				
				
		System.out.println("Update");
		System.out.println("Runde: " + turn);
		turn++;
	}
	
	public void getRandomEvent() {}

	public void updateAction() {}
	
	//public void performAction(Action action){}
	
	}
