/*
*
*          *****
*          *   *
*          *   *
*          *   *
*          *****
*
* */



public class Pattern_Without_loop_5 {

    public static void main(String[] args) {


        pattern(5,1,1);



    }


    public static void pattern(int size,int i,int j){

        if((i==1)||i==size){
            System.out.print("*");
        }

        if((j==1 && i!=1 && i!=size) || (j==size && i!=size && i!=1)){
            System.out.print("*");

        }

        if(j>1 && j!=size && i!=1 && i!=5){
            System.out.print(" ");
        }


        if(i==size && j==size){
            return;
        }

        if(j==size){
            System.out.println();
            j=0;
            i++;
        }
        pattern(size,i,j+1);


    }


}
