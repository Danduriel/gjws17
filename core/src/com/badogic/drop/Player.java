package com.badogic.drop;

public class Player {
	
	public int geld; 
	public String name; 
	public String gender; 
	public String race;
	public double might; 
	
	public Player(String name, String gender, String race) {
		this.geld = 100;
		this.name = name;
		this.gender = gender;
		this.race = race;
		this.might = 1.0;
					
	}

}
