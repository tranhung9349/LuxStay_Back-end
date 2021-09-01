package com.codegym.luxstay.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Getter @Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private LocalDate startDate;
    @NotBlank
    private LocalDate endDate;
    @NotBlank
    private String userFullName;
    @NotBlank
    private String userPhoneNums;
    private String orderStatus;

    private Double totalPaid;

    private Double rating;

    private String comment;
    private Boolean checkIn;

    @ManyToOne
    private User user;

    @ManyToOne
    private Apartment apartment;

    public Order(LocalDate startDate, LocalDate endDate, String userFullName, String userPhoneNums, String orderStatus, Double totalPaid, Double rating, String comment, Boolean checkIn, User user, Apartment apartment) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.userFullName = userFullName;
        this.userPhoneNums = userPhoneNums;
        this.orderStatus = orderStatus;
        this.totalPaid = totalPaid;
        this.rating = rating;
        this.comment = comment;
        this.checkIn = checkIn;
        this.user = user;
        this.apartment = apartment;
    }

    public Order() {
    }

    public Order(Long id, LocalDate startDate, LocalDate endDate, String userFullName, String userPhoneNums, String orderStatus, Double totalPaid, Double rating, String comment, Boolean checkIn, User user, Apartment apartment) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userFullName = userFullName;
        this.userPhoneNums = userPhoneNums;
        this.orderStatus = orderStatus;
        this.totalPaid = totalPaid;
        this.rating = rating;
        this.comment = comment;
        this.checkIn = checkIn;
        this.user = user;
        this.apartment = apartment;
    }
}
