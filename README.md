<h1>CRUD em Spring e MYSQL</h1>
<h2> Arquivo de Documentação </h2>

> Aplicativo desenvolvido em Java versão 17 com a utilização do framework Spring e demais bibliotecas. O objetivo da construção desta aplicação se dá para uso pessoal e apresentacional em demais vagas de programação. 

### Prototipagem
Confira a prototipagem das telas [aqui](https://www.figma.com/file/8NMdu9qtk0wcyIBy8mwCkk/CCO-VENDAS?node-id=0%3A1)

### IDE

### Tecnologias utilizadas
- Java 17
- Spring (v3.0.2 with Maven)
- MySQL
- Insomnia

### Bibliotecas utilizadas
- Spring DevTools (Load automatico da api e demais funções de auxilio)
- Spring Web (Posteriormente plan ejo integrar um front ao projeto)
- Thymeleaf (Para auxilio na construção do front posteriormente)
- MySQL driver (Para linkar o banco de dados com JDBC)
- Validation (Para validação dos métodos)
- Flyway Migration (Para atualizar, visualizar o banco de dados pela própria IDE)
- Spring JPA (Persistência e criação da API)

### Ajustes e melhorias

O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

- [ ] Prototipação e desenvolvimento das telas do front (Usarei Angular)
- [ ] Integração do front com o back para que todas as funções do CRUD estejam de acordo
- [ ] Após a integração construir um site de boa qualidade e integrar o CRUD em telas de registro, login e controle de acesso do usuário.

### Técnicas de programação aplicadas no projeto.
- SOLID
- Uso de CTOs

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:
<!---Estes são apenas requisitos de exemplo. Adicionar, duplicar ou remover conforme necessário--->
* Você instalou a versão mais recente `<Java (versão mais recente) / JDK 19 ou 17 / IntelliJ 2022.3.2 / MySQL v8.0.21 / Insomnia>`
* Você tem uma máquina `<Windows / Linux / Mac>`. Todos os sistemas operacionais são compatíveis, aqui será demonstrado a instalação em uma máquina Windows.
* Caso sua máquina seja Linux ou Mac, Seguem alguns manuais de instalações: 
`<https://medium.com/danielpadua/java-spring-boot-intellij-idea-17badd22f0b7>`.
`<https://dicasdeprogramacao.com.br/como-instalar-o-mysql-no-windows/>`.

## 🚀 Instalando e utilizando a aplicação

Para instalar o CRUD, siga estas etapas:

Certifique-se de ter o Java, o JDK, o MySQL e o IntelliJ mais recentes instalados:
```
Importe o projeto em seu IntelliJ e automaticamente ele fará o download das dependências do Maven e demais Libs
```
Após isso crie um banco de dados em seu MySQL com o nome de "banco_de_usuarios" e defina-o como principal schema
```
Entre no projeto recem importado e siga este caminho: <api/src/main/resources/application.properties> e neste arquivo insira as configurações de login e porta de seu MySQL
```
Após tal ato, garanta que a porta 8080 do seu localhost estará disponível (Atento a banco de dados abertos que podem consumir essa porta como banco PostgreSQL)
```
Após todas as demais configurações e downloads execute o projeto em sua máquina e abra o localhost em seu navegador. Ele deve apresentar a White Label error do Spring, sinalizando que o projeto está no ar
```
Após isso a emissão dos métodos GET, POST, PUT e DELETE devem ser todos feitos através de ferramenta. Você pode utilizar o POSTMAN ou o INSOMNIA porém no projeto fora utilizada a segunda opção.
```
ATENTE-SE a colocar o localhost correto na hora de emitir as solicitações, sejam elas post, get, put ou delete. Um exemplo de uso do meu próprio projeto: <http://localhost:8080/usuario>
```
Tambpém atente-se que determinados campos possuem LIMITES de caracteres, campos como cpf, cep e telefone, se preenchidos errados podem retornar erros na emissão ao banco.
```
Seguem abaixo exemplos de emissões de cada tipo.
```
Body do SCRIPT em .JSON. Método POST - emissão de novos usuários (será usada no cadastro)
```
<{
"nome": "Matheus Valenca",
"email": "matheusvalenca@yahoo.com",
"cpf": "14255523232",
"sexo": "MASCULINO",
"telefone": "8199239939",
"endereco": {
    "logradouro": "rua 5",
    "bairro": "bairro 5",
    "cep": "98765322",
    "cidade": "Fortaleza",
    "uf": "CE",
    "numero": "762",
    "complemento": "ap"
    }
}>
```
Método GET - Listar usuários (Implementado a questão paginação e ordenação, seguem exemplos abaixo)
```
Chamada da lista de usuários sem paginação e ordenação 
<http://localhost:8080/usuario> 

Chamada da lista de usuários com paginação e ordenação 
<http://localhost:8080/usuario?size=1&page=2> 

Chamada da lista de usuários por ordem alfabética
<http://localhost:8080/usuario?sort=nome> 
```
Método PUT - Atualizar usuários (Através da declaração do ID você pode atualizar os campos de cadastro do usuário que for correspondente)
```
<
{
	"id" : 6,
	"nome" : "Matheus Valenca Filho de Rosa"
}
> 
```

## 📫 Deseja contribuir para o CRUD?
Para contribuir com <nome_do_projeto>, siga estas etapas:

1. Bifurque este repositório.
2. Crie um branch: `git checkout -b <nome_branch>`.
3. Faça suas alterações e confirme-as: `git commit -m '<mensagem_commit>'`
4. Envie para o branch original: `git push origin <nome_do_projeto> / <local>`
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).

## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE.md) para mais detalhes.

[⬆ Voltar ao topo](#nome-do-projeto)<br>
