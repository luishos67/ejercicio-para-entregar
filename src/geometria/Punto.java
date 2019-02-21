/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author Estudiante
 */
public class Punto {
    private int x;
    private int y;
    
    public int getx(){
        return x;
    }
     public void setx(int x){
         this.x =x;
     }
     public int gety(){
         return y;
     }
     public void sety(int y){
         this.y=y;
     }
     
     public Punto(int x, int y){
         this.x =x;
         this.y =y;
     }
     public Punto(){
         this.x=0;
         this.y=0;
                 
     }
     public Punto(Punto p){
         this.x =p.x;
         this.y =p.y;
     }
     
     public void desplazar (int incx, int incy){
         this.x +=incx;
         this.y +=incy;
     }
}
