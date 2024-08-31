package com.string;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
//in matcher class matcher.end will give 1 index extra that is
// it exclude the last index
// similer to string substring method if we want to substring
// from index 1 to 4 the pass 1 ,5;
public class Bsics {
    public static void main(String[] args) {
        String sop = "pra";
        String sop2 = "pra";
        System.out.println(sop2.hashCode());
        System.out.println(sop.hashCode());
        System.out.println("i am a= "+'a');
        System.out.println("i am b= " +"b");
        System.out.println("i am char a + string b= " +'a' + "b");
        System.out.println("i am ('a' + 'b')= " + ('a' + 'b'));
        System.out.println("i am 'a' + 'b'= " + 'a' + 'b');
        System.out.println('a' + 'b');

        String  s = "love";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String sss = String.valueOf(sb);
        System.out.println(sss);
        // above code is how to reverse a string

        System.out.println(s);
        System.out.println(s.substring(0,3));
        System.out.println(s.subSequence(0,3));
        char[] ss = s.toCharArray();
        for(int i = 0; i< ss.length; i++){
            System.out.println(ss[i]);
        }

        Pattern pattern = Pattern.compile("po");
        Matcher matcher = pattern.matcher("pop");
        if(matcher.find())
        System.out.println(matcher.start() + " " + (matcher.end()- 1) );
    }
}
