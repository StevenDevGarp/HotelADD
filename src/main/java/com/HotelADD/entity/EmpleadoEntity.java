/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author bonni
 */
@Data
@Entity
@Table(name = "Tb_Empleados")
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Empleado_Id")
    private Long empleadoId;
    
    @Column(name = "Empleado_Nombre1")
    private String empleadoNombre1;
    
    @Column(name = "Empleado_Nombre2")
    private String empleadoNombre2;
    
    @Column(name = "Empleado_Nombre3")
    private String empleadoNombre3;
    
    @Column(name = "Empleado_Apellido1")
    private String empleadoApellido1;
    
    @Column(name = "Empleado_Apellido2")
    private String empleadoApellido2;
    
    @Column(name = "Empleado_Telefono")
    private String empleadoTelefono;
    
    @Column(name = "Empleado_Correo")
    private String empleadoCorreo;
    
    @OneToMany(mappedBy = "empleadoFk")
    private List<UsuarioEntity> usuario;

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getEmpleadoNombre1() {
        return empleadoNombre1;
    }

    public void setEmpleadoNombre1(String empleadoNombre1) {
        this.empleadoNombre1 = empleadoNombre1;
    }

    public String getEmpleadoNombre2() {
        return empleadoNombre2;
    }

    public void setEmpleadoNombre2(String empleadoNombre2) {
        this.empleadoNombre2 = empleadoNombre2;
    }

    public String getEmpleadoNombre3() {
        return empleadoNombre3;
    }

    public void setEmpleadoNombre3(String empleadoNombre3) {
        this.empleadoNombre3 = empleadoNombre3;
    }

    public String getEmpleadoApellido1() {
        return empleadoApellido1;
    }

    public void setEmpleadoApellido1(String empleadoApellido1) {
        this.empleadoApellido1 = empleadoApellido1;
    }

    public String getEmpleadoApellido2() {
        return empleadoApellido2;
    }

    public void setEmpleadoApellido2(String empleadoApellido2) {
        this.empleadoApellido2 = empleadoApellido2;
    }

    public String getEmpleadoTelefono() {
        return empleadoTelefono;
    }

    public void setEmpleadoTelefono(String empleadoTelefono) {
        this.empleadoTelefono = empleadoTelefono;
    }

    public String getEmpleadoCorreo() {
        return empleadoCorreo;
    }

    public void setEmpleadoCorreo(String empleadoCorreo) {
        this.empleadoCorreo = empleadoCorreo;
    }
    
}
