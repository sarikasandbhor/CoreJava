package com.practice;

import com.practice.blog.Website;

public class Main {

	public static void main(String[] args) {
		Website website = new Website();			//Imported blog package
		website.usedFor();
		
		//java will not allow to import platform pacakge
		com.practice.platform.Website website1 = new com.practice.platform.Website();
		website1.usedFor();

	}

}
