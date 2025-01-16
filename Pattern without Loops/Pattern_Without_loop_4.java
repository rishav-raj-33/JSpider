/*
*    ---****
*    ---***
*    ---**
*    ---*
*
* */



public class Pattern_Without_loop_4 {


    public static void main(String[] args) {

        pattern(5,1,1);

    }


    public static void pattern(int size,int i,int j){
        if(j<=3){
            System.out.print(" ");
        }

        if(j>3 && j<=size+3){
            System.out.print("*");
        }
        if(size==1 && j==size+3){
            return;
        }
        if(j==size+3){
            System.out.println();
            i++;
            j=0;
            size--;
        }

        pattern(size,i,j+1);






    }
}
