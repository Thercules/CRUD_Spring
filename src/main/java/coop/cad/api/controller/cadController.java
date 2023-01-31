package coop.cad.api.controller;

import coop.cad.api.user.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
public class cadController {
	@Autowired //Injecao de Atributos
	private usuarioRepository repository; 

	//Metodo emitir (POST)
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastro dados) {
		repository.save(new Usuarios(dados));
	}

	//Metodo GET
	@GetMapping
	public Page<DadosListagemUsuarios> listar(Pageable paginacao){ //Voce pode definir que a chamada padrao do metodo get tenha apenas 10 chamadas pelo comando "@PageableDefault(size=10)" deixando por padrao todas as pesquisas assim
		return repository.findAll(paginacao).map(DadosListagemUsuarios::new);
	}

	//Metodo PUT (alterar)
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoUsuarios dados){
		var usuario = repository.getReferenceById(dados.id());
		usuario.atualizarInformacoes(dados);
	}

	//Metodo delete
	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id){
		repository.deleteById(id);
	}
}
