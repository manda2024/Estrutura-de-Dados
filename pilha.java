import java.util.Stack;
public class pilha {

    public static void main (String[] args) {
    System.out.println("Pilha de nomes");
    Stack<String> nomes = new Stack<>();
    nomes.push("Jardiele");
    nomes.push("Gabi");
    nomes.push("Gabriel");
    System.out.println("Aqui é o nome que está no topo da pilha: " + nomes.pop());
    System.out.println("Foi colocado um novo elemento no topo: " + nomes.peek());
    System.out.println("Agora a pilha está desse jeito: " + nomes);
    }
}