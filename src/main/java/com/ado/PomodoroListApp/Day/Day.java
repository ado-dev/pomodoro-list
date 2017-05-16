package com.ado.PomodoroListApp.Day;

import com.ado.PomodoroListApp.Month.Month;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Day {
	
	@Id
	private int day;

	@ManyToOne
	private Month month;

    public Day() {
    }

    public Day(int day) {
        this.day = day;
    }

    // GETTERS & SETTERS

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}
	
	
}
