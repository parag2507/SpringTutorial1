package asu.edu.sd.spring.service;

import asu.edu.sd.spring.domain.Mood;

public interface IMoodService {
	public Mood getCurrentMood();
	public String getReasonForMood(String feeling);
}
