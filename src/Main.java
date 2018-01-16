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
        HashMap<Integer,Integer> counts = new HashMap<Integer, Integer>();

        for (int i=0;i<a.size();i++){
            if (counts.get(a.get(i))!= null){
                counts.put(a.get(i),counts.get(a.get(i))+1);
            }
            else{
                counts.put(a.get(i),1);
            }
        }

        Object[] keys = counts.keySet().toArray();

        boolean flag = false;
        Integer pointer = 0;

        while (!flag && pointer < keys.length){
            if (Integer.parseInt(counts.get(keys[pointer]).toString())==1){
                flag = true;
            }
            else {
                pointer++;
            }
        }

        if (flag){
            return Integer.parseInt(keys[pointer].toString());
        }
        else{
            return -1;
        }
    }

}
