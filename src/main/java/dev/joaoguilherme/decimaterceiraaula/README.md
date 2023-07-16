# Conexão com o banco de dados

Em certas ocasiões é necessário que seu software guarde informações, se você for
armazenar essas informações em memória RAM, você terá alguns problemas:

* **Escalabilidade**: Se você quiser que seu software seja executado em mais de um computador, você terá que fazer com que todos os computadores tenham a mesma
informação, o que pode ser um problema.
* **Persistência**: Se você perderá informações toda vez que seu software de ser fechado.
* **Capacidade**: Você não poderá armazenar muitas informações, pois a memória RAM é limitada.

Isso só listando alguns problemas que você terá.

Você pode estar pensando em fazer um arquivo que guarde as informações, só resolve um dos
três problemas, o de persistência.

A melhor solução para esse problema é usar um banco de dados, que é um software que
gerencia o armazenamento de informações.

## Banco de dados relacional

O banco de dados relacional é um banco de dados que armazena informações em tabelas,
cada tabela tem um nome e cada coluna da tabela tem um nome e um tipo, cada linha da tabela
é uma entrada.

## SQL

SQL é uma linguagem de consulta estruturada, usada para fazer consultas em bancos de
dados relacionais.

## JDBC

JDBC (Java Database Connectivity) é uma aplicação que comunica com o seu código e um banco de dados
(Uma API), com ele você consegue realizar operações de CRUD (Create, Read, Update, Delete) (Criar, Ler, Atualizar, Deletar) em um banco de dados.

E será o tópico desta aula.

