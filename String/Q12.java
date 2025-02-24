package String;

//write a java program to replace consecutive character with$ symbol

//input: BOSS
//output: BOS$

//input: BOSSSS
//output: BOS$S$




public class Q12 {


    public static void main(String[] args) {

         String a="BOSSSS";
       // String a="BOSS";
        int count=0;
        String output="";
        char []b=a.toCharArray();

        for (int i=0;i<b.length;i++){
            count+=1;
            if (b[i]=='$') continue;
            for (int j=i+1;j<b.length;j++){
                if (b[i]==b[j]){
                count+=1;
                if (count%2==0){
                    b[j]='$';

                }


                }
            }

            count=0;

        }
        for (char z:b){
            if(z!='\u0000'){
                output+=z;
            }

        }

        System.out.println(output);

    }
}
