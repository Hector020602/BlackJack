public class Main2 {
    public static void main(String[] args) {
        Hand player1 = new Hand();
        Hand player2 = new Hand();
        boolean gameOverPlayer1 = false;
        boolean gameOverPlayer2 = false;

        while (!gameOverPlayer1 && !gameOverPlayer2) {
            if (!gameOverPlayer1) {
                System.out.println("Turno de player 1");
                System.out.println(player1);
                gameOverPlayer1 = player1.getNewCard();
                if (player1.blackJackNumber() >= 21) {
                    gameOverPlayer1 = true;
                    System.out.println(player1);
                    System.out.println("Te has pasado de 21");
                }
            }
            if (!gameOverPlayer2) {
                System.out.println("Turno de player 2");
                System.out.println(player2);
                gameOverPlayer2 = player2.getNewCard();
                if (player2.blackJackNumber() >= 21) {
                    gameOverPlayer2 = true;
                    System.out.println(player2);
                    System.out.println("Te has pasado de 21");
                }
            }
        }
        System.out.println(player1); //A partir de aquí son las condiciones de si ganas o pierdes
        if (player1.blackJackNumber() > 21) {
            System.out.println("Eres malo");
        } else if (player2.blackJackNumber() == 21) {
            System.out.println("Lo has hecho muy bien");
        } else {
            System.out.println("Te has quedado a " + (21 - player2.blackJackNumber()) + " de ser un ganador");
        }

    }
}
