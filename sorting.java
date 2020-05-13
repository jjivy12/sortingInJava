import java.util.*;

public class sorting {
    public static void main(String[] args){
        Random random = new Random();

        ArrayList<Integer> arr = new ArrayList<Integer>(100);
        for (int i=0; i < 100; i++){
            int randomInterger= random.nextInt(100);
            arr.add(randomInterger); // This will generate the array with random numbers up until 100
        }
        System.out.println(arr);
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i =0; i < arr.size()-1; i++){
                if (arr.get(i) > arr.get(i +1)){
                    temp = arr.get(i);
                    arr.set(i,arr.get(i+1));
                    arr.set( i +1, temp);
                    sorted = false; // this will take the array from the above method and begin to sort them in order from least to greatest 
                }
            }
        }
         System.out.println(arr);
    }
        
}
