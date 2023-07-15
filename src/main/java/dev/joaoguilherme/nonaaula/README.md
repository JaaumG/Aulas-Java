# Abstração, Classes abstratas, e interfaces

Era uma vez José, um homem de 43 anos mora no interior de São Paulo, 
e trabalha como professor, já no estado de Tocantins temos Maria, uma mulher de 25 anos recém-formada no 
seu curso de direito.

O que essas duas pessoas tem em comum? Bom você pode alegar que nada, pois são pessoas diferentes, idades diferentes
estados diferentes, e você estaria certo, de fato eles não possuem nenhuma característica em comum.

Mas perceba uma coisa, ambos são pessoas, isso, pois uma pessoa é um adjetivo genérico para definir alguém, falando que 
um indivíduo é uma pessoa informa tão pouco sobre ela que se impossibilita diferenciá-la das demais pessoas.

E mesmo falando sobre o substantivo pessoa temos dificuldade para ter uma ideia precisa do que estamos falando, isso é 
um exemplo de uma ideia abstrata, não é nada concreto e bem definido, diferente de uma definição de um giz branco, você
tem uma imagem bem precisa de um giz branco, diferente de pessoa.

Voltando a nossa história, podemos dizer que pessoa por vez, é tanto uma abstração de José tanto de Maria.

## Abstração na programação

Abstração é um conceito que permite a criação de modelos que simplificam problemas complexos,
para podermos entender melhor o problema e resolvê-lo de forma mais fácil.

A abstração é um dos pilares da programação orientada a objetos, e é um dos conceitos mais importantes
para a criação de um bom software.

## Classes abstratas

Classes abstratas são classes que não podem ser instanciadas, ou seja, não podem ser criadas objetos a partir delas.

```java
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private String email;
    private String sexo;
    private String estadoCivil;
    private String nacionalidade;
    private String naturalidade;
    private String dataNascimento;
    private String dataCadastro;
    private String dataAtualizacao;
    private String dataExclusao;
    private String observacao;
}
```

A classe Pessoa é uma classe abstrata, pois não faz sentido criar um objeto do tipo Pessoa, pois Pessoa é uma abstração
de um ser humano, e não um ser humano em si.

## Interfaces

Interfaces são um tipo de classe abstrata, porém, todas as suas variáveis são constantes, e todos os seus métodos são
abstratos.

```java
public interface Pessoa {
    String getNome();
    int getIdade();
    String getCpf();
    String getRg();
    String getEndereco();
    String getTelefone();
    String getEmail();
    String getSexo();
    String getEstadoCivil();
    String getNacionalidade();
    String getNaturalidade();
    String getDataNascimento();
    String getDataCadastro();
    String getDataAtualizacao();
    String getDataExclusao();
    String getObservacao();
}
```

A interface Pessoa é uma interface, pois ela é uma abstração de um ser humano, e não um ser humano em si.
