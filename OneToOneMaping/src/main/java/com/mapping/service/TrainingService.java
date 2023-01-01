package com.mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.entities.Training;
import com.mapping.entities.TrainingDto;
import com.mapping.repository.TrainingRepository;

@Service
public class TrainingService {

	@Autowired
	private TrainingRepository trainingRepository;
	
	//get Training
	public List<TrainingDto> getTraining()
	{
	
		List<TrainingDto> list=new ArrayList<>();
		List<Training> training = trainingRepository.findAll();
		for (Training training2 : training) 
		{
			TrainingDto trainingDto=new TrainingDto();
			trainingDto.setId(training2.getId());
		    trainingDto.setTrainingName(training2.getTrainingName());
		    trainingDto.setStudent(training2.getStudent());
		    list.add(trainingDto);
		
		}
		System.out.println(list);
		return list; 
	}
	
	//add
	public void addTraining(Training training)
	{
		
		trainingRepository.save(training);
	
	}
	//delete 
	public void deleteTraining(int id)
	{
		
		trainingRepository.deleteById(id);
	
	}
	//update 
	public void updateTraining(Training training)
	{
		
		Training training2=trainingRepository.findById(training.getId());
		training2.setTrainingName(training.getTrainingName());
		trainingRepository.save(training2);
	
	}
	
	
}
