package com.badogic.drop;

public class APCreator {
	public APCreator() {
		MyAP myAP = new MyAP("","",0,0,0,0,0,0,0);
	}
	
	//Dummy ButtonFunktion
	public MyAP clickBeerButton(){
		MyAP tempAP = new MyAP("Party schmeiﬂen","Versuche die eifrigen Affen zu verkatern",0,5,20,0,10,-50,-50);
		
		return tempAP;
	}
}
