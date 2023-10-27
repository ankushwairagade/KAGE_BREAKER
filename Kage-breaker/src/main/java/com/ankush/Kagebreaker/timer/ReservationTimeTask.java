package com.ankush.Kagebreaker.timer;

import java.util.PriorityQueue;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ankush.Kagebreaker.entities.RoomReservationDetail;
import com.ankush.Kagebreaker.pojo.LockObj;

public class ReservationTimeTask extends TimerTask{

	public static final long DELAY = 1000 * 60 * 2;

	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationTimeTask.class);

	private static final ConcurrentHashMap<String, PriorityQueue<RoomReservationDetail>> OVER_DUE_CHAT_BOT_TASK_QUEUE = new ConcurrentHashMap<String, PriorityQueue<RoomReservationDetail>>();
	private static final ConcurrentHashMap<String, LockObj> OVER_DUE_QUEUE_LOCK = new ConcurrentHashMap<String, LockObj>();

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
