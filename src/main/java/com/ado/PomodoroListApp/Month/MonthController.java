package com.ado.PomodoroListApp.Month;

import java.util.List;

import com.ado.PomodoroListApp.Year.Year;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MonthController {

	@Autowired
	MonthService monthService;
	
	// getAll
	@RequestMapping (value = "/years/{id}/months", method = RequestMethod.GET)
	public List<Month> getAllMonths() {
        return monthService.getAllMonths();
	}

	// getOne
    @RequestMapping (value= "/years/{yearId}/months/{id}", method = RequestMethod.GET)
    public Month getMonth(@PathVariable int month) {
	    return monthService.getMonth(month);
    }

    // save
    @RequestMapping (value= "/years/{yearId}/months", method = RequestMethod.POST)
    public void saveMonth (@RequestBody Month month, @PathVariable int yearId) {
        Year year = new Year(yearId);
        month.setYear(year);
	    monthService.saveMonth(month);
    }

    // update
    @RequestMapping (value= "/years/{yearId}/months/{id}", method = RequestMethod.PUT)
    public void updateMonth (@RequestBody Month month) {
	    monthService.updateMonth(month);
    }

    // delete
    @RequestMapping (value= "/years/{yearId}/months/{id}", method = RequestMethod.DELETE)
    public void deleteMonth (@PathVariable int id) {
	    monthService.deleteMonth(id);
    }
}
