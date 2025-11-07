public class demo {
    public static void main(String[] args) {
        Runnable obj1 = () ->
        {
            for(int i=0;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // TODO: handle exception
            }
            }
        };

        Runnable obj2 = () ->{
            for(int j=0;j<5;j++){
                System.out.println("hello");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    // TODO: handle exception
                }
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}
