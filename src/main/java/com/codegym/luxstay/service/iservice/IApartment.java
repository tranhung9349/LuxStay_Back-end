package com.codegym.luxstay.service.iservice;

import com.codegym.luxstay.model.Apartment;
import com.codegym.luxstay.service.IGeneralService;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public interface IApartment extends IGeneralService<Apartment> {
    Iterable<Apartment> findAllByNameContaining(String name);
    Iterable<Apartment> findAllByStatusContaining(String status);
    Iterable<Apartment> findAllByPriceContaining(String price);
    Iterable<Apartment> findAllByApartmentTypeContaining(String type);
    Iterable<Apartment> findAllByDescriptionContaining(String description);
    Iterable<Apartment> findTop5();
    Iterable<Apartment> findApartmentNotAvailable();
    Iterable<Apartment> findApartmentAvailable();
    Iterable<Apartment> findAllByUserId(long id);
    Iterable<Apartment> findAllByAddressContaining(@NotBlank @Size(min = 3) String address);
    Iterable<Apartment> findAllByCityContaining(@NotBlank String city);
    Iterable<Apartment> findAllByCityContainingAndDistrictContainingAndWardContaining(
            @NotBlank String city, @NotBlank String district, @NotBlank String ward);
    Iterable<Apartment> find8Newest();
}
