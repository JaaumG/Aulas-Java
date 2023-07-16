package dev.joaoguilherme.decimaquartaaula;

import java.io.*;
import java.util.Scanner;

public class DecimaQuartaAula {

	public static void main(String[] args) {


		//O objeto File representa um arquivo ou diretório no disco rígido do computador.

		//Instanciando um objeto File
		File arquivo = new File("C:\\Windows\\Temp\\arquivo.txt"); //O caminho do arquivo deve ser passado como parâmetro
		if (!arquivo.exists()) { //Verificando se o arquivo existe
			try {
				arquivo.createNewFile(); //Caso não exista, cria o arquivo
			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage()); //Imprime a mensagem de erro, caso por exemplo o arquivo não possa ser criado
			}
		} else {
			try (Scanner sc = new Scanner(arquivo)) { //Try with resources - Fecha o Scanner automaticamente
				System.out.println("Conteúdo do arquivo: ");
				while (sc.hasNextLine()) { //Enquanto houver uma próxima linha
					System.out.println(sc.nextLine()); //Imprime a próxima linha
				}
			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage()); //Imprime a mensagem de erro, caso por exemplo o arquivo não exista
			}


			//Maneira mais apropriada de fazer uma leitura de arquivo

			try (FileReader fr = new FileReader("C:\\Windows\\Temp\\arquivo.txt")) {
				BufferedReader br = new BufferedReader(fr); //BufferedReader é uma classe que lê o arquivo de forma mais rápida
				String linha = br.readLine(); //Lê a primeira linha do arquivo
				System.out.println("Conteúdo do arquivo: ");
				while (linha != null) { //Enquanto a linha não for nula
					System.out.println(linha); //Imprime a linha
					linha = br.readLine(); //Lê a próxima linha
				}
			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}

		//Escrevendo em um arquivo devemos usar o FileWriter e o BufferedWriter
		//O segundo parâmetro é um booleano que indica se o arquivo será sobrescrito ou não
		try (FileWriter fw = new FileWriter("C:\\Windows\\Temp\\arquivo.txt", true)) {
			BufferedWriter bw = new BufferedWriter(fw); //BufferedWriter é uma classe que escreve no arquivo de forma mais rápida
			Scanner sc = new Scanner(System.in); //Instanciando um objeto Scanner
			System.out.println("Digite o texto que deseja escrever no arquivo: ");
			String texto = sc.nextLine(); //Lendo o texto digitado pelo usuário
			bw.write(texto); //Escrevendo o texto no arquivo
			bw.newLine(); //Pulando uma linha
			bw.close(); //Fechando o BufferedWriter
			sc.close(); //Fechando o Scanner
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}


	}

}
