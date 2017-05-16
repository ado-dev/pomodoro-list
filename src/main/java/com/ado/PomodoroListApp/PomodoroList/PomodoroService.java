package com.ado.PomodoroListApp.PomodoroList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PomodoroService {

    @Autowired
    PomodoroRepository pomodoroListRepository;

    public List<Pomodoro> getAllPomodoros() {
        List<Pomodoro> pomodoros = new ArrayList<>();
        pomodoroListRepository.findAll().forEach(pomodoros :: add);
        return pomodoros;
    }

    public Pomodoro getPomodoro(long id) {
        return pomodoroListRepository.findOne(id);
    }

    public void savePomodoro(Pomodoro pomodoro) {
        pomodoroListRepository.save(pomodoro);
    }

    public void updatePomodoro(Pomodoro pomodoro) {
        pomodoroListRepository.save(pomodoro);
    }

    public void deletePomodoro(long id) {
        pomodoroListRepository.delete(id);
    }
}