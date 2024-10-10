public class Teste {
    public static void main(String[] args) {

        ProvaUCB provaUCB = new ProvaUCB(8.0, 7.5);
        ProvaFafifo provaFafifo = new ProvaFafifo(6.5, 5.5);

        System.out.println("Aluno na UCB aprovado: " + provaUCB.aprovado());
        System.out.println("Aluno na Fafifo aprovado: " + provaFafifo.aprovado());
    }
}