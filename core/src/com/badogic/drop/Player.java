package com.badogic.drop;

public class Player {
	
	public int dynamite;
	public int beer;
	public int money; 
	public String name; 
	public String gender; 
	public String race;
	public double might; 
	
	public Player(String name, String gender, String race) {
		this.beer = 0;
		this.dynamite = 0;
		this.money = 100;
		this.name = name;
		this.gender = gender;
		this.race = race;
		this.might = 1.0;			
	}
			



}
