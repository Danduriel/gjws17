package com.badogic.drop;

public class MyEvent {
	// Variablen der Klasse
	public String name,description = "";
	public int dynamite,beer,zeal,money,progress,might,ap = 0;
	
	//Konstruktor Events
	public MyEvent(String name, String description, 
					int dynamite, int beer, int money, int might, int ap, 
					int zeal, int progress)
	{

		
		//Event
		this.name = name;
		this.description = description;
		
		//Player
		this.dynamite = dynamite;
		this.beer = beer;
		this.money = money;
		this.might = might;
		this.ap = ap;
		
		//Temple
		this.zeal = zeal;
		this.progress = startProgress;
	}
	
	
}
