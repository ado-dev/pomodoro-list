package com.ado.PomodoroListApp.Month;

import com.ado.PomodoroListApp.Year.Year;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Month {

	@Id
    private int monthNum;
    private String monthName;

	@ManyToOne
    private Year year;



    public Month() {
    }

    public Month(int monthNum, Year year, String monthName) {
        this.monthNum = monthNum;
        this.year = year;
        this.monthName = monthName;
    }

    // GETTERS & SETTERS


    public int getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(int monthNum) {
        this.monthNum = monthNum;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}
		
}
