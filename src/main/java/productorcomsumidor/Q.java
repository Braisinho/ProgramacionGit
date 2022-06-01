
package productorcomsumidor;

public class Q {
    int n;
    boolean contenedorLleno = false;
    
    
    synchronized int get(){
        while(!contenedorLleno){
            try {
                  wait();
            } catch (Exception e) { }
        }
        System.out.println("Tiene "+n);
        contenedorLleno=false;
        notify();
        return n;
    }
    
    synchronized void put(int n){
        while (contenedorLleno){
            try {
                  wait();
            } catch (Exception e) { }
        }
        this.n = n;
        System.out.println("Poner " +n); 
        contenedorLleno = true;
        notify();
        
    }

}
