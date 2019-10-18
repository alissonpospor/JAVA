# Curso Java COMPLETO
Repositório de armazenamento para o [curso de Java](https://www.udemy.com/course/java-curso-completo/).

## Teclas de atalho:
  - 'ALT + Shif + R' = Renomear nomes de Variáveis.
  - 'Ctrl + Shift + F' = Ambienta código.
  - 'Ctrl + Shift + O' = Importa pacote.
  - 'Botão direito -> Source -> Generate Getters and Setters'.

## Documentação:
### 1. Introdução:
  - First nested list item
    - Second nested list item
    
### 2. Conceitos de programação:
  #### [Material de apoio](https://github.com/alissonpospor/JAVA/blob/master/material-de-apoio-do-curso/02-conceitos-de-programacao.pdf). 

### 3. Introdução de linguagem Java:
  #### [Material de apoio](https://github.com/alissonpospor/JAVA/blob/master/material-de-apoio-do-curso/03-introducao-linguagem-java.pdf).
   
### 4. Estrutura sequencial:
  #### [Material de apoio](https://github.com/alissonpospor/JAVA/blob/master/material-de-apoio-do-curso/04-estrutura-sequencial.pdf).
  
## 5. Introdução à Programação Orientada a Objetos:
  #### [Material de apoio](https://github.com/alissonpospor/JAVA/blob/master/material-de-apoio-do-curso/08-classes-atributos-membros-staticos.pdf).
  #### [Material de apoio II](https://github.com/alissonpospor/JAVA/blob/master/material-de-apoio-do-curso/09-construtores-this-sobrecarga-encapsulamento.pdf).

###   5.1. Classes:
  #### [Material de apoio](https://github.com/alissonpospor/JAVA/blob/master/material-de-apoio-do-curso/05-estrutura-condicional.pdf).
  ####  -Toda classe em Java é uma subclasse da classe Object
  - É um tipo estruturado que pode conter (membros):
    - Atributos (dados/campos);
    - Métodos (funções/operações);
  - A Classe também pode prover muitos outros recursos, tais como:
    - Construtores;
    - Sobrecarga;
    - Encapsulamento;
    - Herança;
    - Polimorfismo;
    
###   5.2. Membros estáticos:
  - Também chamados membros de classe.
    - Em oposição a membros e instância.
  - São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.
  - Aplicações comuns:
    - Classes utilitárias.
    - Declaração de constantes.
    
### 5.3. Construtores:
#### É uma operação especial da classe, que executa no momento da instanciação do objeto.
  - Usos comuns:
    - Iniciar valores dos atributos.
    - Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência).
  - Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
    - Product p = new Product();
  - É possível especificar mais de um construtor na mesma classe (sobrecarga).
  
### 5.4. Palavra this:
  - É uma referência para o próprio objeto.
  - Usos comuns:
    - Diferenciar atributos de variáveis locais
    - Passar o próprio objeto como argumento na chamada de um método ou construtor
    
### 5.5. Sobrecarga:
  - É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.
  
### 5.6 Encapsulamento:
  - É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.
  - Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

### 5.7 Modificadores de acesso:
  - _private_: o membro só pode ser acessado na _própria_ _classe_.
  - (nada): o membro só pode ser acessado nas classes do _mesmo_ _pacote_.
  - _protected_: o membro só pode ser acessado no _mesmo _pacote, bem como em _subclasses_ _de_ _pacotes_ _diferentes_.
  - _public_: o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está).