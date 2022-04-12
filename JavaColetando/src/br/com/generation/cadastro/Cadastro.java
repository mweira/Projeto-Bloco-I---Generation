package br.com.generation.cadastro;

import java.util.Scanner;

public class Cadastro {
		
		private String nome;
		private String cpf;
		private String email;
		private String senha;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		public void fazerCadastro()
		{
			Cadastro pessoa = new Cadastro();
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("====================  Seja bem-vinde ao aplicativo Java Coletando  =====================================================================================================\n");
			System.out.println("========================================================================================================================================================================");
			System.out.println("\n====================   Para darmos início faça o seu cadastro:   =======================================================================================================");
			System.out.print("\nInforme o seu nome: ");
			pessoa.setNome(entrada.nextLine());
			System.out.print("Informe o seu CPF: ");
			pessoa.setCpf(entrada.nextLine());
			System.out.print("Informe o seu e-mail: ");
			pessoa.setEmail(entrada.nextLine());
			System.out.print("Crie uma senha: ");
			pessoa.setSenha(entrada.nextLine());
			
			String email1;
			String senha1;
			
			System.out.println("\n=====================  Faça login para acessar a plataforma   ==========================================================================================================\n");
			System.out.println("========================================================================================================================================================================");
			System.out.print("\nDigite seu e-mail: ");
			email1 = entrada.next();
			System.out.print("Digite sua senha: ");
			senha1 = entrada.next();
			System.out.println();
			
			while(!(email1 .equals(pessoa.getEmail()) && senha1 .equals(pessoa.getSenha()))) {
				System.out.println("====================    Dados incorretos! Tente novamente.   ===========================================================================================================");
				System.out.print("\nDigite seu e-mail: ");
				email1 = entrada.next();
				System.out.print("Digite sua senha: ");
				senha1 = entrada.next();
				System.out.println();
			}
			
			System.out.println("=====================    Login efetuado com sucesso!    ================================================================================================================");
			System.out.println("\n========================================================================================================================================================================");
			
		}

	}
