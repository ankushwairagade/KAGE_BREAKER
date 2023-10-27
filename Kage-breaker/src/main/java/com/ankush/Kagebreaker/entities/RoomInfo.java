package com.ankush.Kagebreaker.entities;

import java.io.Serializable;

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
    
    @Column(name = "isEnble")
    private Boolean isEnable;
    
    @Column(name = "isAvailable")
    private Boolean isAvailable;
}
