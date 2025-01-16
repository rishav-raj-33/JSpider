public class Pattern_Without_loop_6 {

    public static void main(String[] args) {

         pattern(5,1,1);

    }



    public static void pattern(int size,int i,int j){

        if(j<=size){
            System.out.print(i);
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
