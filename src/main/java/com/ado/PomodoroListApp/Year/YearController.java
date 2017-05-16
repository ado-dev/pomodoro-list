package com.ado.PomodoroListApp.Year;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class YearController {

	@Autowired
    YearService yearService;
	
	// getAll
	@RequestMapping (value="/years", method = RequestMethod.GET)
	public List<Year> getAllYears() {
		return yearService.getAllYears();
	}
	
	// getOne
	@RequestMapping (value="/years/{id}", method = RequestMethod.GET)
	public Year getYear (@PathVariable int year) {
		return yearService.getYear(year);
	}
	
	// save
	@RequestMapping (value="/years", method = RequestMethod.POST)
	public void saveYear (@RequestBody Year year) {
		yearService.saveYear(year);
	}
	
	// update
	@RequestMapping (value = "/years/{id}", method = RequestMethod.PUT)
	public void updateYear (@RequestBody Year yearObj) {
		yearService.updateYear(yearObj);
	}
	
	// delete
	@RequestMapping (value ="/years/{id}", method = RequestMethod.DELETE)
	public void deleteYear(int year) {
		yearService.deleteYear(year);
	}
}
