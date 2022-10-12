import java.io.File;
import java.util.Scanner;

public class Peer {
    String peerIP;
    int peerPort;
    String peerFolder;
    String neighborAIP;
    int neighborAPort;
    String neighborBIP;
    int neighborBPort;


    /**
     * The constructor for Peer X.
     *
     * @param peerIP The Peer X IP.
     * @param peerPort The Peer X Port.
     * @param peerFolder The Peer X folder path.
     * @param neighborAIP The first known neighbor IP.
     * @param neighborAPort The first known neighbor Port.
     * @param neighborBIP The second known neighbor IP.
     * @param neighborBPort The second known neighbor Port.
     */
    public Peer(String peerIP, int peerPort, String peerFolder, String neighborAIP, int neighborAPort, String neighborBIP, int neighborBPort) {
        this.peerIP = peerIP;
        this.peerPort = peerPort;
        this.peerFolder = peerFolder;
        this.neighborAIP = neighborAIP;
        this.neighborAPort = neighborAPort;
        this.neighborBIP = neighborBIP;
        this.neighborBPort = neighborBPort;
    }


    /**
     * Go to the peer folder and see what is inside.
     *
     * @return a String array with the files on the peer folder.
     */
    public String[] listFiles(){
        File fileDir = new File(peerFolder);
        String[] listFileNames = fileDir.list();

        return listFileNames;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome new peer!");
        System.out.print("Peer X IP address: ");
        String peerXIP = scanner.nextLine();
        System.out.print("Peer X Port: ");
        int peerXPort = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Peer X folder path: ");
        String peerXFolder = scanner.nextLine();
        System.out.print("Neighbor A IP address: ");
        String neighborAIP = scanner.nextLine();
        System.out.print("Neighbor A Port: ");
        int neighborAPort = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Neighbor B IP address: ");
        String neighborBIP = scanner.nextLine();
        System.out.print("Neighbor B Port: ");
        int neighborBPort = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");

        Peer p1 = new Peer(peerXIP, peerXPort, peerXFolder, neighborAIP, neighborAPort, neighborBIP, neighborBPort);

        StringBuilder test = new StringBuilder();
        for (String dir : p1.listFiles()) {
            test.append(dir);
            test.append("\n");
        }
        System.out.println(test);

    }


}
