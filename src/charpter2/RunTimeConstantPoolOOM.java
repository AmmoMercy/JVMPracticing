package charpter2;

import java.util.ArrayList;
import java.util.List;

public class RunTimeConstantPoolOOM {
    //    public static void main(String[] args) {
//        List<String > list= new ArrayList<String>();
//        int i=0;
//        while (true){
//            list.add(String.valueOf(i++).intern());
//            System.out.println(i);
//        }
//    }
    public static void main(String[] args) {
        String str1 = new StringBuilder("jd").append("k").toString();
        System.out.println(str1 ==str1.intern());
        String str2 =new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern()==str2.intern());
    }
}
