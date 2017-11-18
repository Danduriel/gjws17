package com.badogic.drop;

public class Attributes {
	public String dialog = "";
	public int dynamite,beer,zeal,money,progress = 0;
	
	public Attributes(String startDialog, int startDynamite, int startBeer, int startZeal, int startMoney, int startProgress){
		dialog = startDialog;
		dynamite = startDynamite;
		beer = startBeer;
		zeal = startZeal;
		money = startMoney;
		progress = startProgress;
	}
	
	public void setDialog(String newValue) {
		dialog = newValue;
	}
	
	public void setDynamite(int newValue) {
		dynamite = newValue;
	}
	
	public void setBeer(int newValue) {
		beer = newValue;
	}
	
	public void setZeal(int newValue) {
		zeal = newValue;
	}
	
	public void setMoney(int newValue) {
		money = newValue;
	}
	
	public void setProgress(int newValue) {
		progress = newValue;
	}
}
