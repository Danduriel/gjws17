package com.badogic.drop;

import java.util.concurrent.ThreadLocalRandom;

public class Gamesim {
	public Player player = new Player("Bob","male","monkey");
	public Temple temple = new Temple(400,5000,0);
	public int turn;
	public EventCreator eventCreator = new EventCreator();
	public myEvent tempEvent = new myEvent("","",0,0,0,0,0);
	public String dialog = "";
	
	
	public Gamesim(int turn) {	
		this.turn = turn;
	}
	
	public void update() {
		//F�hrt neues Random Event aus
		tempEvent = EventCreator.getEventValue(ThreadLocalRandom.current().nextInt(0,2));
		
		//Addiert Event Werte
		dialog = tempEvent.dialog;
		player.dynamite += tempEvent.dynamite;
		player.beer += tempEvent.beer;
		player.money += tempEvent.money;
		temple.zeal += tempEvent.zeal;
		temple.progress += tempEvent.progress;
		
				
		//Debug Code
		System.out.println("Update");
		System.out.println("Runde: " + turn);
		System.out.println(dialog);
		turn++;
	}
	
	public void getRandomEvent() {}

	public void updateAction() {}
	
	//public void performAction(Action action){}
	
	}
