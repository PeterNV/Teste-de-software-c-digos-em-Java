
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
    public  String getNome() {
        
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
    	
		return sexo;
        
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
    	
    	return email;
    	 
    }

    public void setEmail(String email) {
    	this.email = email;
    }
    
    public void setSenha(String senha) {
    	this.senha = senha;
    }
    
    public String getSenha() {
    	
		return senha;
    	 
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
   
        return cpf;
				 
    }
    public void setCep(String cep) {
    	this.cep = cep;
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
