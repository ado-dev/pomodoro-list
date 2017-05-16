package com.ado.PomodoroListApp.PomodoroList;


import com.ado.PomodoroListApp.Day.Day;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PomodoroController {

    @Autowired
    PomodoroService pomodoroService;

    @RequestMapping (value = "/years/{yearId}/months/{monthId}/days/{dayId}/pomodoros", method = RequestMethod.GET)
    public List<Pomodoro> getAllPomodoros() {
        return pomodoroService.getAllPomodoros();
    }

    @RequestMapping (value = "/years/{yearId}/months/{monthId}/days/{dayId}/pomodoros/{id}", method = RequestMethod.GET)
    public Pomodoro getPomodoro(@PathVariable long id) {
        return pomodoroService.getPomodoro(id);
    }

    @RequestMapping (value = "/years/{yearId}/months/{monthId}/days/{dayId}/pomodoros", method = RequestMethod.POST)
    public void savePomodoro(@RequestBody Pomodoro pomodoro, @PathVariable int dayId) {
        Day day = new Day(dayId);
        pomodoro.setDay(day);
        pomodoroService.savePomodoro(pomodoro);
    }

    @RequestMapping (value = "/years/{yearId}/months/{monthId}/days/{dayId}/pomodoros/{id}", method = RequestMethod.PUT)
    public void updatePomodoro(@RequestBody Pomodoro pomodoro) {
        pomodoroService.savePomodoro(pomodoro);
    }

    @RequestMapping (value = "/years/{yearId}/months/{monthId}/days/{dayId}/pomodoros/{id}", method = RequestMethod.DELETE)
    public void deletePomodoro(@PathVariable long id) {
        pomodoroService.deletePomodoro(id);
    }


}
