package ar.sfgpetclinic.bootstrap;

import ar.sfgpetclinic.model.Owner;
import ar.sfgpetclinic.model.PetType;
import ar.sfgpetclinic.model.Vet;
import ar.sfgpetclinic.services.OwnerService;
import ar.sfgpetclinic.services.PetTypeService;
import ar.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;



    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);



        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Gerrini");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jorge");
        owner2.setLastName("Cardoso");

        System.out.println("Loaded Owners");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("JOhn");
        vet1.setLastName("Hopkins");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Dan");
        vet2.setLastName("Goncalves");

        vetService.save(vet2);

        System.out.println("Loaded Vets");






    }
}
