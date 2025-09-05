# 🖥️ Sistema de Login e Cadastro em Java (Swing)

Este projeto é uma aplicação de **Tela de Login e Cadastro de Usuários** desenvolvida em **Java** utilizando **Swing** para a interface gráfica e conexão com **MySQL** para persistência de dados.  
Foi criado como estudo prático de **Programação Orientada a Objetos (POO)**, **MVC** e **Integração com Banco de Dados**.

---

## 🚀 Funcionalidades

- ✅ Tela de **Login** com validação de credenciais.  
- ✅ Tela de **Cadastro** com:
  - Verificação de campos obrigatórios.
  - Verificação de e-mail duplicado.
  - Verificação de senha e confirmação.  
- ✅ Conexão com banco de dados **MySQL**.  

---

## 🛠️ Tecnologias Utilizadas

- **Java SE** (JDK 8+)
- **Swing** (Interface gráfica)
- **MySQL** (Banco de dados)
- **JDBC** (Driver de conexão)
- **NetBeans IDE** (desenvolvimento)

---

## Como Rodar?

1. Localize o arquivo "config-exemplo.properties" dentro das pastas: 

    - prjLogin/src/resources/config-example.properties

2. altere as informações do arquivo "config-exemplo.properties" seguindo este padrao:

    - db.url=jdbc:mysql://localhost:3306/suaDataBase
    - db.user=SEU_USUARIO
    - db.password=SUA_SENHA
    
- Renomeie o arquivo "config-exemplo.properties" para "config.properties"

- No seu banco de dados MySQL crie a tabela: 

```sql
-- Criar o banco de dados
CREATE DATABASE prjlogin;

-- Selecionar o banco de dados
USE prjlogin;

-- Criar a tabela de usuários
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE
);


