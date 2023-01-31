package coop.cad.api.user;

import coop.cad.api.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/*Sexo ENUM e DadosEndereco e outro record */
public record DadosCadastro(

        @NotBlank //Verificar se o campo nao esta vindo vazio ou nulo. E apenas para campos q sao strings
        String nome,
        @NotBlank
        @Email // Formatacao de email obrigatoria
        String email,

        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{11}") //define que o cpf deve ter 11 numeros. ex: 12334576521
        String cpf,
        @NotNull
        SEXO sexo,
        @NotNull
        @Valid //Validar os dados que estarao no DTO de endereco
        DadosEndereco endereco) {

}
