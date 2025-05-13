package com.psrroofing.psrroofing.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column
    private LocalDateTime appointmentDate;

    @Column(nullable = false)
    private String serviceType;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private LocalDateTime appointmentDateTime;

    public Appointment() {

    }

    public Appointment(Long id, Customer customer, LocalDateTime appointmentDate, String serviceType, String status, String address, LocalDateTime appointmentDateTime) {
        this.id = id;
        this.customer = customer;
        this.appointmentDate = appointmentDate;
        this.serviceType = serviceType;
        this.status = status;
        this.address = address;
        this.appointmentDateTime = appointmentDateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }
}
