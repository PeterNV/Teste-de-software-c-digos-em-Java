import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class TesteDeLogin {
	ArrayList<String> email;
	ArrayList<String> senha;
	Login  user;
	
	  @Before
	  public void init() {
		  email = new ArrayList<String>();
	      senha = new ArrayList<String>();
		  user = new Login();
		 
	  }

	  @Test
	  public void CamposEmBranco() {
	    assertTrue(user.Email(email).isEmpty());
	    assertTrue(user.Senha(senha).isEmpty());
	  }

	  @Test
	  public void LoginValido() {
		  
		user.Email(email).add(0, "pedro@gmail.com");
		user.Senha(senha).add(0, "Pato136#");
		assertFalse(user.Email(email).isEmpty());
	    assertFalse(user.Senha(senha).isEmpty());
		assertTrue(user.Email(email).get(0).contains("@"));
		assertEquals(user.Senha(senha).get(0).length(),8);
		
		user.Email(email).add(0, "pedro@gmail.com");
		user.Senha(senha).add(0, "Pato136#Pato136#");
		assertFalse(user.Email(email).isEmpty());
	    assertFalse(user.Senha(senha).isEmpty());
		
		assertTrue(user.Email(email).get(0).contains("@"));
		assertEquals(user.Senha(senha).get(0).length(),16);
		
	  }

	  @Test
	  public void LoginInvalido() {
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