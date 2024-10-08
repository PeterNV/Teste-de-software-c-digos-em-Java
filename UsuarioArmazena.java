import java.util.ArrayList;

import java.util.List;
public class UsuarioArmazena {
    private List<Usuario> usuarios;

    public UsuarioArmazena() {
        this.usuarios = new ArrayList<>();
    }

    public void salvarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public Usuario buscarUsuario(String email) {
    	
    	Usuario user = null;
    	for(Usuario u: this.usuarios) {
    		if(u.getEmail().equals(email)) {
    			user = u;
    			break;
    		}
    	}
    	return user;
    }
}
