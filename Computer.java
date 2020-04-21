public class Computer extends Player {
    public Computer(String token) {
        super("Sett", token);
    }

    public int determineMove() {
        int col = (int )(Math.random() * 8);
        return col;
    }

}