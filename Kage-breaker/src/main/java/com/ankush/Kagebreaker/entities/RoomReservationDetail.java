package com.ankush.Kagebreaker.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "room_reservation_detail")
@Entity
public class RoomReservationDetail implements Serializable {

	
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "roomInfoId")
    private Integer roomInfoId;
    
    @Column(name = "check_in")
    private Timestamp checkIn;

    @Column(name = "check_out")
    private Timestamp checkOut;
    
    @Column(name = "guest_list")
    private String guestList;
    
    @Column(name = "organizer_name")
    private String organizerName;
    
    @Column(name = "findings")
    private String findings;
    
    @Column(name = "agenda")
    private String agenda;
    
    @Column(name = "related_department")
    private String relatedDepartment;

    @Column(name = "total_duration")
    private long totalDuration;
    
    
}
