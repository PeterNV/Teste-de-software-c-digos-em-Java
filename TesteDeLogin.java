import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


public class TesteDeLogin {
	private UsuarioCadastro usuarioCadastro;
	 private UsuarioArmazena usuarioArmazena;
	
	 
  @Before
  public void init() {
	    	usuarioArmazena = new UsuarioArmazena();
	        usuarioCadastro = new UsuarioCadastro(usuarioArmazena);
   }
	    
	@Test
	public void testeLoginSucesso() {
		Usuario user1 = new Usuario("João", "Silva Vila", "Masculino", "01/01/1990", "joao@gmail.com", 
                "Senha123@", "Senha123@", "12345678909", "12345-678", 
                "1122334455", "9988776655");
		Usuario u = this.usuarioCadastro.criarUsuario(user1);
        
		
		Login login = new Login(usuarioArmazena);
		
		Usuario usuarioLogado = login.Logar(u);
        assertNotNull(usuarioLogado);
	}
	
	@Test
	public void testeLoginEmailInvalido() {
	  
	    Usuario user1 = new Usuario("João", "Silva Vila", "Masculino", "01/01/1990", "joaogmail.com",
	            "Senha123@", "Senha123@", "12345678909", "12345-678", 
	            "1122334455", "9988776655");

	
	    Usuario u = this.usuarioCadastro.criarUsuario(user1);
	    assertNull(u); 

	    
	}
	@Test
	public void testeLoginSenhaInvalida() {

	    Usuario user1 = new Usuario("João", "Silva Vila", "Masculino", "01/01/1990", "joao@gmail.com",
	            "Senha123", "Senha123", "12345678909", "12345-678", 
	            "1122334455", "9988776655");

	    
	    Usuario u = this.usuarioCadastro.criarUsuario(user1);
	    assertNull(u); 
	    
	}
	
}
