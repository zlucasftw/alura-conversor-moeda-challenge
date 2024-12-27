# Challenge ONE - Conversor de Moeda - Java - Back-End

O desafio consiste na construção de um conversor de moedas fazendo requisições a uma API que forneça taxas de câmbio, manipulando dados em formato JSON, serializando-os para um objeto Java, realizando filtros e manipulação dos dados obtidos.

É oferecido uma interação textual (via terminal/console) com o usuário que proporciona até 6 opções distinstas de conversões de moedas em um menu. A taxa de conversão se obtem a partir da API o que garante a geração de dados não estáticos, precisos e em tempo real.

![Logo Challenge](https://www.alura.com.br/assets/api/cursos/praticando-java-construindo-conversor-moedas.svg)

## Funcionalidades

- Menu em linha de comando
- 6 possibilidades de escolha de conversão de câmbio
- Conversão de valor de moeda
- Exibição de valor original para valor convertido
- Gravação de arquivo de log em formato JSON (funcionalidade parcialmente finalizada)

### TODO
- [ ]   Histórico de conversões - Gravação de arquivo de log em formato JSON
- [ ]   Possibilidade no menu para leitura do arquivo de log
- [ ]   Aumentar possibilidades de câmbio para conversão

## Tecnologias e serviços utilizados


<code><img width="50" src="https://user-images.githubusercontent.com/25181517/192108890-200809d1-439c-4e23-90d3-b090cf9a4eea.png" alt="IntelliJ" title="IntelliJ"/></code>
<code><img width="50" src="https://user-images.githubusercontent.com/25181517/117201156-9a724800-adec-11eb-9a9d-3cd0f67da4bc.png" alt="Java" title="Java"/></code>
<code><img width="50" src="https://user-images.githubusercontent.com/25181517/192108372-f71d70ac-7ae6-4c0d-8395-51d8870c2ef0.png" alt="Git" title="Git"/></code>
<code><img width="50" src="https://user-images.githubusercontent.com/25181517/192108374-8da61ba1-99ec-41d7-80b8-fb2f7c0a4948.png" alt="GitHub" title="GitHub"/></code>
<code><img width="50" src="https://user-images.githubusercontent.com/25181517/192109061-e138ca71-337c-4019-8d42-4792fdaa7128.png" alt="Postman" title="Postman"/></code>
<code><img width="50" src="https://user-images.githubusercontent.com/25181517/192107854-765620d7-f909-4953-a6da-36e1ef69eea6.png" alt="HTTP" title="HTTP"/></code>


- **Serviços** - ExchangeRate-API
- **Linguagem de Programação** - Java
- **IDE** - IntelliJ
- **Ferramentas para versionamento do projeto** - Git e Github
- **Ferramenta para testes de requisição** - Postman
- **Biblioteca para serialização e deserialização JSON** - GSON (Google)

## Execução local

**Garanta que tenha instalado pelo menos a JDK 17 ou 21 do Java instalada. É possível encontra-lá no link: [JDK Download](https://www.oracle.com/br/java/technologies/downloads/#java21).**

**Já tenha gerada sua chave de API no [ExchangeRate-API](https://www.exchangerate-api.com/).**

Faça um clone do projeto

```bash
  git clone https://github.com/zlucasftw/alura-conversor-moeda-challenge.git
```

Vá ao diretório do projeto

```bash
  cd alura-conversor-moeda-challenge
```

1. Abra o caminho do diretório na IDE de escolha (IntelliJ, Eclipse, VSCode)

2. Vá até a classe `Request.java` e troque a variável **`API_KEY`** por sua chave de API gerada na [ExchangeRate-API](https://www.exchangerate-api.com/).

> \
> Até a data de disponibilidade do challenge minha chave de API está no código e disponível para ser utilizada mas será retirada ou alcançar o máximo de requisições diárias.

3. Após isso vá a classe `Principal.java` e realize a execução, utilizando o terminal/console que fornece interação com o usuário.

## Cursos relacionados

- https://cursos.alura.com.br/course/java-criando-primeira-aplicacao
- https://cursos.alura.com.br/course/java-aplicando-orientacao-objetos
- https://cursos.alura.com.br/course/java-listas-colecoes-dados
- https://cursos.alura.com.br/course/java-consumindo-api-gravando-arquivos-lidando-erros
- https://cursos.alura.com.br/course/java-criando-primeira-aplicacao

[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)
