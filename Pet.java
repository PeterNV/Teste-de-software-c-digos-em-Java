import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pet {
	private String especie;
    private String nome;
    private int idade;
    
    public Pet(String nome, String especie, int idade) {
    	this.nome = nome;

    	this.especie = especie;
    	this.idade = idade;
    }
    public  String getNome() {
        String regex = "^(?=.*[a-zA-ZÀ-ÖØ-öø-ÿ])[a-zA-ZÀ-ÖØ-öø-ÿ\\s]{3,32}$";
        Pattern p = Pattern.compile(regex);
        
        Matcher m = p.matcher(nome);
        if (m.matches()) {
            return nome;
        }
        return null;
    }

    public void setNome(String nome) {
    	
        this.nome = nome;
    }
    
    public  String getEspecie() {
        String TodasAsEspecies[] = {"Cachorro","Gato","Papagaio","Hamster","Tartaruga"};
        for(int i = 0; i < TodasAsEspecies.length;i++) {
        	if(this.especie.equals(TodasAsEspecies[i])) {
        		return this.especie;
        	}
        }
        return null;
    }

    public void setEspecie(String especie) {
    	
        this.especie = especie;
    }
    
    public  int getIdade() {
        
        return this.idade;
    }

    public void setIdade(int idade) {
    	
        this.idade = idade;
    }
}
