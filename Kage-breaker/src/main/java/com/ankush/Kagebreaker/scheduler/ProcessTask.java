package com.ankush.Kagebreaker.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ankush.Kagebreaker.entities.RoomReservationDetail;

public class ProcessTask implements Runnable{

	private static Logger logger = LoggerFactory.getLogger(ProcessTask.class);

	private RoomReservationDetail message;
	

	public ProcessTask(RoomReservationDetail message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	//	checks krna hai present or not
		
		
	}

}
