package com.ado.PomodoroListApp.Year;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YearService {
	
	@Autowired
	YearRepository yearRepository;

	
	public List<Year> getAllYears() {
		List<Year> yearList = new ArrayList<>();
		yearRepository.findAll().forEach(yearList :: add);
		
		return yearList;
	}
	
	public Year getYear(int year) {
		return yearRepository.findOne(year);
	}
	
	public void saveYear(Year year) {
		yearRepository.save(year);
	}
	
	public void updateYear(Year year) {
		yearRepository.save(year);
	}
	
	public void deleteYear(int year) {
		yearRepository.delete(year);
	}

}
