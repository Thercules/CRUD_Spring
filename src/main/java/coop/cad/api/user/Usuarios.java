package coop.cad.api.user;

import coop.cad.api.endereco.Endereco;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity(name = "usuario")
@Getter // criar getters and setters sem precisar escrever - do jpa
@NoArgsConstructor // gerar construtores default sem argumentos
@AllArgsConstructor // ter construtores que mesmo gerados default recebem todos os campos
@EqualsAndHashCode(of = "id") // criar o equals apenas sobre o id
public class Usuarios {
	
	public Usuarios(DadosCadastro dados) {
		this.nome = dados.nome();
		this.email = dados.email();
		this.cpf = dados.cpf();
		this.sexo = dados.sexo();
		this.telefone = dados.telefone();
		this.endereco = new Endereco(dados.endereco());
	}

	//Declaracao inicial das variaveis
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	
	@Enumerated(EnumType.STRING)
	private SEXO sexo;
	
	@Embedded //Usando isso para que os dados de endereco que nao estao na msm classe sejam chamados ao banco
	private Endereco endereco;

	//Metodo PUT atualiza apenas nome, telefone e qualquer dado presente no endereco
    public void atualizarInformacoes(DadosAtualizacaoUsuarios dados) {
    	if (dados.nome() != null) {
			this.nome = dados.nome();
		}
		if (dados.telefone() != null) {
			this.telefone = dados.telefone();
		}
		if (dados.endereco() != null) {
			this.endereco.atualizarInformacoes(dados.endereco());
		}
	}
}