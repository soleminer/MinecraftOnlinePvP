public class PvPGame {
    private boolean gameActive;
    private int playerScore;

    public PvPGame() {
        this.gameActive = false;
        this.playerScore = 0;
    }

    public void startGame() {
        if (!gameActive) {
            gameActive = true;
            // Additional logic to initialize the game
        }
    }

    public void stopGame() {
        if (gameActive) {
            gameActive = false;
            // Additional logic to finalize the game
        }
    }

    public void addScore(int score) {
        if (gameActive) {
            playerScore += score;
        }
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public boolean isGameActive() {
        return gameActive;
    }
}