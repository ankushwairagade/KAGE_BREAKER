package com.ankush.Kagebreaker.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "room_info")
@Entity
public class RoomInfo implements Serializable {

	
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "capacity")
    private Integer capacity;
    
    @Column(name = "is_monitor")
    private Boolean isMonitor;
    
    @Column(name = "config_setting")
    private String Configsetting;
    
    @Column(name = "room_name")
    private String roomName;
    
    @Column(name = "organizer_name")
    private String organizerName;
    
    @Column(name = "isEnble")
    private Boolean isEnable;
    
    @Column(name = "isAvailable")
    private Boolean isAvailable;
}
