O projeto Javacotacao é uma aplicação em Java desenvolvida com o framework Spring Boot. 
Seu propósito é obter a cotação do dólar de uma API externa (Projeto 2 em Python) e exibir esse valor no console. 
O processo de obtenção da cotação é agendado para ocorrer a cada 30 minutos.

# Como Executar o Projeto

## Clone o repositório do projeto: 

git clone https://github.com/nevitonvelho/cotacao-java

## Navegue até o diretório do projeto:

cd java-cotacao

### A cotação do dólar será exibida no console conforme o agendamento.

# Configuração Adicional

Verifique o arquivo application.properties para configurar propriedades, como a URL da API do Projeto 2.(ex: projeto2.api.url=http://localhost:5000/cotacao-dolar)

# Dependências

Java 17
Spring Boot 2.6
Maven
Biblioteca Jackson para processamento de JSON

Este projeto faz parte de uma solução maior que envolve a colaboração com um Projeto 2  em Python para obter informações de cotação do dólar. 
Certifique-se de que o Projeto 2 esteja em execução e forneça uma API válida para a correta funcionalidade deste projeto.
 
Projeto 2: https://github.com/nevitonvelho/cotacao-python-api


