package asu.edu.diging.tutorial.spring.service;

import asu.edu.diging.tutorial.spring.domain.Mood;

public interface IMoodService {
	public Mood getCurrentMood();
	public String getReasonForMood(String feeling);
}
