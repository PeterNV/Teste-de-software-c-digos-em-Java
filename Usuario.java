import java.util.regex.*;
public class Usuario {
    private String nome;
    private String sobrenome;
    private String sexo;
    private String dataDeNascimento;
    private String email;
    private String senha;
    private String csenha;
    private String cpf;
    private String cep;
    private String telefone;
    private String celular;

    // Construtor
    public Usuario(String nome, String sobrenome, String sexo, String dataDeNascimento, String email, 
                   String senha, String csenha, String cpf, String cep, String telefone, String celular) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.senha = senha;
        this.csenha = csenha;
        this.cpf = cpf;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    public String getSexo() {
    	if(sexo.equals("Masculino") || sexo.equals("Feminino")) {
    		return sexo;
    	}
		return null;
        
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getDataDeNascimento() {
    	
    	return dataDeNascimento;
    	 
    }

    public void setDataDeNascimento(String dataDeNascimento) {
    	this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getEmail() {
    	if(email.contains("@") ) {
    		return email;
    	}
    	return null;
    	 
    }

    public void setEmail(String email) {
    	this.email = email;
    }
    
    public void setSenha(String senha) {
    	this.senha = senha;
    }
    
    public String getSenha() {
    	String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,16}$";

			 Pattern p = Pattern.compile(regex);
			
		
			 Matcher m = p.matcher(senha);
			 if (m.matches() == true) {
			     return senha;
			 }
			
			 return null;
    	 
    }
    
    
    public void setConfirmaSenha(String csenha) {
    	this.csenha = csenha;
    }
    
    public String getConfirmaSenha() {
			 
		return csenha;
				 
    }
    
    public void setCpf(String cpf) {
    	this.cpf = cpf;
    }
    
    public String getCpf() {
    

    	  // Verificar se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return null;
        }

        // Verificar se todos os dígitos são iguais (ex: 111.111.111-11)
        if (cpf.matches("(\\d)\\1{10}")) {
            return null;
        }

        // Calcular o primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }

        int firstCheckDigit = 11 - (sum % 11);
        if (firstCheckDigit >= 10) {
            firstCheckDigit = 0;
        }

        // Verificar o primeiro dígito verificador
        if (firstCheckDigit != Character.getNumericValue(cpf.charAt(9))) {
            return null;
        }

        // Calcular o segundo dígito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }

        int secondCheckDigit = 11 - (sum % 11);
        if (secondCheckDigit >= 10) {
            secondCheckDigit = 0;
        }

        // Verificar o segundo dígito verificador
        if (secondCheckDigit != Character.getNumericValue(cpf.charAt(10))) {
            return null;
        }

        // Se o CPF for válido, retornar o próprio CPF
        return cpf;
				 
    }
    public void setCep(String cep) {
    	this.csenha = cep;
    }
    
    public String getCep() {
			 
		return cep;
				 
    }
    
    public void setTelefone(String telefone) {
    	this.telefone = telefone;
    }
    
    public String getTelefone() {
			 
		return telefone;
				 
    }
    
    public void setCelular(String celular) {
    	this.celular = celular;
    }
    
    public String getCelular() {
			 
		return celular;
				 
    }
    // Adicione os outros getters e setters conforme necessário
}