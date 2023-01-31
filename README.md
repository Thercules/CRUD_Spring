<h1>CRUD em Spring e MYSQL</h1>
<h2> Arquivo de Documentação </h2>

> Aplicativo desenvolvido em Java versão 17 com a utilização do framework Spring e demais bibliotecas. O objetivo da construção desta aplicação se dá para uso pessoal e apresentacional em demais vagas de programação. 

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
- Lombok (Produtividade e redução de código)

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
* Você instalou a versão mais recente `<Java (versão mais recente) / JDK 19 ou 17 / IntelliJ 2022.3.2 / MySQL v8.0.21 / Insomnia>`
* Você tem uma máquina `<Windows / Linux / Mac>`. Todos os sistemas operacionais são compatíveis, aqui será demonstrado a instalação em uma máquina Windows.
* Caso sua máquina seja Linux ou Mac, Seguem alguns manuais de instalações: 
`<https://medium.com/danielpadua/java-spring-boot-intellij-idea-17badd22f0b7>`.
`<https://dicasdeprogramacao.com.br/como-instalar-o-mysql-no-windows/>`.

## 🚀 Instalando e utilizando a aplicação

• Para instalar o CRUD, siga estas etapas:

• Certifique-se de ter o Java, o JDK, o MySQL e o IntelliJ mais recentes instalados:

• Importe o projeto em seu IntelliJ e automaticamente ele fará o download das dependências do Maven e demais Libs

• Após isso crie um banco de dados em seu MySQL com o nome de "banco_de_usuarios" e defina-o como principal schema

• Entre no projeto recem importado e siga este caminho: <api/src/main/resources/application.properties> e neste arquivo insira as configurações de login e porta de seu MySQL

• Após tal ato, garanta que a porta 8080 do seu localhost estará disponível (Atento a banco de dados abertos que podem consumir essa porta como banco PostgreSQL)

• Após todas as demais configurações e downloads execute o projeto em sua máquina e abra o localhost em seu navegador. Ele deve apresentar a White Label error do Spring, sinalizando que o projeto está no ar

• Após isso a emissão dos métodos GET, POST, PUT e DELETE devem ser todos feitos através de ferramenta. Você pode utilizar o POSTMAN ou o INSOMNIA porém no projeto fora utilizada a segunda opção.

• ATENTE-SE a colocar o localhost correto na hora de emitir as solicitações, sejam elas post, get, put ou delete. Um exemplo de uso do meu próprio projeto: 
```
<http://localhost:8080/usuario>
```

*Também atente-se que determinados campos possuem LIMITES de caracteres, campos como cpf, cep e telefone, se preenchidos errados podem retornar erros na emissão ao banco.

<h2> <b>Seguem abaixo exemplos de emissões de cada tipo.</b> </h2>

<b> Body do SCRIPT em .JSON. Método POST - emissão de novos usuários (será usada no cadastro) </b>
```
{
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
}
```
<b> Método GET </b> - Listar usuários (Implementado a questão paginação e ordenação, seguem exemplos abaixo)
```
Chamada da lista de usuários sem paginação e ordenação 
<http://localhost:8080/usuario> 

Chamada da lista de usuários com paginação e ordenação 
<http://localhost:8080/usuario?size=1&page=2> 

Chamada da lista de usuários por ordem alfabética
<http://localhost:8080/usuario?sort=nome> 
```
<b> Método PUT </b> Atualizar usuários (Através da declaração do ID você pode atualizar os campos de cadastro do usuário que for correspondente)
```
{
	"id" : 6,
	"nome" : "Matheus Valenca Filho de Rosa"
} 
```

<h2> Comandos utilizados no banco de dados utilizando FlyWay </h2>
- Esses comandos se encontram dentro do projeto seguinte o seguinte caminho:
```
<api/src/main/resources/db.migrations/V1__criarusuario.sql>
```
```
<api/src/main/resources/db.migrations/V2__adicionartelefone.sql>
```
- Mas, caso queira uma execução mais funcional antes de executar o código "V1__criarusuario.sql" execute este abaixo:
```
create table usuarios(

                         id bigint not null auto_increment,
                         nome varchar(100) not null,
                         email varchar(100) not null unique,
			 telefone varchar (20) not null,
                         cpf varchar(12) not null unique,
                         sexo varchar(20) not null,
                         logradouro varchar(100) not null,
                         bairro varchar(100) not null,
                         cep varchar(9) not null,
                         complemento varchar(100),
                         numero varchar(20),
                         uf char(2) not null,
                         cidade varchar(100) not null,

                         primary key(id)

);
```

### Prints de funcionamento
https://drive.google.com/drive/folders/1W3yDQRAZhRyRKmKJvpTUfOCiNL2DFI_V?usp=sharing

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
