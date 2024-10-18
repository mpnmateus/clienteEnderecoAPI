# ClienteEnderecoAPI

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Feign](https://img.shields.io/badge/Feign-007396?style=for-the-badge&logo=feign&logoColor=white)

## Descrição do Projeto
Este projeto é uma API REST desenvolvida em Java com Spring Boot para o cadastro de clientes. A aplicação consome a API pública do [ViaCep](https://viacep.com.br) para preencher automaticamente os dados de endereço dos clientes com base no CEP informado. A API oferece endpoints para criar, atualizar, buscar e remover clientes, garantindo que as informações de endereço sejam consistentes e completas.

## Funcionalidades
- Cadastro de clientes com nome e CEP.
- Busca automática de endereço completo através da integração com a API do ViaCep.
- Atualização e remoção de clientes.
- Validação de dados de entrada.

## Tecnologias Utilizadas
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Feign](https://img.shields.io/badge/Feign-007396?style=for-the-badge&logo=feign&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2-003B57?style=for-the-badge&logo=h2&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)


## Arquitetura do Projeto
O projeto segue a estrutura MVC (Model-View-Controller) e está organizado da seguinte forma:

```
src/
 └── main/
     └── java/
         └── com/
             └── seunome/
                 └── clienteservice/
                     ├── controller/  # Controladores REST
                     ├── model/       # Entidades Cliente e Endereço
                     ├── service/     # Lógica de negócios e integração ViaCep
                     └── repository/  # Repositórios JPA

```

## Instalação

### Pré-requisitos:
- **Java 17** ou superior
- **Maven 3.8+**

### Passos para rodar o projeto:
1. Clone o repositório:
    ```bash
    git clone https://github.com/seunome/cliente-endereco-api.git
    ```
2. Navegue até a pasta do projeto:
    ```bash
    cd cliente-endereco-api
    ```
3. Execute o comando Maven para baixar as dependências e rodar o projeto:
    ```bash
    mvn spring-boot:run
    ```
4. Acesse a API localmente em: `http://localhost:8080`

## Endpoints da API

### Cadastro de Cliente
- **POST** `/clientes`
    - Request body (JSON):
    ```json
    {
        "nome": "João Silva",
        "cep": "01001-000"
    }
    ```
    - Response (JSON):
    ```json
    {
        "id": 1,
        "nome": "João Silva",
        "endereco": {
            "cep": "01001-000",
            "logradouro": "Praça da Sé",
            "bairro": "Sé",
            "cidade": "São Paulo",
            "estado": "SP"
        }
    }
    ```

### Buscar Cliente por ID
- **GET** `/clientes/{id}`

### Atualizar Cliente
- **PUT** `/clientes/{id}`

### Deletar Cliente
- **DELETE** `/clientes/{id}`

## Integração com a API ViaCep
Este projeto consome a API pública [ViaCep](https://viacep.com.br) para obter informações detalhadas sobre o endereço a partir do CEP informado pelo cliente. A integração é feita através do FeignClient, que facilita o consumo de serviços externos em RESTful APIs.

## Testes
Os testes unitários foram implementados utilizando o framework **JUnit 5**. Para rodar os testes, execute o seguinte comando Maven:
```bash
mvn test
```

## Contribuições
Contribuições são bem-vindas! Se você deseja melhorar este projeto, siga as instruções abaixo:
1. Faça um fork do repositório.
2. Crie uma nova branch: `git checkout -b feature/minha-melhoria`.
3. Faça suas modificações e commit: `git commit -m 'Minha melhoria'`.
4. Envie para o repositório remoto: `git push origin feature/minha-melhoria`.
5. Abra um Pull Request para análise.


