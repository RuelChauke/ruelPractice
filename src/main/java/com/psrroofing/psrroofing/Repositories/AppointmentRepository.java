package com.psrroofing.psrroofing.Repositories;

import com.psrroofing.psrroofing.Models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    List<Appointment> searchByAddress(String address);
    List<Appointment> searchByStatus(String status);

}
