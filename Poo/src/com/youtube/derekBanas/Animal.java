package com.youtube.derekBanas;

import java.util.Scanner;

public class Animal {
	
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userInput = new Scanner(System.in);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}
	
	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 100000;
		
		this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1 ));
	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	public void setFavoriteChar() {
		int randomNumber = (int) ( Math.random() * 126 ) + 1;
		
		this.favoriteChar = (char) randomNumber;
		
		if(randomNumber == 32) {
			System.out.println( "Favorite character set to Space!" );
		} else if(randomNumber == 10) {
			System.out.println( "Favorite character set to Newline!" );
		} else {
			System.out.println( "Favorite character set to " + this.favoriteChar );
		}
		
		if(((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))) {
			System.out.println( "Favorite character is a letter." );
		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public Animal() {
		numberOfAnimals++;
		
		System.out.print("Enter the name: \n");
		
		if(userInput.hasNextLine()) {
			this.setName(userInput.nextLine());
		}
	}

	public static void main(String[] args) {
		
		Animal theAnimal = new Animal();
		
		
		
	}
	

}
