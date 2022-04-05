package vibora;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import  java.util.Scanner;


import javax.swing.*;

/*****************
 * Dado el siguiente código debes descubrir:
 *
 * 1. Tamaño de zona de juego:
 *   a) ¿Cómo cambiar el tamaño de la pantalla?
 *   <En la fila 201 tenemos las variables que hacen referenzia a la pantalla>
 *   b) ¿Cómo hacer que si la pantalla crece, 
 *       el area de juego crezca adecuadamente?
 *   <Modificamos los valores en la linea 168>
 * 2. ¿Cómo cambiar las teclas para mover la serpiente de modo
 * que funcione tambíen con : A (izquierda) , S (abajo), W (arriba) y D (derecha)
 * 3. ¿Cómo cambiar los colores?:
 *  a) fondo (cada 5 frutas)
 *  b) víbora (cada 2 frutas)
 *  c) fruta (cada fruta)
 * 4. ¿Cómo hacer la víbora y la manzana más grandes?
 * hecho
 * 5. ¿Cómo implementar que el código de la fruta sea aleatorio?
 * 6. ¿Cómo hacer que si sale por la izquierda, no pierda y entre por la derecha?
 * 7. ¿Cómo cambiar el tamaño de la aplicación en pantalla?
  
 **/

public class Vibora extends JFrame implements Runnable, KeyListener {

    private LinkedList<Punto> lista = new LinkedList();
    private int columna, fila; // columna y fila donde se encuentra la cabeza de la vibora
    private int colfruta, filfruta; // columna y fila donde se encuentra la fruta.
    private int colfruta2, filfruta2,colfruta3, filfruta3,colfruta4, filfruta4;
    private boolean activo = true; // disponemos en false cuando finaliza el juego
    private Direccion direccion = Direccion.DERECHA;
    private Thread hilo; // Hilo de nuestro programa
    private int crecimiento = 0; // indica la cantidad de cuadraditos que debe crecer la vibora
    private Image imagen; // Para evitar el parpadeo del repaint()
    private Graphics bufferGraphics ;// Se dibuja en memoria para evitar parpadeo intermitente
    private int count = 0;
    private int count2 = 0;
    private boolean aux = false;
    private final Color[] arrayColores = new Color[]{Color.blue,Color.GREEN,Color.CYAN,Color.GRAY,Color.MAGENTA};
    Color colorfruta = Color.red;
    private int delimitadoresX;
    private int delimitadoresY;
    private boolean serpiente =false;

    private enum Direccion {
        IZQUIERDA, DERECHA, SUBE, BAJA
    }

    class Punto {

        int x, y;

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public Vibora() {
        // escuchamos los eventos de teclado para identificar cuando se presionan las
        // teclas de flechas
        this.addKeyListener(this);
        // la vibora comienza con cuatro cuadraditos
        lista.add(new Punto(4, 25));
        lista.add(new Punto(3, 25));
        lista.add(new Punto(2, 25));
        lista.add(new Punto(1, 25));
        // indicamos la ubicacion de la cabeza de la vibora
        columna = 4;
        fila = 25;
        // generamos la coordenada de la fruta
        colfruta = (int) (Math.random() * 50);
        filfruta = (int) (Math.random() * 50);
        colfruta2 = colfruta;
        filfruta2 = filfruta+1;
        colfruta3 = colfruta-1;
        filfruta3 = filfruta;
        colfruta4 = colfruta-1;
        filfruta4 = filfruta+1;
        // creamos el hilo y lo arrancamos (con esto se ejecuta el metodo run()
        hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void run() {
        while (activo) {
            try {
                // dormimos el hilo durante una décima de segundo para que no se mueva tan
                // rapidamente la vibora
                Thread.sleep(100);
                // segun el valor de la variable direccion generamos la nueva posicion de la
                // cabeza de la vibora
                switch (direccion) {
                    case DERECHA:
                        columna++;
                        break;
                    case IZQUIERDA:
                        columna--;
                        break;
                    case SUBE:
                        fila--;
                        break;
                    case BAJA:
                        fila++;
                        break;
                }
                repaint();
                sePisa();
                // insertamos la coordenada de la cabeza de la vibora en la lista
                lista.addFirst(new Punto(columna, fila));

                if (!this.verificarComeFruta() && this.crecimiento == 0) {
                    // si no estamos en la coordenada de la fruta y no debe crecer la vibora
                    // borramos el ultimo nodo de la lista
                    // esto hace que la lista siga teniendo la misma cantidad de nodos
                    // ls.borrarUltimo();
                    lista.remove(lista.size() - 1);
                } else {
                    // Si creciento es mayor a cero es que debemos hacer crecer la vibora
                    if (this.crecimiento > 0) {
                        this.crecimiento--;

                    }
                }
                verificarFin();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // controlamos si la cabeza de la víbora se encuentra dentro de su cuerpo
    private void sePisa() {
        for (Punto p : lista) {
            if (p.x == columna && p.y == fila) {
                activo = false;
                setTitle("Perdiste");
            }
        }
    }

    // controlamos si estamos fuera de la región del tablero
    private void verificarFin() {
        if (columna < 1) {
            columna = delimitadoresX;
        } else {
            if (columna >= delimitadoresX) {
                columna = 1;
            }
        }
        if (fila < 1) {
            fila= delimitadoresY;
        }else{
            if (fila >= delimitadoresY) {
                fila=1;
            }
        }
    }

    private boolean verificarComeFruta() {
        if (columna == colfruta && fila == filfruta || columna == colfruta2 && fila == filfruta2 || columna == colfruta3 && fila == filfruta3 || columna == colfruta4 && fila == filfruta4 ) {
            colfruta = (int) (Math.random() * delimitadoresY);
            filfruta = (int) (Math.random() * delimitadoresX);
            colfruta2 = colfruta;
            filfruta2 = filfruta+1;
            colfruta3 = colfruta-1;
            filfruta3 = filfruta;
            colfruta4 = colfruta-1;
            filfruta4 = filfruta+1;
            this.crecimiento = 30;
            count++;
            count2++;
            aux = true;
            return true;
        } else {
            return false;
        }
    }


    public void paint(Graphics g) {


        super.paint(g);
        if (!lista.isEmpty()) {
            if (imagen == null) {
                imagen = createImage(this.getSize().width, this.getSize().height);
                bufferGraphics = imagen.getGraphics();
            }
            bufferGraphics.setColor(Color.white);
            // borramos la imagen de memoria
            bufferGraphics.clearRect(0, 0, getSize().width, getSize().height);
            if ( count >= 5 && count <10){
                bufferGraphics.setColor(Color.yellow);

            }
            if ( count >= 10 && count < 15  ){
                bufferGraphics.setColor(Color.black);

            }
            if ( count == 15 ){
                count = 0;
            }
            bufferGraphics.fillRect(20, 50, getSize().width -100, getSize().height-100);
            bufferGraphics.setColor(Color.red);
            bufferGraphics.drawRect(20, 50, size().width-100, size().height-100);

            //Creamos unas variables que usaremos de limitadores para la generacion de las frutas y los limites de juego
            delimitadoresX = ((size().width-100)/10)-1;
            delimitadoresY = ((size().height-100)/10)-1;

            // dibujar vibora
            if (count2 >=2){
                bufferGraphics.setColor(Color.green);
                if (count2 == 4){
                    count2 = 0;
                }
            }else{
                bufferGraphics.setColor(Color.GRAY);
            }
            for (Punto punto : lista) {
                bufferGraphics.fillRect(20 + punto.x * 10 , 50 + punto.y * 10, 8, 8);
            }
            // dibujar fruta
           if (aux){
               colorfruta = arrayColores[ThreadLocalRandom.current().nextInt(0, arrayColores.length)];
               aux = false;
           }
            bufferGraphics.setColor(colorfruta);
            bufferGraphics.fillRect(colfruta * 10 + 20, filfruta * 10 + 50, 8, 8);
            bufferGraphics.fillRect(colfruta2 * 10 + 20, filfruta2 * 10 + 50, 8, 8);
            bufferGraphics.fillRect(colfruta3 * 10 + 20, filfruta3 * 10 + 50, 8, 8);
            bufferGraphics.fillRect(colfruta4 * 10 + 20, filfruta4 * 10 + 50, 8, 8);
            g.drawImage(imagen, 0, 0, this);
        }
    }

    public void keyPressed(KeyEvent arg0) {
        if (arg0.getKeyCode() == KeyEvent.VK_D) {
            direccion = Direccion.DERECHA;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_A) {
            direccion = Direccion.IZQUIERDA;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_W) {
            direccion = Direccion.SUBE;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_S) {
            direccion = Direccion.BAJA;
        }
    }

    public void keyReleased(KeyEvent arg0) {
    }

    public void keyTyped(KeyEvent arg0) {
    }

    public static void main(String[] args) {
        Vibora f = new Vibora();

        /**
         * int width = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ancho"));
         * int heigth = Integer.parseInt(JOptionPane.showInputDialog("Introduce el alto"));
         * f.setSize(width,heigth);
         * Intentamos hacer este codigo pero nos da error, tras mucho analizarlo no fuimos capaces de encontrar
         * el porque del erro, a ver si le puedes hechar un vistazo.
         * */
        f.setSize(600,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


