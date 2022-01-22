import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomValue = new Random();
        int a = randomValue.nextInt(1,21);
        int b = randomValue.nextInt(1,21);
	    Fighter f1 = new Fighter("Khabib", 20, 100, 80, 30);
        Fighter f2 = new Fighter("Mcgregor", 20, 100,80, 30);

        Ring match = new Ring(f1, f2, 75, 85);
        match.run();
    }
}
