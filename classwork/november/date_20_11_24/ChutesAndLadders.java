package date_20_11_24;

public class ChutesAndLadders {


    private int[] board;

    private int[] players;

    public ChutesAndLadders(int numPlayers) {
        
        board = new int[101];


        for (int i = 0; i < board.length; i++) {
            board[i] = i;
        }

        //ladders
        board[4] = 14;
        board[9] = 31;
        board[28] = 84;
        board[36] = 44;
        board[80] = 100;

        //chutes
        board[98] = 78;
        board[95] = 75;
        board[93] = 73;
        board[87] = 24;

        //players
        players = new int[numPlayers];

        for (int i = 0; i < players.length; i++) {
            players[i] = 0;
        }
    }

    public boolean isWinner(int currentPlayer, int[] players, int[] board) {
        return players[currentPlayer] == board.length - 1;
    }

    public void movePlayer(int currentPlayer, int[] players, int[] board, int roll) {
        try {
            players[currentPlayer] = players[currentPlayer] + roll;
        } catch (Exception e) {

        }
    }

    public int nextPlayer(int currentPlayer, int[] players) {
        return (currentPlayer + 1) % players.length;
    }

    public int playGame(int[] players, int[] board) {
        int currentPlayer = 0;
        Die d6 = new Die();

        while (!isWinner(currentPlayer, players, board)) {
            int roll = d6.roll();
            movePlayer(currentPlayer, players, board, roll);
            currentPlayer = nextPlayer(currentPlayer, players);
        }
        return currentPlayer;
    }

    public static void main(String[] args) {
        ChutesAndLadders game = new ChutesAndLadders(4);
        int winner = game.playGame(game.players, game.board);
        System.out.println("the winner is player " + (winner + 1));
    }
}