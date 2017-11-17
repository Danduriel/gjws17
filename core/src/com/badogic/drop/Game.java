package com.badogic.drop;

public class Game {
	public double zeal;
	public int maxProgress;
	public int progress;
	public int turn;
	
	
	public Game(double zeal, int max, int prog, int turn) 
	{
		this.zeal = zeal;
		this.maxProgress = max;
		this.progress = prog;
		this.turn = turn;
	}
	
	public void update() {
		
		turn++;
	}
	public void getEvents() {}
	

}
