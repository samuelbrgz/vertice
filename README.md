# Vértice

**Sistema de Gerenciamento de Campeonatos de Valorant**

O Vértice é uma aplicação desktop desenvolvida em Java para organizar e gerenciar campeonatos de Valorant, inspirada no modelo de equipes parceiras do **Valorant Champions Tour (VCT)**.

O projeto está sendo desenvolvido para a disciplina de Programação Orientada a Objetos (POO).

## Funcionalidades planejadas

- Cadastro de equipes e jogadores.
- Criação de campeonatos e inscrição de equipes.
- Sorteio dos confrontos e chaveamento de eliminação simples, com *bye* quando necessário.
- Registro de placares, avanço dos vencedores e definição do campeão.
- Histórico de participações e conquistas das equipes.

## Tecnologias

- Java, Java Swing e Apache Maven
- PostgreSQL 17, com JDBC e SQL puro
- Docker
- Git e GitHub

## Arquitetura

O sistema é dividido em três camadas:

- **View/Controller** (`ui`): interface gráfica.
- **Service** (`service`): regras de negócio.
- **Persistência** (`repository`): acesso ao banco de dados com JDBC.

A comunicação entre interface e Service utiliza DTOs, e o Service acessa a persistência por meio de interfaces de Repository.

## Estado do projeto

**Em desenvolvimento.** O cadastro de equipes e jogadores está implementado de ponta a ponta, com persistência no PostgreSQL. As próximas etapas são a listagem de equipes e o gerenciamento de campeonatos.

## Como executar

Pré-requisitos: JDK na versão configurada no `pom.xml`, Maven (ou NetBeans) e Docker.

**1. Criar o banco de dados** (na pasta do projeto):

```bash
docker run --name vertice-db -e POSTGRES_USER=vertice -e POSTGRES_PASSWORD=vertice123 -e POSTGRES_DB=vertice -p 5432:5432 -v vertice-dados:/var/lib/postgresql/data -d postgres:17
```

**2. Criar as tabelas:**

```bash
docker exec -i vertice-db psql -U vertice -d vertice < schema.sql
```

**3. Executar a aplicação:** abra o projeto no NetBeans e execute-o (*Run Project*).

## Objetivo acadêmico

Aplicar conceitos de Programação Orientada a Objetos, arquitetura em camadas, padrões de projeto, interfaces gráficas, modelagem UML e persistência de dados utilizando SQL.
