import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Handle player join event
        event.getPlayer().sendMessage("Welcome to the PvP game!");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        // Handle player quit event
        event.getPlayer().sendMessage("Thanks for playing!");
    }
}