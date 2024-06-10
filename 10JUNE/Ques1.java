class Thr1 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i<100) {
            try {
            System.out.println("Hey! Good Morning");
            System.out.println("Welcome, this is the thread 1");
            Thread.sleep(30);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
class Thr2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("This is the thread 2");
            i++;
        }
    }
}
public class Ques1{
    public static void main(String[] args) {
        Thr1 t1 = new Thr1();
        Thread t = new Thread(t1);
        // t.start();
        Thr2 t2 = new Thr2();
        // t2.start();
        //when we have run this program without join we can see that for sometime t1 is running and then t2 is running then t1 and then t2 so on.....

        //lets try this with the join method 

        // t.start();
        // t.join();  we cannot apply join method directly we have to use try catch block to use this because it can throw exception
        // try {
        //     t.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // t2.start();


        //now we see the priority of the threads 
        // System.out.println(t.getPriority());
        // System.out.println(t2.getPriority());
        // after running the code we can see that the default priority value of the threads are 5


        //lets set the priority of the threads
        t.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t.getState());
        System.out.println(t2.getState());
        t.start();
        t2.start();
        System.out.println(t.getState());
        System.out.println(t2.getState());

    }
}  