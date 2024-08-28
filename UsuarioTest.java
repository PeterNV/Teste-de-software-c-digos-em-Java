import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {
    private UsuarioCadastro usuarioCadastro;
    private UsuarioArmazena usuarioArmazena;

    @Before
    public void setUp() {
        usuarioCadastro = new UsuarioCadastro();
        usuarioArmazena = new UsuarioArmazena();
    }
    @Test
    public void CamposEmBranco() {
    	assertTrue(usuarioArmazena.getUsuarios().isEmpty());
    }
    @Test
    public void testCriarUsuario() {
        Usuario user1 = usuarioCadastro.criarUsuario("João", "Silva", "Masculino", "01/01/1990", "joao@gmail.com", 
                                                     "Senha123@", "Senha123@", "12345678909", "12345-678", 
                                                     "1122334455", "9988776655");
        assertNotNull(user1.getSenha());
        assertNotNull(user1.getSexo());
        assertNotNull(user1.getCpf());
        assertNotNull(user1.getCelular());
        assertNotNull(user1.getTelefone());
        assertEquals(user1.getSenha(), user1.getConfirmaSenha());
        assertEquals("João", user1.getNome());
        
    }

    @Test
    public void testSalvarUsuario() {
        Usuario user1 = usuarioCadastro.criarUsuario("João", "Silva", "Masculino", "01/01/1990", "joao@gmail.com", 
                                                     "senha123", "senha123", "123.456.789-00", "12345-678", 
                                                     "1122334455", "9988776655");
        usuarioArmazena.salvarUsuario(user1);
        assertEquals(1, usuarioArmazena.getUsuarios().size());
        assertEquals("João", usuarioArmazena.getUsuarios().get(0).getNome());
        assertFalse(usuarioArmazena.getUsuarios().isEmpty());
    }
}