package Controller;

import java.util.Queue;

import br.edu.fateczl.filaobj.*;

public class FilaController {
	Fila fila = new Fila();

public void inserirNovaSenha(Queue<Integer> fila, Queue<Integer> filaPrioritarios, int novaSenha, int prioridade) {
    if (prioridade == 1) {
        filaPrioritarios.offer(novaSenha);
        System.out.println("\nSenha " + novaSenha + " inserida na fila de prioritários.");
    } else if (prioridade == 2) {
        fila.offer(novaSenha);
        System.out.println("\nSenha " + novaSenha + " inserida na fila de não prioritários.");
    } else {
        System.out.println("\nPrioridade inválida!");
    }
}

public void chamarProximoCliente(Queue<Integer> fila, Queue<Integer> filaPrioritarios) {
    if (!filaPrioritarios.isEmpty()) {
        System.out.println("\nChamando próximo cliente prioritário - Senha: " + filaPrioritarios.poll());
        if (!fila.isEmpty()) {
            System.out.println("\nChamando próximo cliente não prioritário - Senha: " + fila.poll());
        } else {
            System.out.println("\nNão há clientes não prioritários na fila.");
        }
    } else if (!fila.isEmpty()) {
        System.out.println("\nChamando próximo cliente não prioritário - Senha: " + fila.poll());
        if (!fila.isEmpty()) {
            System.out.println("\nChamando próximo cliente não prioritário - Senha: " + fila.poll());
            if (!fila.isEmpty()) {
                System.out.println("\nChamando próximo cliente não prioritário - Senha: " + fila.poll());
            } else {
                System.out.println("\nNão há mais clientes "+ fila.poll());
            }
        }
    }
}
}