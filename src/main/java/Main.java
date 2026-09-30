
public class Main {
    static void main() throws Exception {
        ClienteViaCep clienteCep = new ClienteViaCep();

        System.out.print(clienteCep.retornaCliente());

        ClienteItemCardapio clienteItemCardapio = new ClienteItemCardapio();
        System.out.print(clienteItemCardapio.retornaCliente());
    }
}
