
package productorcomsumidor;


public class Consumidor implements Runnable{
    Q q;

    public Consumidor(Q q) {
        this.q = q;
        new Thread(this,"Consumidor").start();
    }


    @Override
    public void run(){
        while(true){
            q.get();
        }           
    }

 
}
