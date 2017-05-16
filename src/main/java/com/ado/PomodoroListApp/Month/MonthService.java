package com.ado.PomodoroListApp.Month;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonthService {

	@Autowired
	MonthRepository monthRepository;
	
	// getAll
	public List<Month> getAllMonths() {
		List<Month> monthList = new ArrayList<>();
		monthRepository.findAll().forEach(monthList :: add);
		return monthList;
	}
	
	// getOne
	public Month getMonth (int month) {
		return monthRepository.findOne(month);
	}
	
	// save
	public void saveMonth (Month month) {
		monthRepository.save(month);
	}
	
	// update
	public void updateMonth (Month month) {
		monthRepository.save(month);
	}
	
	// delete
	public void deleteMonth (int month) {
        monthRepository.delete(month);
	}
}
