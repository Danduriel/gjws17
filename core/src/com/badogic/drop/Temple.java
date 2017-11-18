package com.badogic.drop;

public class Temple {
	public int zeal;
	public int maxProgress;
	public int progress;
	
	public Temple (int zeal, int maxProgress, int progress) {
		this.zeal = zeal;
		this.maxProgress = maxProgress;
		this.progress = progress;
	}
	
	public void update(int zeal, int progress) {
		this.zeal += zeal;
		this.progress += progress;
	}
}
