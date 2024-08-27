import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
public class TesteDeCadastro {
	ArrayList<String> nome;
	ArrayList<String> sobrenome;
	ArrayList<String> sexo;
	ArrayList<String> datadenascimento;
	ArrayList<String> email;
	ArrayList<String> senha;
	ArrayList<String> csenha;
	ArrayList<String> cpf;
	ArrayList<String> cep;
	ArrayList<String> telefone;
	ArrayList<String> celular;
	Cadastro  user;
	
	@Before
	public void init() {
		  nome = new ArrayList<String>();
		  sobrenome = new ArrayList<String>();
		  sexo = new ArrayList<String>();
		  datadenascimento = new ArrayList<String>();
		  email = new ArrayList<String>();
	      senha = new ArrayList<String>();
	      csenha = new ArrayList<String>();
	      cpf = new ArrayList<String>();
	      cep = new ArrayList<String>();
	      telefone = new ArrayList<String>();
	      celular = new ArrayList<String>();
		  user = new Cadastro();
		 
	  }
	@Test
	  public void CamposEmBranco() {
		assertTrue(user.Nome(email).isEmpty());
	    assertTrue(user.Sobrenome(sobrenome).isEmpty());
	    assertTrue(user.Sexo(sexo).isEmpty());
	    assertTrue(user.DataDeNascimento(datadenascimento).isEmpty());
	    assertTrue(user.Email(email).isEmpty());
	    assertTrue(user.Senha(senha).isEmpty());
	    assertTrue(user.ConfirmaSenha(csenha).isEmpty());
	    assertTrue(user.Cpf(cpf).isEmpty());
	    assertTrue(user.Cep(cep).isEmpty());
	    assertTrue(user.Telefone(telefone).isEmpty());
	    assertTrue(user.Celular(celular).isEmpty());
	  }
	
	@Test
	  public void CadastroValido() {
		user.Nome(nome).add(0, "Pedro");
		user.Sobrenome(sobrenome).add(0, "Vila Nova");
		user.Sexo(sexo).add(0, "Masculino");
		user.DataDeNascimento(datadenascimento).add(0, "6/12/1999");
		user.Email(email).add(0, "pedro@gmail.com");
		user.Senha(senha).add(0, "Pato136#");
		user.ConfirmaSenha(csenha).add(0, "Pato136#");
		user.Cpf(cpf).add(0, "123.456.789-09");
		user.Cep(cep).add(0, "52052-286");
		user.Telefone(telefone).add(0, "32275556");
		user.Celular(celular).add(0, "+5581998500105");
		
		assertFalse(user.Nome(email).isEmpty());
	    assertFalse(user.Sobrenome(sobrenome).isEmpty());
	    assertFalse(user.Sexo(sexo).isEmpty());
	    assertFalse(user.DataDeNascimento(datadenascimento).isEmpty());
		assertFalse(user.Email(email).isEmpty());
	    assertFalse(user.Senha(senha).isEmpty());
	    assertFalse(user.ConfirmaSenha(csenha).isEmpty());
	    assertFalse(user.Cpf(cpf).isEmpty());
	    assertFalse(user.Cep(cep).isEmpty());
	    assertFalse(user.Telefone(telefone).isEmpty());
	    assertFalse(user.Celular(celular).isEmpty());
	    
	    
	    assertTrue(user.Sexo(sexo).get(0).equals("Masculino")); 
		assertTrue(user.Email(email).get(0).contains("@"));
		assertEquals(user.Cpf(cpf).get(0).length(),14);
		assertTrue(user.Cpf(cpf).get(0).contains("."));
		assertTrue(user.Cpf(cpf).get(0).contains("-"));
		assertTrue(user.Celular(celular).get(0).contains("+"));
		assertEquals(user.Celular(celular).get(0).length(),14);
		assertEquals(user.Telefone(telefone).get(0).length(),8);
		assertEquals(user.Senha(senha).get(0).length(),8);
		assertTrue(user.ConfirmaSenha(csenha).get(0).equals(user.Senha(senha).get(0)));
		
		
		user.Nome(nome).add(0, "Carla");
		user.Sobrenome(sobrenome).add(0, "Vila Nova");
		user.Sexo(sexo).add(0, "Feminino");
		user.DataDeNascimento(datadenascimento).add(0, "15/4/1972");
		user.Email(email).add(0, "carla@gmail.com");
		user.Senha(senha).add(0, "Pato136#Pato136#");
		user.ConfirmaSenha(csenha).add(0, "Pato136#Pato136#");
		user.Cpf(cpf).add(0, "123.456.789-09");
		user.Cep(cep).add(0, "52052-286");
		user.Telefone(telefone).add(0, "32275556");
		user.Celular(celular).add(0, "+5581998500105");
		
		assertFalse(user.Nome(email).isEmpty());
	    assertFalse(user.Sobrenome(sobrenome).isEmpty());
	    assertFalse(user.Sexo(sexo).isEmpty());
	    assertFalse(user.DataDeNascimento(datadenascimento).isEmpty());
		assertFalse(user.Email(email).isEmpty());
	    assertFalse(user.Senha(senha).isEmpty());
	    assertFalse(user.ConfirmaSenha(csenha).isEmpty());
	    assertFalse(user.Cpf(cpf).isEmpty());
	    assertFalse(user.Cep(cep).isEmpty());
	    assertFalse(user.Telefone(telefone).isEmpty());
	    assertFalse(user.Celular(celular).isEmpty());
		
		
	    assertTrue(user.Sexo(sexo).get(0).equals("Feminino")); 
		assertTrue(user.Email(email).get(0).contains("@"));
		assertEquals(user.Cpf(cpf).get(0).length(),14);
		assertTrue(user.Cpf(cpf).get(0).contains("."));
		assertTrue(user.Cpf(cpf).get(0).contains("-"));
		assertTrue(user.Celular(celular).get(0).contains("+"));
		assertEquals(user.Celular(celular).get(0).length(),14);
		assertEquals(user.Telefone(telefone).get(0).length(),8);
		assertEquals(user.Senha(senha).get(0).length(),16);
		assertTrue(user.ConfirmaSenha(csenha).get(0).equals(user.Senha(senha).get(0)));
		
	  }

	  @Test
	  public void CadastroInvalido() {
		user.Email(email).add(0, "pedrogmail.com");
		user.Senha(senha).add(0, "Pato136");
		
		assertFalse(user.Email(email).isEmpty());
	    assertFalse(user.Senha(senha).isEmpty());	
		assertFalse(user.Email(email).get(0).contains("@"));
		assertEquals(user.Senha(senha).get(0).length(),7);
			
		user.Email(email).add(0, "pedrogmail.com");
		user.Senha(senha).add(0, "Pato136#Pato136#1");
		
		assertFalse(user.Email(email).isEmpty());
	    assertFalse(user.Senha(senha).isEmpty());	
		assertFalse(user.Email(email).get(0).contains("@"));
		assertEquals(user.Senha(senha).get(0).length(),17);
	  }
}