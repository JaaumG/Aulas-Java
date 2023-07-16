# Leitura e Escrita de arquivos

Dependendo do seu software há necessidade de ler ou até mesmo de escrever arquivos.
E em java há o objeto File que é responsável por isso.

## File

O objeto File é responsável por manipular arquivos e diretórios.

### Criando um objeto File

Para criar um objeto File é necessário passar o caminho do arquivo ou diretório.

```java
File file = new File("C:\\Users\\joaog\\Desktop\\teste.txt");
```

### Criando um arquivo

Para criar um arquivo é necessário passar o caminho do arquivo e o nome do arquivo.

```java
File file = new File("C:\\Users\\joaog\\Desktop", "teste.txt");
```

### Criando um diretório

Para criar um diretório é necessário passar o caminho do diretório e o nome do diretório.

```java
File file = new File("C:\\Users\\joaog\\Desktop", "teste");
```

O objeto oferece uma lista de métodos para manipular arquivos e diretórios.

* createNewFile() - Cria um novo arquivo.
* mkdir() - Cria um novo diretório.
* mkdirs() - Cria um novo diretório e os diretórios necessários para criar o diretório.
* delete() - Deleta o arquivo ou diretório.
* exists() - Verifica se o arquivo ou diretório existe.
* isFile() - Verifica se é um arquivo.
* isDirectory() - Verifica se é um diretório.
* renameTo(File) - Renomeia o arquivo ou diretório.
* list() - Retorna um array de String com os arquivos e diretórios.
* listFiles() - Retorna um array de File com os arquivos e diretórios.
* length() - Retorna o tamanho do arquivo em bytes.
* lastModified() - Retorna a data da última modificação do arquivo.
* getAbsolutePath() - Retorna o caminho absoluto do arquivo ou diretório.


## Lendo um arquivo
Assim como input do usuario direto no console utilizamos do objeto Scanner, mas especificando como System.in no 
construtor, podemos utilizar o mesmo objeto mas passando nos parametros do construtor, não System.in mas sim o objeto file.

E utilizando de um loop podemos ler o arquivo linha por linha.

```java
File arquivo = new File("C:\\Windows\\Temp\\arquivo.txt"); //Esse é um arquivo que existe em meu computador

try (Scanner sc = new Scanner(arquivo)){
    while(sc.hasNextLine()) {
        System.out.println(sc.nextLine());
    }
}catch (Exception e) {
    System.out.println("Erro: " + e.getMessage());
}
```

Mas se você for trabalhar com leitura e escrita de arquivos é recomendado o uso 
do objeto BufferedReader.

```java
FileReader fr = new FileReader("C:\\Windows\\Temp\\arquivo.txt");
BufferedReader br = new BufferedReader(fr);

String linha = br.readLine();

while(linha != null) {
    System.out.println(linha);
    linha = br.readLine();
}

br.close();
fr.close();
```

## Escrevendo em um arquivo

Para escrever em um arquivo é necessário utilizar o objeto FileWriter.

```java
FileWriter fw = new FileWriter("C:\\Windows\\Temp\\arquivo.txt");
BufferedWriter bw = new BufferedWriter(fw);

bw.write("Escrevendo uma mensagem no arquivo");
bw.newLine();
bw.write("Pulando uma linha");
bw.close();
fw.close();
```
