import java.rmi.AccessException;

public class App {
    public static void main(String[] args) throws Exception {

        int a;
        Action b = new Action();

        a = b.diceRoll();

        System.out.println("\n\n\n\nVOCÊ TIROU " + a + " NO DADO");
    }
}
