import java.util.LinkedList;
import java.util.Queue;
public class fila {
    public static void main (String[] args) {
        System.out.println(".(Fila de Carro: )");
    Queue<String> Carros = new LinkedList<>();
    Carros.add("Fusca");
    Carros.add("Civic");
    Carros.add("Dodge RAM");

    System.out.println(".(Ai o que está sua fila de carros: )" + Carros);
    System.out.println(".(O Primeiro da fila é: )" + Carros.peek());
    System.out.println(".(Primeiro da fila é retirado: )" + Carros.poll());
    System.out.println(Carros.isEmpty()?"A fila está vazia": "Tem elementos na fila");
    System.out.println(".(A fila está desse jeito agora:)" + Carros);
    System.out.println(".(Fila de carros:)");
    }
}

