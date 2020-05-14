package multiuserchat;

import multiuserchat.server.ChatServer;
import static multiuserchat.util.ChatUtils.SERVER_PORT;

/**
 * @author cvoinea
 */
public class ChatRoom {

    public static void main(String[] args) {

        ChatServer chatServer = new ChatServer(SERVER_PORT);
        new Thread(chatServer).start();
    }
}
