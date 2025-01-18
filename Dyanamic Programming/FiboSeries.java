

import java.util.HashMap;
import java.util.Map;




public class FiboSeries {

    public static Map<Integer,Integer> memory=new HashMap<>();



    public static void main(String[] args) {

        System.out.println(fib(6));
        memory.clear();
        System.out.println("------------------------------------------");

        Map <Integer,Integer> result=fibTable(6);
        result.forEach((obj,obj1)->{
            System.out.println(obj+"->"+obj1);
        });
        System.out.println("------------------------------------------");
        fibMemoryOptimization(6);




    }

// Top-Down Approach

public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        if(memory.containsKey(n)){
            return memory.get(n);
        }

        memory.put(n,fib(n-1)+fib(n-2));
        return memory.get(n);
}

// Bottom-Up Approach

    public static Map<Integer,Integer> fibTable(int n){
        Map<Integer,Integer> table=new HashMap<>();
        table.put(0,0);
        table.put(1,1);
        for (int i=2;i<n;i++){
            table.put(i,table.get(i-1)+table.get(i-2));
        }
        return table;

    }



    //Memory-Optimization

    public static void fibMemoryOptimization(int n){
       int previousValue1=0;
       int previousValue2=1;
        for (int i=0;i<n;i++){
            System.out.println(previousValue1);
            int temp=previousValue2;
            previousValue2=previousValue1+previousValue2;
            previousValue1=temp;
        }
        return;

    }





}


