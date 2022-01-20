package ar.sfgpetclinic.services;

import ar.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String LastName);

}
