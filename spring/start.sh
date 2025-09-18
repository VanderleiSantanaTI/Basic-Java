#!/bin/bash

echo "🚀 Iniciando Spring Backend API..."

# Verificar se o Java está instalado
if ! command -v java &> /dev/null; then
    echo "❌ Java não encontrado. Por favor, instale o Java 17 ou superior."
    exit 1
fi

# Verificar se o Maven está instalado
if ! command -v mvn &> /dev/null; then
    echo "❌ Maven não encontrado. Por favor, instale o Maven 3.6+."
    exit 1
fi

echo "✅ Java e Maven encontrados"

# Limpar e compilar o projeto
echo "🔨 Compilando o projeto..."
mvn clean compile

if [ $? -ne 0 ]; then
    echo "❌ Erro na compilação"
    exit 1
fi

echo "✅ Compilação concluída"

# Executar testes
echo "🧪 Executando testes..."
mvn test

if [ $? -ne 0 ]; then
    echo "❌ Testes falharam"
    exit 1
fi

echo "✅ Testes passaram"

# Executar a aplicação
echo "🌟 Iniciando a aplicação..."
echo "📖 Documentação disponível em: http://localhost:8080/api/swagger-ui.html"
echo "🗄️  H2 Console disponível em: http://localhost:8080/api/h2-console"
echo "📊 Actuator disponível em: http://localhost:8080/api/actuator/health"
echo ""
echo "⏹️  Pressione Ctrl+C para parar a aplicação"
echo ""

mvn spring-boot:run 