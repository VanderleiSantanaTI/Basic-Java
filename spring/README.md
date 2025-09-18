# Spring Backend API

Uma API RESTful completa desenvolvida com Spring Boot, incluindo autenticação JWT, autorização baseada em roles, documentação Swagger e muito mais.

## 🚀 Funcionalidades

- **Autenticação JWT**: Sistema completo de autenticação com tokens JWT
- **Autorização**: Controle de acesso baseado em roles (USER, ADMIN, MODERATOR)
- **Banco de Dados**: Suporte para H2 (desenvolvimento) e PostgreSQL (produção)
- **Documentação**: Swagger/OpenAPI integrado
- **Validação**: Validação de dados com Bean Validation
- **Tratamento de Erros**: Handler global de exceções
- **Monitoramento**: Actuator para health checks e métricas
- **Testes**: Testes unitários e de integração
- **CORS**: Configurado para permitir requisições cross-origin

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Security**
- **Spring Data JPA**
- **H2 Database** (desenvolvimento)
- **PostgreSQL** (produção)
- **JWT (JSON Web Tokens)**
- **Swagger/OpenAPI 3**
- **Maven**
- **JUnit 5**

## 📋 Pré-requisitos

- Java 17 ou superior
- Maven 3.6+
- PostgreSQL (opcional, para produção)

## 🔧 Instalação e Configuração

### 1. Clone o repositório
```bash
git clone <url-do-repositorio>
cd spring-backend
```

### 2. Configure o banco de dados

#### Para desenvolvimento (H2 - padrão):
O projeto já está configurado para usar H2 em memória. Não é necessária configuração adicional.

#### Para produção (PostgreSQL):
1. Instale e configure o PostgreSQL
2. Crie um banco de dados
3. Atualize o arquivo `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/seu_banco
    username: seu_usuario
    password: sua_senha
    driver-class-name: org.postgresql.Driver
  jpa:
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
```

### 3. Execute a aplicação

```bash
# Compilar e executar
mvn spring-boot:run

# Ou apenas executar o JAR
mvn clean package
java -jar target/spring-backend-1.0.0.jar
```

A aplicação estará disponível em: `http://localhost:8080`

## 📚 Endpoints da API

### Autenticação
- `POST /api/auth/register` - Registrar novo usuário
- `POST /api/auth/login` - Fazer login
- `GET /api/auth/health` - Verificar saúde da API

### Usuários (requer autenticação)
- `GET /api/users` - Listar todos os usuários (ADMIN)
- `GET /api/users/{id}` - Buscar usuário por ID
- `PUT /api/users/{id}` - Atualizar usuário
- `DELETE /api/users/{id}` - Desativar usuário (ADMIN)
- `POST /api/users/{id}/activate` - Ativar usuário (ADMIN)

### Exemplo
- `GET /api/example/public` - Endpoint público
- `GET /api/example/user` - Endpoint para usuários
- `GET /api/example/admin` - Endpoint para administradores
- `POST /api/example/data` - Enviar dados

## 🔐 Autenticação

### Registro de Usuário
```bash
curl -X POST http://localhost:8080/api/auth/register \
  -H "Content-Type: application/json" \
  -d '{
    "name": "João Silva",
    "email": "joao@example.com",
    "password": "senha123"
  }'
```

### Login
```bash
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{
    "email": "joao@example.com",
    "password": "senha123"
  }'
```

### Usar Token JWT
```bash
curl -X GET http://localhost:8080/api/users \
  -H "Authorization: Bearer SEU_TOKEN_JWT_AQUI"
```

## 📖 Documentação da API

### Swagger UI
Acesse a documentação interativa da API em:
`http://localhost:8080/api/swagger-ui.html`

### OpenAPI JSON
Especificação OpenAPI em formato JSON:
`http://localhost:8080/api/api-docs`

## 🗄️ Banco de Dados

### H2 Console (Desenvolvimento)
Acesse o console do H2 em:
`http://localhost:8080/api/h2-console`

Configurações:
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: `password`

## 🧪 Testes

### Executar todos os testes
```bash
mvn test
```

### Executar testes específicos
```bash
mvn test -Dtest=AuthControllerTest
```

## 📊 Monitoramento

### Actuator Endpoints
- `GET /api/actuator/health` - Status de saúde da aplicação
- `GET /api/actuator/info` - Informações da aplicação
- `GET /api/actuator/metrics` - Métricas da aplicação

## 🔧 Configurações

### Variáveis de Ambiente
- `SPRING_PROFILES_ACTIVE` - Perfil ativo (dev, prod)
- `DATABASE_URL` - URL do banco de dados
- `DATABASE_USERNAME` - Usuário do banco
- `DATABASE_PASSWORD` - Senha do banco
- `JWT_SECRET` - Chave secreta para JWT
- `JWT_EXPIRATION` - Tempo de expiração do JWT

### Perfis
- `dev` - Configurações para desenvolvimento
- `prod` - Configurações para produção

## 🚀 Deploy

### Docker
```bash
# Construir imagem
docker build -t spring-backend .

# Executar container
docker run -p 8080:8080 spring-backend
```

### Heroku
```bash
# Fazer login no Heroku
heroku login

# Criar app
heroku create seu-app-name

# Configurar variáveis de ambiente
heroku config:set SPRING_PROFILES_ACTIVE=prod
heroku config:set DATABASE_URL=sua_url_do_banco

# Deploy
git push heroku main
```

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/example/springbackend/
│   │   ├── config/          # Configurações
│   │   ├── controller/      # Controladores REST
│   │   ├── dto/            # Data Transfer Objects
│   │   ├── exception/      # Tratamento de exceções
│   │   ├── model/          # Entidades JPA
│   │   ├── repository/     # Repositórios
│   │   ├── service/        # Serviços
│   │   └── SpringBackendApplication.java
│   └── resources/
│       └── application.yml
└── test/
    └── java/com/example/springbackend/
        └── controller/      # Testes
```

## 🤝 Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 📞 Suporte

Se você tiver alguma dúvida ou problema, abra uma issue no repositório.

## 🔄 Changelog

### v1.0.0
- Implementação inicial da API
- Sistema de autenticação JWT
- CRUD de usuários
- Documentação Swagger
- Testes básicos
- Configuração de segurança
- Tratamento de exceções global 