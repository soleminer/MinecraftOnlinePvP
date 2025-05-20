public class PvPCommand {

    private final PvPGame pvpGame;

    public PvPCommand(PvPGame pvpGame) {
        this.pvpGame = pvpGame;
    }

    public void executeStartCommand(Player player) {
        if (pvpGame.isGameRunning()) {
            player.sendMessage("A PvP match is already in progress!");
            return;
        }
        pvpGame.startGame();
        player.sendMessage("The PvP match has started!");
    }

    public void executeJoinCommand(Player player) {
        if (!pvpGame.isGameRunning()) {
            player.sendMessage("There is no PvP match currently running. Use /start to begin a match.");
            return;
        }
        pvpGame.addPlayer(player);
        player.sendMessage("You have joined the PvP match!");
    }

    public void executeLeaveCommand(Player player) {
        if (!pvpGame.isGameRunning() || !pvpGame.isPlayerInGame(player)) {
            player.sendMessage("You are not in a PvP match.");
            return;
        }
        pvpGame.removePlayer(player);
        player.sendMessage("You have left the PvP match.");
    }
}