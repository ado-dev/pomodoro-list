package com.ado.PomodoroListApp.Day;

import com.ado.PomodoroListApp.Month.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DayController {

    @Autowired
    DayService dayService;

    @RequestMapping (value = "/years/{yearId}/months/{id}/days", method = RequestMethod.GET)
    public List<Day> getAllDays() {
        return dayService.getAllDays();
    }

    @RequestMapping (value = "/years/{yearId}/months/{monthId}/days/{id}", method = RequestMethod.GET)
    public Day getDay(@PathVariable int id) {
        return dayService.getDay(id);
    }

    @RequestMapping (value = "/years/{yearId}/months/{monthId}/days", method = RequestMethod.POST)
    public void saveDay(@RequestBody Day day, @PathVariable int monthId) {
        Month month = new Month();
        month.setMonthNum(monthId);
        String nameOfMonth = "";

        switch (monthId) {
            case 1:
                nameOfMonth = "January";
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth = "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;
            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "December";
                break;
            default:
                break;
        }

        month.setMonthName(nameOfMonth);
        day.setMonth(month);
        dayService.saveDay(day);
    }

    @RequestMapping (value= "/years/{yearId}/months/{id}/days", method = RequestMethod.PUT)
    public void updateDay(@RequestBody Day day) {
        dayService.updateDay(day);
    }

    @RequestMapping (value= "/years/{yearId}/months/{monthId}/days/{id}", method = RequestMethod.DELETE)
    public void deleteDay(@PathVariable int id) {
        dayService.deleteDay(id);
    }
}
