package newyearpresent;

import java.util.*;

public class Box {
    private ArrayList<Candy> candies = new ArrayList<Candy>();

    public Box(ArrayList<Candy> candies) {
        this.candies = candies;
    }

    //в порядку зростання
    public ArrayList<Candy> sortCandysByWeigth(){
        Collections.sort(candies);
        return candies;
    }


    public void getCandyFromCaloriesRange(double fromCalories, double toCalories){
        for(Candy candy: candies){
            if (candy.getCalories() >= fromCalories &&
                    candy.getCalories()<= toCalories)
                System.out.println(candy);
        }
    }


    @Override
    public String toString() {
        String result = "Box: \n";
        for(Candy candy: candies){
            result += candy.toString()+ "\n";
        }
        return result;
    }
}
