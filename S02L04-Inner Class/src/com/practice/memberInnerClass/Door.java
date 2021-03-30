package com.practice.memberInnerClass;

public class Door {
	public Lock lock;
	
	public Door() {
		lock = new Lock(true);
	}
	
	public void shopStatus() {
		if(lock.isLock())
		{
			System.out.println("Shop is closed");
		}
		else {
			System.out.println("Welcome");
		}
	}
	class Lock{
		private boolean lock;

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}

		public Lock(boolean lock) {
			this.lock = lock;
		}
		
	}
}
