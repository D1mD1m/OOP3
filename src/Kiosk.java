import java.util.Random;
import java.util.Scanner;

/**
 * Created by D1mD1m on 10/4/2016.
 */

public class Kiosk {
    private int bouqetteNumber;
    private Bouquette [] bouqettes;
    public static void main(String [] args){
        Kiosk ourKiosk = new Kiosk();
        ourKiosk.showAllBouqettes();
        Buyer you = new Buyer();
        Bouquette yourChoice = ourKiosk.bestBqt(you);
        System.out.println("Your choice is:");
        yourChoice.showBouqette();
    }

    private void showAllBouqettes(){
        for (int i =0; i < bouqetteNumber; ++i) {
            System.out.print("#");
            System.out.print(i + 1);
            bouqettes[i].showBouqette();
        }
    }

    private Kiosk(){
        System.out.println("what is the size of our Kiosk? Input int");
        int size = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            size = sc.nextInt();
        }
        this.bouqetteNumber = size;
        this.bouqettes = BouquetteFactory(size);
    }

    private Bouquette[] BouquetteFactory(int number){
        Bouquette [] allBqt = new Bouquette[number];
        Random random  = new Random();
        for (int i = 0; i < number; ++i){
            allBqt[i] = new Bouquette(1 + random.nextInt(20));
        }
        return allBqt;
    }

    private Bouquette bestBqt(Buyer ourHero){
        Bouquette best = null;
        float minSum = 10000;
        float sum;
        for (int bqt = 0; bqt < bouqetteNumber ; ++bqt){
            sum = ourHero.prefCheap* bouqettes[bqt].price / 15
                    - ourHero.prefSize*bouqettes[bqt].size * 2
                    - ourHero.prefFresh* bouqettes[bqt].fresh;
            if (sum < minSum){
                best = bouqettes[bqt];
            }
        }
        return best;
    }
}
