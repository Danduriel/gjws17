package com.badogic.drop;

public class Player {
	
	public int dynamite;
	public int beer;
	public int money; 
	public String name; 
	public String gender; 
	public String race;
	public int might; 
	public int ap;
	
	public Player(String name, String gender, String race) {
		this.dynamite = 0;
		this.beer = 0;
		this.money = 100;
		this.name = name;
		this.gender = gender;
		this.race = race;
		this.might = 1;
		this.ap = 10;
	}
			
	public void update(int dynamite, int beer, int money, int might,int ap) {
		this.dynamite += dynamite;
		this.beer += beer;
		this.money += money;
		this.might += might;
		this.ap += ap;
	}



}
