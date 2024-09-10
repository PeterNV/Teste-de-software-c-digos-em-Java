import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {
    private UsuarioCadastro usuarioCadastro;
    private PetCadastro petCadastro;
    private UsuarioArmazena usuarioArmazena;
    private PetArmazena petArmazena;
    Usuario user1;
    Pet pet1;
    @Before
    public void init() {
        usuarioCadastro = new UsuarioCadastro();
        usuarioArmazena = new UsuarioArmazena();
        petCadastro = new PetCadastro();
        petArmazena = new PetArmazena();
        user1 = usuarioCadastro.criarUsuario("João", "Silva Vila", "Masculino", "01/01/1990", "joao@gmail.com", 
                "Senha123@", "Senha123@", "12345678909", "12345-678", 
                "1122334455", "9988776655");
        pet1 = petCadastro.criarPet("Guilbert", "Gato", 1);
    }
    @Test
    public void CamposEmBranco() {
    	assertTrue(usuarioArmazena.getUsuarios().isEmpty());
    }
    @Test
    public void testCriarUsuario() {
        
        assertNotNull(user1.getNome());
        assertNotNull(user1.getSobrenome());
        assertNotNull(user1.getSenha());
        assertNotNull(user1.getSexo());
        assertNotNull(user1.getCpf());
        assertNotNull(user1.getCelular());
        assertNotNull(user1.getTelefone());
        assertEquals(user1.getSenha(), user1.getConfirmaSenha());
        
    }
    @Test
    public void TesteCriarPet() {
    	assertNotNull(pet1.getNome());
        assertNotNull(pet1.getEspecie());
        assertNotNull(pet1.getIdade());
    }

    @Test
    public void testSalvarUsuario() {
        usuarioArmazena.salvarUsuario(user1);
        petArmazena.salvarPet(pet1);
        assertEquals(1, usuarioArmazena.getUsuarios().size());
        assertEquals(1, petArmazena.getPets().size());
        assertFalse(usuarioArmazena.getUsuarios().isEmpty());
        assertFalse(petArmazena.getPets().isEmpty());
    }
}
