package org.learn.problems;

public class ReplaceSpace {

    static void replaceSpace(String s){
        int space =0;int i=0;
        char[] chr= s.toCharArray();

        for(i=0;i<chr.length;i++){
            if(chr[i]== ' ')
                space++;
        }

        int new_length = chr.length+space*2;
        int index = new_length -1;
        char[] copy = chr;
        chr = new char[new_length];
        System.out.println("Value of i "+i);System.out.println("Length "+new_length);

       for(int j=i-2;j>=0;j--){
            if(copy[j] == ' '){
                chr[index] ='0';
                chr[index-1] = '2';
                chr[index -2] = '%';
                index = index -3;
            }else
            {
                chr[index] = copy[j];
                index--;
            }
        }



       for(char c:chr)
           System.out.print(c);

    }


    public static void main(String[] args) {

        String str = "Mr John Smith ";
        replaceSpace(str);

    }
}
