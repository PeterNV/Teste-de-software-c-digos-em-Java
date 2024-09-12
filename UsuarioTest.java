import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {
    private UsuarioCadastro usuarioCadastro;
  
    private UsuarioArmazena usuarioArmazena;

    Usuario user1;
    
    @Before
    public void init() {
    	usuarioArmazena = new UsuarioArmazena();
        usuarioCadastro = new UsuarioCadastro(usuarioArmazena);
    }
    
    @Test
    public void CamposEmBranco() {
    	assertTrue(usuarioArmazena.getUsuarios().isEmpty());
    }
    
    @Test
    public void testCriarUsuario() {
        user1 = new Usuario("João", "Silva Vila", "Masculino", "01/01/1990", "joao@gmail.com", 
                "Senha123@", "Senha123@", "12345678909", "12345-678", 
                "1122334455", "9988776655");
        Usuario u = this.usuarioCadastro.criarUsuario(user1);
        
        assertNotNull(u);
        
    }
    
    @Test
    public void testCriarUuarioComCpfInvalido() {
    	user1 = new Usuario("João", "Silva Vila", "Masculino", "01/01/1990", "joao@gmail.com", 
                "Senha123@", "Senha123@", "123456789", "12345-678", 
                "1122334455", "9988776655");
        Usuario u = this.usuarioCadastro.criarUsuario(user1);
        
        assertNull(u);
    }
    @Test
    public void testCriarUuarioComSenhaInvalida() {
    	user1 = new Usuario("João", "Silva Vila", "Masculino", "01/01/1990", "joao@gmail.com", 
                "Senha123", "Senha123@", "12345678909", "12345-678", 
                "1122334455", "9988776655");
        Usuario u = this.usuarioCadastro.criarUsuario(user1);
        
        assertNull(u);
    }
    @Test
    public void testCriarUuarioComSexoInvalido() {
    	user1 = new Usuario("João", "Silva Vila", "Não selecionado", "01/01/1990", "joao@gmail.com", 
                "Senha123@", "Senha123@", "12345678909", "12345-678", 
                "1122334455", "9988776655");
        Usuario u = this.usuarioCadastro.criarUsuario(user1);
        
        assertNull(u);
    }
    @Test
    public void testCriarUuarioComNomeInvalido() {
    	user1 = new Usuario("João3", "Silva Vila", "Masculino", "01/01/1990", "joao@gmail.com", 
                "Senha123@", "Senha123@", "12345678909", "12345-678", 
                "1122334455", "9988776655");
        Usuario u = this.usuarioCadastro.criarUsuario(user1);
        
        assertNull(u);
    }
    @Test
    public void testCriarUuarioComSobrenomeInvalido() {
    	user1 = new Usuario("João", "Silva Vil@", "Masculino", "01/01/1990", "joao@gmail.com", 
                "Senha123@", "Senha123@", "12345678909", "12345-678", 
                "1122334455", "9988776655");
        Usuario u = this.usuarioCadastro.criarUsuario(user1);
        
        assertNull(u);
    }
    @Test
    public void testCriarUuarioComEmailInvalido() {
    	user1 = new Usuario("João", "Silva Vila", "Masculino", "01/01/1990", "joaogmail.com", 
                "Senha123@", "Senha123@", "12345678909", "12345-678", 
                "1122334455", "9988776655");
        Usuario u = this.usuarioCadastro.criarUsuario(user1);
        
        assertNull(u);
    }
    

    @Test
    public void testSalvarUsuario() {
        usuarioArmazena.salvarUsuario(user1);
        assertEquals(1, usuarioArmazena.getUsuarios().size());
        assertFalse(usuarioArmazena.getUsuarios().isEmpty());
        
    }
}
