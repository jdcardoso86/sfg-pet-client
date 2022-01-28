package ar.sfgpetclinic.bootstrap;

import ar.sfgpetclinic.model.Owner;
import ar.sfgpetclinic.model.Vet;
import ar.sfgpetclinic.services.OwnerService;
import ar.sfgpetclinic.services.VetService;
import ar.sfgpetclinic.services.map.OwnerServiceMap;
import ar.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Gerrini");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jorge");
        owner2.setLastName("Cardoso");

        System.out.println("Loaded Owners");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("JOhn");
        vet1.setLastName("Hopkins");

        vetService.save(vet1);

        System.out.println("Loaded Vets");






    }
}
