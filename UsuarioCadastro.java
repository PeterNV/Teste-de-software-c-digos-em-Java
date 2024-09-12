import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioCadastro {
	private UsuarioArmazena repo;
	public UsuarioCadastro(UsuarioArmazena repo) {
		this.repo = repo;
	}
    public Usuario criarUsuario(Usuario usuario) {
    	
    	if(!this.ValidarCpf(usuario.getCpf())) {
    		return null;
    	}
    	if(!this.ValidarSenha(usuario.getSenha())) {
    		return null;
    	}
    	if(!this.ValidarNome(usuario.getNome())) {
    		return null;
    	}
    	if(!this.ValidarEmail(usuario.getEmail())) {
    		return null;
    	}
    	if(!this.ValidarSobrenome(usuario.getSobrenome())) {
    		return null;
    	}
    	if(!this.ValidarSexo(usuario.getSexo())) {
    		return null;
    	}
        this.repo.salvarUsuario(usuario);
		return usuario;
    }
    
    public boolean ValidarSobrenome(String sobrenome) {
    	String regex = "^(?=.*[a-zA-ZÀ-ÖØ-öø-ÿ])[a-zA-ZÀ-ÖØ-öø-ÿ\\s]{3,32}$";
        Pattern p = Pattern.compile(regex);
        
        Matcher m = p.matcher(sobrenome);
        if (!m.matches()) {
            return false;
        }
        return true;
    }
    
    public boolean ValidarNome(String nome) {
    	String regex = "^(?=.*[a-zA-ZÀ-ÖØ-öø-ÿ])[a-zA-ZÀ-ÖØ-öø-ÿ\\s]{3,32}$";
        Pattern p = Pattern.compile(regex);
        
        Matcher m = p.matcher(nome);
        if (!m.matches()) {
            return false;
        }
        return true;
    }
    
    private boolean ValidarCpf(String cpf) {
    	  // Verificar se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verificar se todos os dígitos são iguais (ex: 111.111.111-11)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
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
            return false;
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
            return false;
        }
        return true;
    }
    
    public boolean ValidarSenha(String senha) {
    	String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,16}$";

			 Pattern p = Pattern.compile(regex);
			
		
			 Matcher m = p.matcher(senha);
			 if (m.matches() == true) {
			     return true;
			 }
			 return false;
    }
    
    public boolean ValidarEmail(String email) {
    	if(!email.contains("@") ) {
    		return false;
    	}
    	return true;
    }
    
    public boolean ValidarSexo(String sexo) {
    	if(sexo.equals("Masculino") || sexo.equals("Feminino")) {
    		return true;
    	}
    	return false;
    }
}
