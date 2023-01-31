package coop.cad.api.user;

import coop.cad.api.endereco.DadosEndereco;
import coop.cad.api.endereco.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuarios(
        @NotNull
        Long id,
        String telefone,
        DadosEndereco endereco,
        String nome){

}
