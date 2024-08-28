public class UsuarioCadastro {
    public Usuario criarUsuario(String nome, String sobrenome, String sexo, String dataDeNascimento, String email, 
                                String senha, String csenha, String cpf, String cep, String telefone, String celular) {
        return new Usuario(nome, sobrenome, sexo, dataDeNascimento, email, senha, csenha, cpf, cep, telefone, celular);
    }
}