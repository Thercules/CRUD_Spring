package coop.cad.api.user;
//DTO
public record DadosListagemUsuarios(Long id, String nome, String cpf, SEXO sexo) {

    //Metodo GET
    public DadosListagemUsuarios(Usuarios usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getCpf(), usuario.getSexo());
    }
}
