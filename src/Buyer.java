import java.util.Scanner;

/**
 * Created by D1mD1m on 10/4/2016.
 */
public class Buyer {
    byte prefCheap = 1;
    byte prefFresh = 1;
    byte prefSize = 1;

    public Buyer() {
        System.out.println("what do you prefere? cheap or big (C/b)? if Cheap print 1");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            if (sc.nextInt() == 1) {
                this.prefCheap += 1;
            } else this.prefSize += 1;
        }
        System.out.println("what do you prefere? cheap or fresh (C/f)? if Cheap print 1");
        if (sc.hasNextInt()) {
            if (sc.nextInt() == 1) {
                this.prefCheap += 1;
            } else this.prefFresh += 1;
        }
        System.out.println("what you prefere? cheap or big (B/f)? if Big print 1");
        if (sc.hasNextInt()) {
            if (sc.nextInt() == 1) {
                this.prefSize += 1;
            } else this.prefFresh += 1;
        }
        System.out.println("your preferences weight:");
        System.out.print("Price:");
        System.out.println(Byte.valueOf(prefCheap).toString());
        System.out.print("Size:");
        System.out.println(Byte.valueOf(prefSize).toString());
        System.out.print("Fresh:");
        System.out.println(Byte.valueOf(prefFresh).toString());

    }
}
