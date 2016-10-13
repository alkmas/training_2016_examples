package com.training2016.examples.students;

public enum Discipline {
	databases(true), discreteMath(true), foreignLanguage(false), history(false), mathematics(true), modeling(false), physics(true), economy(false);
	
	private boolean thisInt;
	
	private Discipline(boolean thisInt) {
		this.thisInt = thisInt;
	}

	public boolean isThisInt() {
		return thisInt;
	}

}

