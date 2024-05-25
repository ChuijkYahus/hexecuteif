package ru.n08i40k.hexecuteif.api.config;

import ru.n08i40k.hexecuteif.HexecuteIf;

/**
 * Platform-agnostic class for statically accessing current config values.
 * If any of the config types (common, client, server) are not needed in your mod,
 * feel free to remove anything related to them in this class and platform-specific config implementations.
 */
public class HexecuteIfConfig {
//    private static final CommonConfigAccess dummyCommon = new CommonConfigAccess() {
//    };
//    private static final ClientConfigAccess dummyClient = new ClientConfigAccess() {
//    };
//    private static final ServerConfigAccess dummyServer = new ServerConfigAccess() {
//    };
    private static CommonConfigAccess common = null;
    private static ClientConfigAccess client = null;
    private static ServerConfigAccess server = null;

    public static CommonConfigAccess common() {
        return common;
    }
    public static ClientConfigAccess client() {
        return client;
    }
    public static ServerConfigAccess server() {
        return server;
    }

    public static void setCommon(CommonConfigAccess common) {
        if (HexecuteIfConfig.common != null) {
            HexecuteIf.LOGGER.warn("CommonConfigAccess was replaced! Old {} New {}", HexecuteIfConfig.common.getClass().getName(), common.getClass().getName());
        }
        HexecuteIfConfig.common = common;
    }

    public static void setClient(ClientConfigAccess client) {
        if (HexecuteIfConfig.client != null) {
            HexecuteIf.LOGGER.warn("ClientConfigAccess was replaced! Old {} New {}", HexecuteIfConfig.client.getClass().getName(), client.getClass().getName());
        }
        HexecuteIfConfig.client = client;
    }

    public static void setServer(ServerConfigAccess server) {

        if (HexecuteIfConfig.server != null) {
            HexecuteIf.LOGGER.warn("ServerConfigAccess was replaced! Old {} New {}", HexecuteIfConfig.server.getClass().getName(), server.getClass().getName());
        }
        HexecuteIfConfig.server = server;
    }

    public static int bound(int toBind, int lower, int upper) {
        return Math.min(Math.max(toBind, lower), upper);
    }

    public static double bound(double toBind, double lower, double upper) {
        return Math.min(Math.max(toBind, lower), upper);
    }

    public interface CommonConfigAccess {
        double multiplyContainerAccess();
        double multiplyPlayerAccess();

        boolean canAccessContainer();
        boolean canAccessPlayer();

        boolean canModifyContainer();
        boolean canModifyPlayer();

        double DEFAULT_MULTIPLY_CONTAINER_ACCESS = 1.5;
        double DEFAULT_MULTIPLY_PLAYER_ACCESS = 5.0;

        boolean DEFAULT_CAN_ACCESS_CONTAINER = true;
        boolean DEFAULT_CAN_ACCESS_PLAYER = true;

        boolean DEFAULT_CAN_MODIFY_CONTAINER = true;
        boolean DEFAULT_CAN_MODIFY_PLAYER = true;
    }

    public interface ClientConfigAccess {
    }

    public interface ServerConfigAccess {
    }
}
