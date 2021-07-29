import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,24,5,35,35,3,10,10,34));
        System.out.println(list);
        Collections.swap(list,0,list.size()-1);
        System.out.println(list); // task one complete
        System.out.println("--------------------------------------------------------------");
        for(Integer x : list){
            if(Collections.frequency(list,x)==1){
                System.out.println(x);
                break;
            }
        }//task 2 done
        System.out.println("-------------------------------------------------------------------");
        String result = "";
        String given = "AABBCCDDEE";
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(given.split("")));
        for(String s: list2){
            if(!result.contains(s)){
                result += s+ Collections.frequency(list2,s);
            }
        }
        System.out.println(result);//task 3 done
        System.out.println("------------------------------------------------------------------");
        //5th max
        int n = 5;
        for(int i = 1; i < n; i++){
            list.removeIf(p-> p==Collections.max(list));
        }
        System.out.println(Collections.max(list));
    }




}
