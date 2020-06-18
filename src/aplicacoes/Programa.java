package aplicacoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe o arquivo com o caminho: ");
		String path = sc.nextLine();
		
		List<Produto> listaProdutos = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path)){

			String line = br.readLine();
			
			while (line != null) {
				
			}
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		
	}

}
