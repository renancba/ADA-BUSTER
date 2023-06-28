# ADA-BUSTER

Bem-vindo à documentação da ADA-Buster! Esta API foi desenvolvida com Spring Boot e Java para gerenciar informações sobre filmes. Este arquivo README fornece informações sobre a API e como usá-la.

## Requisitos

Certifique-se de ter os seguintes requisitos instalados em seu ambiente de desenvolvimento:

- Java Development Kit (JDK) versão 8 ou superior
- Maven
- Spring Boot

## Configuração do Projeto

1. Clone este repositório em seu ambiente local:

```
git clone https://github.com/renancba/ADA-BUSTER.git
```

2. Navegue até o diretório do projeto:

```
cd api-filmes
```

3. Construa o projeto utilizando o Maven:

```
mvn clean install
```

4. Inicie o servidor embutido do Spring Boot:

```
mvn spring-boot:run
```

Agora, a API de Filmes está em execução localmente no endereço `http://localhost:8080`.

## Endpoints

A API de Filmes possui os seguintes endpoints:

### Listar todos os filmes

```
GET /filmes
```

Este endpoint retorna uma lista de todos os filmes cadastrados.

### Adicionar um novo filme

```
GET /filmes/novo
```

Este endpoint retorna a página de adição de um novo filme.

```
POST /filmes/novo
```

Este endpoint permite adicionar um novo filme. Envie os detalhes do filme no corpo da solicitação.

### Editar um filme

```
GET /filmes/editar/{id}
```

Este endpoint retorna a página de edição de um filme específico, com base no ID fornecido.

```
POST /filmes/editar
```

Este endpoint permite atualizar as informações de um filme existente. Envie os detalhes do filme no corpo da solicitação.

### Remover um filme

```
GET /filmes/remover/{id}
```

Este endpoint remove um filme da lista, com base no ID fornecido.

### Dar like em um filme

```
GET /filmes/like/{id}
```

Este endpoint adiciona um like ao filme especificado pelo ID.

### Dar dislike em um filme

```
GET /filmes/dislike/{id}
```

Este endpoint adiciona um dislike ao filme especificado pelo ID.

## Formato dos Dados

A API de Filmes utiliza o formato JSON para as solicitações e respostas. Certifique-se de enviar solicitações com o cabeçalho correto (`Content-Type: application/json`) e analisar as respostas adequadamente.

Aqui está um exemplo de corpo de solicitação para adicionar ou atualizar um filme:

```json
{
  "id": 1,
  "titulo": "O Senhor dos Anéis",
  "genero": "Fantasia",
  "minutos": 180,
  "sinopse": "Um grupo de heróis embarca em uma jornada para destruir um poderoso anel",
  "imdb": 8.9,
  "imagem": "https://exemplo.com/imagem.jpg",
  "like": 100,
  "dislike": 10
}
```

