package ar.sfgpetclinic.services;

import ar.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String LastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
