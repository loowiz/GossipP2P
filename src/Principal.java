public class Principal {
    public static void main(String[] args) {
        Peer p1 = new Peer(
                "127.0.0.1",
                9000,"data/peer1",
                "127.0.0.1",
                9001,
                "127.0.0.1",
                9002);

        StringBuilder test = new StringBuilder();
        for (String dir : p1.listFiles()) {
            test.append(dir);
            test.append("\n");
        }
        System.out.println(test);
    }

    
}
