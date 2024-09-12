import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PetCadastro {
	private PetArmazena repo;
	public PetCadastro(PetArmazena repo) {
		this.repo = repo;
	}
	public Pet criarPet(Pet pet) {
		
    	if(!this.ValidarNome(pet.getNome())) {
    		return null;
    	}
    	if(!this.ValidarEspecie(pet.getEspecie())) {
    		return null;
    	}
    	
        this.repo.salvarPet(pet);
		return pet;
	}
	
	public boolean ValidarNome(String nome) {
    	String regex = "^(?=.*[a-zA-ZÀ-ÖØ-öø-ÿ])[a-zA-ZÀ-ÖØ-öø-ÿ\\s]{3,32}$";
        Pattern p = Pattern.compile(regex);
        
        Matcher m = p.matcher(nome);
        if (m.matches()) {
            return true;
        }
        return false;
    }
	
	public boolean ValidarEspecie(String especie) {
		String TodasAsEspecies[] = {"Cachorro","Gato","Papagaio","Hamster","Tartaruga"};
        for(int i = 0; i < TodasAsEspecies.length;i++) {
        	if(especie.equals(TodasAsEspecies[i])) {
        		return true;
        	}
        }
        return false;
    }
}
