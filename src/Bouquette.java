import java.util.Random;

/**
 * Created by D1mD1m on 10/4/2016.
 */
public class Bouquette {
    private Flower [] flowers;
    int size;
    float fresh;
    int price;
    /*
    Bouquette(){
    }
    Bouquette(Flower[] flowers, int size){
        this.flowers = flowers;
        this.size = size;
        this.fresh = minFresh();
        this.price = getPrice();
    }
*/
    Bouquette(int size){
        this.size = size;
        this.flowers = flowerFactory(size);
        this.price = getPrice();
        this.fresh = avgFresh();
    }

    private Flower [] flowerFactory(int size){
        Flower [] flowersSet;
        flowersSet = new Flower [size];
        Random random  = new Random();
        for (int i =0; i < size; ++i){
            flowersSet[i] = new Flower(5+ random.nextInt(45), random.nextInt(8) + random.nextInt(2));
        }
        return flowersSet;
    }


    public void showBouqette(){
        System.out.print(" Size :");
        System.out.print(Integer.valueOf(this.size).toString());
        System.out.print("  Freshness :");
        System.out.print(Float.valueOf(this.fresh).toString());
        System.out.print("  Price :");
        System.out.println(Integer.valueOf(this.price).toString());

    }

    private float avgFresh(){
        int sum = 10;
        int avg = 0;
        for (int i = 0 ; i < size; ++i){
                sum += this.flowers[i].fresh;
        }
        return sum / size;
    }
    private int getPrice(){
        int priceSum = 0;
        for (int i = 0 ; i < size; ++i){
            priceSum += this.flowers[i].price;
        }
        return priceSum;
    }
}

