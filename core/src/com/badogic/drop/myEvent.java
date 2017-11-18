package com.badogic.drop;

public class myEvent {
	// Variablen der Klasse
	public String name,description = "";
	public int dynamite,beer,zeal,money,progress,might,ap = 0;
	
	//Konstruktor Events
	public myEvent(String startName, String startDescripton, 
					int startDynamite, int startBeer, int startMoney, int startMight, int startAP, 
					int startZeal, int startProgress)
	{

		
		//Event
		this.name = startName;
		this.description = startDescripton;
		
		//Player
		this.dynamite = startDynamite;
		this.beer = startBeer;
		this.money = startMoney;
		this.might = startMight;
		this.ap = startAP;
		
		//Temple
		this.zeal = startZeal;
		this.progress = startProgress;
	}
	
	
}
