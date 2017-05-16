package com.ado.PomodoroListApp.Day;

import com.ado.PomodoroListApp.Day.Day;
import com.ado.PomodoroListApp.Day.DayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DayService {

    @Autowired
    DayRepository dayRepository;

    public List<Day> getAllDays() {
        List<Day> daysList = new ArrayList<>();
        dayRepository.findAll().forEach(daysList :: add);
        return daysList;
    }

    public Day getDay(int day) {
        return dayRepository.findOne(day);
    }

    public void saveDay(Day day) {
        dayRepository.save(day);
    }

    public void updateDay(Day day) {
        dayRepository.save(day);
    }

    public void deleteDay(int day) {
        dayRepository.delete(day);
    }
}
