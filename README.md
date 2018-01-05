# AULA 3 - DEVOPS - AGENDA

## Objetivo

Agenda para cadastrar, localizar e listar contatos.

## Dependências
Java
JDK

## Download
1. Entrar no console de seu sistema operacional
2. Fazer o clone do repositório
```javascript
	git clone https://github.com/rseteves/aula03.git
```
## Compilação
1. Entrar na pasta source do projeto
```javascript
	cd aula03/Agenda/src
```
2. Fazer a compilação do projeto
```javascript
	javac br/edu/impacta/ads/*.java
	jar cvfe AgendaApp.jar br.edu.impacta.ads.AgendaApp br/edu/impacta/ads/*
```
## Rodar o projeto
1. Para rodar o projeto basta executar a seguinte linha de comando em seu console.
```javascript
	java -jar AgendaApp.jar
```
2. Surgira a interface do programa para interação com usuário.

## Desenvolvimento
Este programa possui algumas funções
### Inserir
Permite inserir um contato novo. É solicitado o nome e telefone do contato
### Buscar 
Permite buscar um contato já cadastrado. A busca é realizada por meio do campo nome.
### Excluir
Permite excluir um contato existente. A exclusão é realizada por meio do campo nome.
### Sair
Abandona a aplicação

