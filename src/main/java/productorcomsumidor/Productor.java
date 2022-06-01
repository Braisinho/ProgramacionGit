
package productorcomsumidor;

public class Productor implements Runnable{
    Q q;

    public Productor(Q q) {
        this.q = q;
        new Thread(this,"Productor").start();
    }
    @Override 
    public void run(){
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
    
}
