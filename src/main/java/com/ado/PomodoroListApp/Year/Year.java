package com.ado.PomodoroListApp.Year;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Year {
	
	@Id
	private int year;

    public Year() {
    }

    public Year(int year) {
        this.year = year;
    }

    // GETTERS & SETTERS
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
