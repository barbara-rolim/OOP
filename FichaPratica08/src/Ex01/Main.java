package Ex01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Barbara", 34, 1.65);

        System.out.println("Nome: " + pessoa1.getNome() + "\nIdade: " + pessoa1.getIdade() + "\nAltura: " + pessoa1.getAltura());
    }
}
