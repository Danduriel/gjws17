package com.badogic.drop;

public class myEvent {
	// Variablen der Klasse
	public String name,dialog = "";
	public int dynamite,beer,zeal,money,progress = 0;
	
	//Konstruktor Events
	public myEvent(String startName, String startDialog, int startDynamite, int startBeer, int startZeal, int startMoney, int startProgress){
		this.name = startName;
		this.dialog = startDialog;
		this.dynamite = startDynamite;
		this.beer = startBeer;
		this.zeal = startZeal;
		this.money = startMoney;
		this.progress = startProgress;
	}
	
	
}
