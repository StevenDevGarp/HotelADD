/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.repository;

import com.HotelADD.entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bonni
 */
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long>{
    
}
