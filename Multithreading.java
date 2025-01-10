

public class Multithreading{
    public static void main(String[] args) {
        Runnable one = ()->{
            for(int i=1; i<=5 ; i++){
                System.out.println(i);
            }
        };

        Runnable two = ()->{
            for(int j=6; j<=10 ; j++){
                System.out.println(j);
            }
        };

        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}