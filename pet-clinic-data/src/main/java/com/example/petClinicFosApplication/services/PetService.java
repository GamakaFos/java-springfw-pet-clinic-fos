package com.example.petClinicFosApplication.services;

import com.example.petClinicFosApplication.data.Owner;
import com.example.petClinicFosApplication.data.Pet;

import java.util.Set;

public interface PetService {

    Pet findById (Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
