package com.badogic.drop;

public class Gamesim {
	
	public double zeal;
	public int maxProgress;
	public int progress;
	public int turn;
	
	
	public Gamesim(double zeal, int max, int prog, int turn) {
		this.zeal = zeal;
		this.maxProgress = max;
		this.progress = prog;
		this.turn = turn;
	}
	
	public void update() {
		System.out.println("Update");
		turn++;
	}
	
	public void getRandomEvent() {}

	public void updateAction() {}
	
	//public void performAction(Action action){}
	
	}
