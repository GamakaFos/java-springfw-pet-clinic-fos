package com.example.petClinicFosApplication.services;

import com.example.petClinicFosApplication.data.Pet;

import java.util.Set;

public interface Vet {

    Vet findById (Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
