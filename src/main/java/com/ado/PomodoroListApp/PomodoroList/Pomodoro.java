package com.ado.PomodoroListApp.PomodoroList;

import com.ado.PomodoroListApp.Day.Day;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pomodoro {

	@Id
	private long id;
	private int timeWorkingMinutes;
	private int timeRestingMinutes;

	@ManyToOne
	private Day day;

    public Pomodoro() {

    }

    public Pomodoro(long id, int timeWorkingMinutes, int timeRestingMinutes, Day day) {
        this.id = id;
        this.timeWorkingMinutes = timeWorkingMinutes;
        this.timeRestingMinutes = timeRestingMinutes;
        this.day = day;
    }

    // GETTERS & SETTERS

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getTimeWorkingMinutes() {
		return timeWorkingMinutes;
	}

	public void setTimeWorkingMinutes(int timeWorkingMinutes) {
		this.timeWorkingMinutes = timeWorkingMinutes;
	}

	public int getTimeRestingMinutes() {
		return timeRestingMinutes;
	}

	public void setTimeRestingMinutes(int timeRestingMinutes) {
		this.timeRestingMinutes = timeRestingMinutes;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}
	
	
	
}
