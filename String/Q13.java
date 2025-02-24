package String;

//Remove duplicate spaces in the string

//input:"   Java   is   easy       "
//output:"java is easy"


public class Q13 {


    public static void main(String[] args) {


        String a="   Java   is   easy       ";
        String output="";
        char []b=a.toCharArray();

        for (int i=0;i<b.length;i++){

             if (b[i]=='\u0000') continue;
             else  if (b[i]==' '){
              int j=i;
            while ((j+1)!=b.length &&b[i]==b[j+1]){
                b[j+1]='\u0000';
                if (j+1==b.length-1){
                    if (b[0]==' ') b[0]='\u0000';
                    b[i]='\u0000';
                }
                j++;
            }
             }
        }
        for (char z:b){
            if(z!='\u0000'){
                output+=z;
            }
        }
        System.out.println(output);

    }



}

