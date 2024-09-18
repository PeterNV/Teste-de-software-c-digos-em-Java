
public class Login {
	
	private Usuario userLogado;
	private UsuarioArmazena userArmazenado;
	public Login(UsuarioArmazena userArmazenado) {
		this.userArmazenado = userArmazenado;
	}
	public Usuario Logar(Usuario u) {
		Usuario user = this.ValidarUsuario(u);
		if(user  !=  null) {
			this.userLogado = user;
		}
		return this.userLogado;
	}
	public Usuario ValidarUsuario(Usuario u) {
	Usuario user =	this.userArmazenado.buscarUsuario(u.getEmail());
	if(user != null && !user.getSenha().equals(u.getSenha())) {
		user = null;
	}
	return user;
	}
}
