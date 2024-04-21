import java.util.Stack;

public class Numeros {
    public Stack<Integer> numeros = new Stack<>();
    public Stack<Integer> num_Pares = new Stack<>();
    public Stack<Integer> num_Impares = new Stack<>();

    void adicionar(int valor){
        if (ehPar(valor)){
            numeros.push(valor);
            num_Pares.push(valor);
        }else{
            num_Impares.push(valor);
        }
    }

    boolean ehPar(int valor){
        if ((valor%2)== 0){
            return true;
        }
        return false;
    }
}
