import java.util.ArrayList;

import java.util.List;

public class PetArmazena {
	private List<Pet> pets;

    public PetArmazena() {
        this.pets = new ArrayList<>();
    }

    public void salvarPet(Pet pets) {
        this.pets.add(pets);
    }

    public List<Pet> getPets() {
        return pets;
    }
}
