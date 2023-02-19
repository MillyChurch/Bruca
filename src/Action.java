import java.util.Random;

public class Action {
    private int dice;

    Random diceRandom = new Random();

    public int diceRoll() throws InterruptedException{
        int stop= 0, i,a=1;
        dice = 1 + diceRandom.nextInt(6);

        for (i = 1; i < 80; i++){
            if(a > 6){a = 1;}
            System.out.println(a);

            a++;
            if (a == dice){stop++;}
            Thread.sleep(100);
            if (stop == 1){Thread.sleep(200);}
            if (stop == 2){Thread.sleep(500);}
            if (stop == 3){Thread.sleep(1000);}
        }
        return dice;
    }
    
}
