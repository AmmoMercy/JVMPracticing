package charpter2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HeepOOM {
    static class OOMObj {
    }

    public static void main(String[] args) {
        List<OOMObj> list=new ArrayList<OOMObj>( );
        while (true){
            list.add(new OOMObj());
        }
    }
}
