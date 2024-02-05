# Tech Challenge - Video Streaming

Projeto fase 4 - Pós TECH.

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

### 📋 Pré-requisitos
Será necessário as seguintes tecnologias:
```
Java 17
Maven
Docker (para o MongoDB)
```

## 📦 Implantação

Após realizar o donwload do repositório para sua máquina.
Configure o projeto apontando para JAVA 17.

De um update nas depências do maven.

Execute o seguinte comando docker para subir o MongoDB.
```bash
    docker run -d -p 27017:27017 --name databasemongo mongo
```
--name databasemongo: é o nome da imagem docker.

## Observações

Certifique-se de ter o DOCKER instalado.

## 🛠️ Dados de entrada e saída

Após rodar a aplicação é possível ver e testar os endpoints pela documentação gerada pelo Swagger.
http://localhost:8080/api/v1/swagger-ui/index.html

# user-controller

POST ** /api/v1/users/create/user **

```json
{
  "username": "Agade",
  "password": "123123",
  "favoriteVideos": [
    {
      "title": "Video 1",
      "description": "Video desc 1",
      "url": "none",
      "publicationDate": "2024-02-05",
      "categories": [
        "Action"
      ],
      "viewsAverage": 0,
      "favorite": true
    }
  ]
}
```

GET ** /api/v1/users/user-details **

```json
{
  "id": "string",
  "username": "string",
  "password": "string",
  "favoriteVideos": [
    {
      "id": "string",
      "title": "string",
      "description": "string",
      "url": "string",
      "publicationDate": "2024-02-05",
      "categories": [
        "string"
      ],
      "viewsAverage": 0,
      "favorite": true
    }
  ]
}
```

DELETE ** /api/v1/users/delete **
```http request
  HTTP/1.1 200 OK
```

PUT ** /api/v1/users/{id}/updateUserPassword **

```json
{
  "id": "string",
  "username": "string",
  "password": "string",
  "favoriteVideos": [
    {
      "id": "string",
      "title": "string",
      "description": "string",
      "url": "string",
      "publicationDate": "2024-02-05",
      "categories": [
        "string"
      ],
      "viewsAverage": 0,
      "favorite": true
    }
  ]
}
```

PUT ** /api/v1/users/{id}/addVideoToFavorites **

```json
{
  "id": "string",
  "title": "string",
  "description": "string",
  "url": "string",
  "publicationDate": "2024-02-05",
  "categories": [
    "string"
  ],
  "viewsAverage": 0,
  "favorite": true
}
```

# video-controller

POST ** /api/v1/videos/create **

```json
{
  "id": "string",
  "title": "string",
  "description": "string",
  "url": "string",
  "publicationDate": "2024-02-05",
  "categories": [
    "string"
  ],
  "viewsAverage": 0,
  "favorite": true
}
```

GET ** /api/v1/videos/all **

GET ** /api/v1/videos/search **

GET ** /api/v1/videos/search **

DELETE ** /api/v1/videos/{id} **

PUT ** /api/v1/videos/{id} **

```json
{
  "id": "string",
  "title": "string",
  "description": "string",
  "url": "string",
  "publicationDate": "2024-02-05",
  "categories": [
    "string"
  ],
  "viewsAverage": 0,
  "favorite": true
}
```

GET ** /api/v1/videos/{id} **