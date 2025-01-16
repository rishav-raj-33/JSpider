/*
*
*
*                 ****
*                 ****
*                 ****
*                 ****
*
* */


public class Pattern_Without_Loops_1 {


    public static void main(String[] args) {


        pattern_1(5,1,1);


    }

    public static void pattern_1(int size,int j,int i){


        if(j<=size){
            System.out.print("*");


        }

        if((i==size) && (j==size)){
            return;
        }



        if(j==size){
            System.out.println();
            i++;
            j=0;
        }

  pattern_1(size,j+1,i);





    }



}
