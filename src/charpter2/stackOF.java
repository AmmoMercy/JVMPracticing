package charpter2;

public class stackOF {
//    private int stackLength=1;
//    public void stackLeak(){
//        stackLength++;
//        stackLeak();
//    }
//
//
//    public static void main(String[] args) {
//        stackOF stackOF=new stackOF();
//        try {
//            stackOF.stackLeak();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
    private void dontStop(){
        while (true){}
    }

    public void stackLeakByThread(){
        while (true){
            Thread thread =new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args)  throws  Throwable{
        stackOF stackOF=new stackOF();
        stackOF.stackLeakByThread();
    }
}
