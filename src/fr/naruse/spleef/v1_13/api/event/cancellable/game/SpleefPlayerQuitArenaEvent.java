package fr.naruse.spleef.v1_13.api.event.cancellable.game;

import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.event.SpleefCancellable;
import fr.naruse.spleef.v1_13.api.event.cancellable.SpleefCancellableEvent;
import fr.naruse.spleef.v1_13.game.spleef.Spleef;
import org.bukkit.entity.Player;

public class SpleefPlayerQuitArenaEvent extends SpleefCancellableEvent {

    public SpleefPlayerQuitArenaEvent(SpleefPluginV1_13 pl, String eventName) {
        super(pl, eventName);
    }

    @SpleefCancellable
    public static class Pre extends SpleefPlayerQuitArenaEvent {
        private Spleef spleef;
        private Player player;
        public Pre(SpleefPluginV1_13 pl, Spleef spleef, Player player) {
            super(pl, "SpleefPlayerQuitArenaEvent.Pre");
            this.spleef = spleef;
            this.player = player;
        }

        public Player getPlayer() {
            return player;
        }

        public Spleef getSpleef() {
            return spleef;
        }
    }

    public static class Post extends SpleefPlayerQuitArenaEvent {
        private Player player;
        public Post(SpleefPluginV1_13 pl, Player player) {
            super(pl, "SpleefPlayerQuitArenaEvent.Post");
            this.player = player;
        }

        public Player getPlayer() {
            return player;
        }
    }
}
