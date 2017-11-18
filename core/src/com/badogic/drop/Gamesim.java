package com.badogic.drop;

import java.util.concurrent.ThreadLocalRandom;

public class Gamesim {
	public Player player = new Player("Bob","male","monkey");
	public Temple temple = new Temple(400,5000,0);
	public int turn;
	public EventCreator eventCreator = new EventCreator();
	public myEvent tempEvent = new myEvent("","",0,0,0,0,0,0,0);
	public String dialog = "";
	
	
	public Gamesim(int turn) {	
		this.turn = turn;
	}
	
	public void update() {
		//Fuehrt neues Random Event aus
		getRandomEvent();
		
		//Addiert Event Werte
		dialog = tempEvent.description;
		
		player.update(tempEvent.dynamite, tempEvent.beer, tempEvent.money,tempEvent.might, tempEvent.ap);
		temple.update(tempEvent.zeal, tempEvent.progress);
		
		//Debug Code
		System.out.println("Update");
		System.out.println("Runde: " + turn);
		System.out.println(dialog);
		turn++;
	}
	
	public void getRandomEvent() {
		tempEvent = EventCreator.getEventValue(ThreadLocalRandom.current().nextInt(0,3));
	}	
}
