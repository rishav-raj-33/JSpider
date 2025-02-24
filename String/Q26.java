package String;

public class Q26 {

    public static void main(String[] args) {
        String a="java is very very easy easy java";
        String[] output=a.split(" ");
        String[] cleanUp=removeDuplicate(a);



        for (int i = 0; i < cleanUp.length; i++) {
            if (cleanUp[i]==" ") continue;
            int counter=1;
            for (int j = i+1; j < output.length; j++) {
                if (cleanUp[i].equals(output[j])){
                    counter++;
                }
            }

            System.out.println(cleanUp[i]+":"+counter);
        }











    }


    public static String [] removeDuplicate(String output){
        String[] temp=output.split(" ");
        for (int i=0;i<temp.length;i++){
            for (int j = i+1; j <temp.length ; j++) {
                if (temp[i].equals(temp[j])){
                    temp[j]=" ";
                }
            }
        }


        return temp;
    }
}
