public class Main {
    public static void main(String[] args) {
        Hand myHand = new Hand();
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println(myHand);
            gameOver = myHand.getNewCard();
            if (myHand.blackJackNumber() >= 21) {
            }
        }
        System.out.println(myHand);
        if (myHand.blackJackNumber() > 21) {
            System.out.println("Sos malo");
        } else if (myHand.blackJackNumber() == 21) {
            System.out.println("Debes de ser de Mcdonalds porque sos Mcnifico");
        } else {
            System.out.println("Te has quedado a " + (21 - myHand.blackJackNumber()) + " de ser un ganador");
        }
    }
}

