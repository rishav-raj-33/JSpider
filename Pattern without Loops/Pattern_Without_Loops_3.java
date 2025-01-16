/*
*
*        ****
*        ***
*        **
*        *
* */


public class Pattern_Without_Loops_3 {


    public static void main(String[] args) {

        pattern(5,1,1);



    }


    public static void pattern(int size,int i,int j ){

        if(j<=size){
            System.out.print("*");
        }


        if(size==1){
            return;
        }

        if(j==size){
            System.out.println();
            i++;
            size--;
            j=0;
        }
        pattern(size,i,j+1);

    }
}
