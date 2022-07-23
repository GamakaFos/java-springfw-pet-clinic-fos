package com.example.petClinicFosApplication.services;

import com.example.petClinicFosApplication.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById (Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
