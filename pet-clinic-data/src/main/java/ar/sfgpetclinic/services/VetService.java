package ar.sfgpetclinic.services;


import ar.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByLastName(String LastName);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
