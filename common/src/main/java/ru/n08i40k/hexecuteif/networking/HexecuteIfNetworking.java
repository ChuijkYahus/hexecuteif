package ru.n08i40k.hexecuteif.networking;

import dev.architectury.networking.NetworkChannel;
import net.minecraft.server.level.ServerPlayer;

import static ru.n08i40k.hexecuteif.HexecuteIf.id;

public class HexecuteIfNetworking {
    private static final NetworkChannel CHANNEL = NetworkChannel.create(id("networking_channel"));

    public static void init() {
    }

    public static <T> void sendToServer(T message) {
        CHANNEL.sendToServer(message);
    }

    public static <T> void sendToPlayer(ServerPlayer player, T message) {
        CHANNEL.sendToPlayer(player, message);
    }

    public static <T> void sendToPlayers(Iterable<ServerPlayer> players, T message) {
        CHANNEL.sendToPlayers(players, message);
    }
}
