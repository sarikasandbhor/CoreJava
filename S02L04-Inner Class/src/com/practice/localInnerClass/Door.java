package com.practice.localInnerClass;

public class Door {
	public boolean isLocked(String key)
	{
		/**Local Inner Class*/
		class Lock{									//Scope of class Lock is inside isLocked() method only
			public boolean isLocked(String key) {
				if(key.equals("qwerty"))
				{
					return false;
				}
				else {
					return true;
				}
				
			}
		}
		return new Lock().isLocked(key);
	}
}
