import java.util.Scanner;

public class BarbutGame {
    JucatorBarbut jucatorBarbut1;
    JucatorBarbut jucatorBarbut2;

    public BarbutGame() {
         jucatorBarbut1 = new JucatorBarbut();
         jucatorBarbut2 = new JucatorBarbut();
    }

    public void startGame() {
        System.out.println("Player 1 ready?\nYes/No");
        String answer = new Scanner(System.in).next();
        if (answer.equals("Yes")) {
            jucatorBarbut1.rollDices();
            System.out.println("Player 1 rolled " + jucatorBarbut1.getDicesResult());
        }

        System.out.println("Player 2 ready?\nYes/No");
        answer = new Scanner(System.in).next();
        if (answer.equals("Yes")) {
            jucatorBarbut2.rollDices();
            System.out.println("Player 2 rolled " + jucatorBarbut2.getDicesResult());
        }
        checkWinner(jucatorBarbut1, jucatorBarbut2);
    }

    private void checkWinner(JucatorBarbut p1, JucatorBarbut p2){
        if(p1.getDicesResult()>p2.getDicesResult())
            System.out.println("Player 1 wins");
        else if(p1.getDicesResult()<p2.getDicesResult())
            System.out.println("Player 2 wins");
        else System.out.println("Is a draw!!!");
    }
}
