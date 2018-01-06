# AULA 3 - DEVOPS - AGENDA
Atualizado em 05 de janeiro de 2018 23:11
## Objetivo

Agenda para cadastrar, localizar, excluir contatos.

## Dependências
+ Java - Caso no tenha, faça o [download](https://www.java.com/pt_BR/)
+ JDK - Caso no tenha, faça o [download](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html)
+ GIT - Caso no tenha, faça o [download](https://git-scm.com/downloads) - [Como instalar?](https://woliveiras.com.br/posts/instalando-o-git-windows/)

## Download
1. Entrar no prompt de comando de seu sistema operacional. Caso não saiba como fazer isto acesse o link abaixo e siga os procedimentos informados:  
   + [Windows](https://pt.wikihow.com/Abrir-o-Prompt-de-Comando-no-Windows)
   + [Linux UBUNTU](https://www.wikihow.com/Open-a-Terminal-Window-in-Ubuntu)
   + Para os demais sistemas operacionais, por favor, consultar a internet.
	
2. Fazer o clone do repositório (Copie o código e cole no prompt de comando).
```javascript
	git clone https://github.com/rseteves/aula03.git
```
## Compilação
1. Entrar na pasta source do projeto (Copie o código e cole no prompt de comando).
```javascript
	cd aula03/Agenda/src
```
2. Fazer a compilação do projeto (Copie o código e cole no prompt de comando).
```javascript
	javac br/edu/impacta/ads/*.java
	jar cvfe AgendaApp.jar br.edu.impacta.ads.AgendaApp br/edu/impacta/ads/*
```
## Rodar o projeto
1. Para rodar o projeto basta executar a seguinte linha de comando em seu console. (Copie o código e cole no prompt de comando).
```javascript
	java -jar AgendaApp.jar
```
2. Surgira a interface do programa para interação com usuário.

	![Interface principal do sistema](https://github.com/leandrobudau/aula03/blob/master/Agenda/screen-main.png)  
	Imagem de exemplo


## Funcionalidades
Este programa possui algumas funções
### Inserir
Permite inserir um contato novo. É solicitado o nome e telefone do contato
### Buscar 
Permite buscar um contato já cadastrado. A busca é realizada por meio do campo nome.
### Listar
Permite listar todos os contatos cadastrados.
### Atualizar
Permite atualizar contato. A atualização é baseada na busca do nome do contato. Caso exista a atualização é feita.
### Excluir
Permite excluir um contato existente. A exclusão é realizada por meio do campo nome.
### Sair
Abandona a aplicação

