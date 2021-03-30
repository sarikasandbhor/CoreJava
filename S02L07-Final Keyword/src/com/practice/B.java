package com.practice;

public class B extends A{
	/**No setters method required,
	 * reassignment of variable is not possible*/
	public final int finalVar;

	public B(int finalVar) {
		super();
		this.finalVar = finalVar;
	}

	public int getFinalVar() {
		return finalVar;
	}

	@Override
	public void india() {
		// TODO Auto-generated method stub
		super.india();
	}
	
	
	
}
