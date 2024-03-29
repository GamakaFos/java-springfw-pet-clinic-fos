package com.example.petClinicFosApplication.services;

import com.example.petClinicFosApplication.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName (String lastName);
}
