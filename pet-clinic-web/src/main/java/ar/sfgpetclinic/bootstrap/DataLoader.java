package ar.sfgpetclinic.bootstrap;

import ar.sfgpetclinic.model.Owner;
import ar.sfgpetclinic.model.Pet;
import ar.sfgpetclinic.model.PetType;
import ar.sfgpetclinic.model.Vet;
import ar.sfgpetclinic.services.OwnerService;
import ar.sfgpetclinic.services.PetTypeService;
import ar.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        owner1.setLastName("Star");
        owner1.setAddress("25 Readwin Crescent, RG40 5BD");
        owner1.setCity("Wokingham");
        owner1.setTelephoneNumber("07789928238");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jorge");
        owner2.setLastName("Cardoso");
        owner2.setAddress("31 Wintney Street, GU51 1AL");
        owner2.setCity("Fleet");
        owner2.setTelephoneNumber("07789928239");

        Pet jorgePet = new Pet();
        jorgePet.setPetType(savedCatPetType);
        jorgePet.setOwner(owner2);
        jorgePet.setBirthDate(LocalDate.of(2021,12,02));
        jorgePet.setName("Mimi");
        owner2.getPets().add(jorgePet);


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
