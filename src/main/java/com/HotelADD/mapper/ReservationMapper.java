/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.ReservationDto;
import com.HotelADD.entity.ReservacionEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {ClientMapper.class, CompanyClientMapper.class, RoomMapper.class, ServiceMapper.class})
public interface ReservationMapper {
    @Mappings({
        @Mapping(source = "reservacionNumero", target = "reservationNumber"),
        @Mapping(source = "reservacionFechaInicio", target = "reservationEntry"),
        @Mapping(source = "reservacionFechaFin", target = "reservationExit"),
        @Mapping(source = "reservacionHuespedAdulto", target = "reservationAdult"),
        @Mapping(source = "reservacionNinio", target = "reservationKid"),
        @Mapping(source = "clienteParticularFk", target = "client"),
        @Mapping(source = "clienteEmpresaFk", target = "companyClient"),
        @Mapping(source = "habitacionFk", target = "room"),
        @Mapping(source = "serivicioFk", target = "service")
    })
    ReservationDto toReservation(ReservacionEntity reservacion);
    
    @InheritInverseConfiguration          
    ReservacionEntity toReservacion(ReservationDto reservation);
}
