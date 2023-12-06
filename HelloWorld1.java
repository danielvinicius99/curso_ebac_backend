public class HelloWorld1 {
    public static void main(String[] args) {
        String INTERFACE = args[0];
        if (INTERFACE.equalsIgnoreCase("BackEnd")) {
        System.out.print("Executando em BackEnd");
        }
        else {System.out.print("Não é BackEnd");}
    }
}