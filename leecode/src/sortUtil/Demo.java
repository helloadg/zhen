package sortUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo extends Thread{
    private static Map<Integer,Integer> map=new HashMap<>();
    private static AtomicInteger i=new AtomicInteger();

    @Override
    public void run() {
        while (i.get()<100000){
            map.put(i.get(),i.get());
            i.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        Demo t1=new Demo();
        Demo t2=new Demo();
        Demo t3=new Demo();
        Demo t4=new Demo();
        Demo t5=new Demo();
        Demo t6=new Demo();
        Demo t7=new Demo();
        Demo t8=new Demo();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }

}
