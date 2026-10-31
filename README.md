# Vértice

**Sistema de Gerenciamento de Campeonatos de Valorant**

O Vértice é uma aplicação desktop desenvolvida em Java para organizar e gerenciar campeonatos de Valorant, inspirada no modelo de equipes parceiras do **Valorant Champions Tour (VCT)**.

O sistema utiliza um cadastro centralizado de equipes, permitindo que organizações previamente cadastradas participem de diferentes campeonatos.

O projeto está sendo desenvolvido para a disciplina de Programação Orientada a Objetos (POO).

## Funcionalidades planejadas

- Cadastro e gerenciamento de equipes e jogadores.
- Criação e gerenciamento de campeonatos.
- Seleção de equipes previamente cadastradas.
- Inscrição de equipes em campeonatos.
- Sorteio automático dos confrontos.
- Geração de chaveamentos de eliminação simples.
- Passagem automática de rodada (*bye*) quando necessário.
- Registro dos placares das partidas.
- Avanço automático dos vencedores.
- Definição do campeão.
- Consulta ao histórico de participações e conquistas das equipes.

## Tecnologias

- Java
- Java Swing (JFrame e JPanel)
- Apache Maven
- SQL puro e JDBC
- Git e GitHub

## Arquitetura

O sistema está sendo desenvolvido com separação em três camadas:

- **View/Controller:** interface gráfica e interação com o usuário.
- **Service:** regras de negócio e processamento das operações.
- **Persistência/Database:** armazenamento e recuperação dos dados.

A comunicação entre View/Controller e Service utiliza DTOs (*Data Transfer Objects*).

## Estado do projeto

**Em desenvolvimento.**

Atualmente, estão implementadas as classes iniciais de domínio e a interface de cadastro de equipes, com comunicação entre View/Controller e Service. A persistência em banco de dados ainda não foi implementada.

## Objetivo acadêmico

Aplicar conceitos de Programação Orientada a Objetos, arquitetura em camadas, padrões de projeto, interfaces gráficas, modelagem UML e persistência de dados utilizando SQL.
