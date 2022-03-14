package com.epam.engx.cleancode.naming.task2;

import java.util.Arrays;

public class User {

	protected boolean Admin = false;

	private String Birth;

	private String Name;

	private User[] subordinateArray;

	private int rating;

	public User(String sName, String dBirth, User[] subordinateArray) {
		this.Birth = dBirth;
		this.Name = sName;
		this.subordinateArray = subordinateArray;
	}

	@Override
	public String toString() {
		return "User [dateOfBirth=" + Birth + ", name=" + Name + ", isAdmin=" + Admin + ", subordinates="
				+ Arrays.toString(subordinateArray) + ", rating=" + rating + "]";
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
