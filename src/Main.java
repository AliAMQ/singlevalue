import java.util.*;

/**
 * Created by Alireza on 1/13/2018.
 */
public class Main {

    public static void main(String[] args){

        Integer[] inputs = {1,2,2,3,4,3,5,9,1,4,5,5};

        System.out.println(singleNumber(Arrays.asList(inputs)));

    }

    public static int singleNumber(final List<Integer> a) {
        // Define a hashmap object
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        //count the numbers in the list: check if it's already added into the map and increase the count
        for (int i=0;i<a.size();i++){
            if(hashmap.get(a.get(i)) != null){
                hashmap.put(a.get(i), hashmap.get(a.get(i))+1);
            }
            else{
                hashmap.put(a.get(i), 1);
            }
        }


        // Read the counts in the hashmap and stop when reached to count 1: extract the keys into an array and check the key values
        Object[] keys = hashmap.keySet().toArray();
        boolean flag = false;
        int pointer = 0;

        while (!flag && pointer < hashmap.size()){
            if (hashmap.get(keys[pointer]).toString().equals("1")){
                flag = true;
            }
            else{
                pointer++;
            }
        }

        //Print out the number with count 1
        if (flag){
            return Integer.parseInt(keys[pointer].toString());
        }
        else{
            return -1;
        }
    }

}
