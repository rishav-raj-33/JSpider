/*
*
*          *
*          * *
*          * * *
*          * * * *
*
* */



public class Pattern_Without_Loops_2 {


    public static void main(String[] args) {

        pattern(5,1,1);

    }



    public static void pattern(int size,int i,int j){

        if(j<=i){
            System.out.print("*");
        }

        if((i==size)&&(j==size)){
                return;
    }


        if(j==i){
            System.out.println();
            j=0;
            i++;

        }

        pattern(size,i,j+1);




}

}
