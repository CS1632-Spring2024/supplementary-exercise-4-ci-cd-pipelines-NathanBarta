package edu.pitt.cs;

public class CatImpl implements Cat {
	private int id = -1;
	private String name;
	private boolean rented = false;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Rent cat. Simply sets the _rented flag to true.
	 */
	public void rentCat() {
		this.rented = true;
	}

	/**
	 * Return cat. Simply sets the _rented flag to false.
	 */
	public void returnCat() {
		this.rented = false;
	}

	/**
	 * Rename cat. Simply sets the name to the new name.
	 * 
	 * @param String name New name of the cat
	 */
	public void renameCat(String name) {
		this.name = name;
	}

	/**
	 * Accessor for _name variable. Returns the name of this cat.
	 * 
	 * @return String name of cat
	 */

	public String getName() {
		return this.name; // java strings are immutable, so I don't forsee issues doing this...
	}

	/**
	 * Accessor for _id variable. Returns the ID of this cat.
	 * 
	 * @return int ID of this cat
	 */

	public int getId() {
		return this.id;
	}

	/**
	 * Accessor for _rented variable. Returns if cat is rented.
	 * 
	 * @return boolean - true if rented, false otherwise
	 */

	public boolean getRented() {
		return this.rented;
	}

	/**
	 * Returns string version of this cat, in form: "ID *id_num*. *name*" Example
	 * for cat of ID 1, name Jennyanydots: "ID 1. Jennyanydots"
	 * 
	 * @return String string version of cat
	 */

	public String toString() {
		return "ID " + this.id + ". " + this.name;
	}

}