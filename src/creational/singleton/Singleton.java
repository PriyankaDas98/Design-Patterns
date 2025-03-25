package creational.singleton;

public class Singleton {
    public static void main(String[] args) {
        Runnable obj = ()->{ A obj1 = A.getInstance();};
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(()-> {A obj2 = A.getInstance();});
        t1.start();
        t2.start();
    }

}
class A{
    private static A a;
    private A(){
        System.out.println("Instance created..");

    }
     public static A getInstance() { //reduce the performance if we keep synchronized here
         if (a == null) {
             synchronized (A.class){ //double check locking
                 if(a==null)
                     a = new A();

             }
         }
         return a;

     }
}
