package com.practice.anonymousInnerClass;

abstract class Lock{
	public abstract boolean isUnlocked(String key);
	public void test() {
		System.out.println("Test");
	}
}
public class Door {
	/**Abstract class which is hidden from outside world and we can implement its methods
	 * by creating object of class and adding unimplemented methods inside it*/
	Lock lock = new Lock() {						//Anonymous inner class

		@Override
		public boolean isUnlocked(String key) {
			if(key.equals("qwerty"))
			{
				return true;
			}
			else {
				return false;
			}
		}
		
		/*
		 * public Lock getLock(Lock lock) { return lock; }
		 */
	};
	
}
