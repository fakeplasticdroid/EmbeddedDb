import org.h2.tools.Server;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by mali on 7/2/16.
 */
public class RunThatShit {


    public static void main(String[] args) {

        Server server = null;
//        try {
//            server = Server.createTcpServer(
//                    "-tcpPort", "9123", "-tcpAllowOthers").start();
//        } catch (SQLException e) {
//
//        }

        new DatabaseHelper();

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("exit: ");
            Scanner scanner = new Scanner(System.in);

            String next = scanner.next();
            keepRunning = next.toUpperCase() != "Y";
        }
//        server.stop();

    }
}
