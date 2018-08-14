package com.bridgelabz.userservice.sequence.dao;

import com.bridgelabz.userservice.sequence.exception.SequenceException;

public interface SequenceDao {

	String getNextSequenceId(String key) throws SequenceException;

}