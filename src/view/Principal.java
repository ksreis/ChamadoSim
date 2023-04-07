package view;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import Controller.FilaController;
import br.edu.fateczl.filaobj.*;

public class Principal {

	    public static void main(String[] args) {
	        
	        Queue<Integer> fila = new LinkedList<Integer>();
	        Queue<Integer> filaPrioritarios = new LinkedList<Integer>();
	        int senha = 1;
	        
	        // Inicializa as senhas prioritários
	        filaPrioritarios.offer(senha++);
	        filaPrioritarios.offer(senha++);
	        
	        // Inicializa as senhas não prioritários
	        fila.offer(senha++);
	        fila.offer(senha++);
	        fila.offer(senha++);
	        
	        FilaController controller = new FilaController();
	        
	        Scanner sc = new Scanner(System.in);
	        int opcao = 0;
	        
	        do {
	            System.out.println("\nSelecione uma opção:\n1 - Inserir nova senha\n2 - Chamar próximo cliente\n3 - Encerrar atendimento");
	            opcao = sc.nextInt();
	            
	            switch (opcao) {
	            case 1:
	                System.out.println("\nDigite a prioridade do cliente (1 - prioritário, 2 - não prioritário): ");
	                int prioridade = sc.nextInt();
	                controller.inserirNovaSenha(fila, filaPrioritarios, senha++, prioridade);
	                break;
	            case 2:
	                controller.chamarProximoCliente(fila, filaPrioritarios);
	                break;
	            case 3:
	                System.out.println("\nEncerrando atendimento..");
	                break;
	            default:
	                System.out.println("\nOpção inválida!");
	                break;
	            }
	            
	        } while (opcao != 3);
	        
	        sc.close();
	        
	    }

}
