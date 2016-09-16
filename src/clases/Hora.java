/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class Hora {
 private int horas;
         private int minutos;
         private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
     public Hora() {
        this.horas = 00;
        this.minutos = 00;
        this.segundos = 00;    
}
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
     public String validarh1 (){
        String aux;
        if(this.getHoras() > 23 || this.getMinutos() > 60 || this.getSegundos() > 60){
            aux = "La hora n°1 no es correcta";
        }else{
            aux = "La hora n°1 es correcta";
        }
        
        return  aux;
     }
     public String validarh2 (){
     
        String aux;
        
        if(this.getHoras() > 23 || this.getMinutos() > 60 || this.getSegundos() > 60){
            aux = "La hora n°2 no es correcta";
        }else{
            aux = "La hora n°2 es correcta";
        }
        return  aux;  
     }
     public String Igual (int horas,int minutos, int segundo){
        String aux;
        int hr , mn , sg;
        hr = this.getHoras();
        mn = this.getMinutos();
        sg = this.getSegundos();
        
        
        if (hr == horas && mn == minutos && sg == segundo){
            aux = "La horas ingresadas coiciden";
            
        }else{
            aux = "La horas ingresada no coinciden";
        }
        return aux;
        
     }
     public String Menor (int horas,int minutos, int segundo){
        String aux;
        int hr , mn , sg;
        hr = this.getHoras();
        mn = this.getMinutos();
        sg = this.getSegundos();
        
        if (hr < horas ){
             aux = "La hora n°1  es menor que la n°2";
         } else if( mn < minutos ){
                     aux = "La hora n°1  es menor que la n°2";
                     }else if ( sg < segundo){
            aux = "La hora n°1  es menor que la n°2";
        }else{
         aux = "La hora n°2 menor que la n°1";   
        }
        return aux;
        }
       
    public String mayor (int horas,int minutos, int segundo){
        String aux;
        int hr , mn , sg;
        hr = this.getHoras();
        mn = this.getMinutos();
        sg = this.getSegundos();
        
         if (hr > horas ){
             aux = "La hora n°1  es mayor que la n°2";
         } else if( mn > minutos ){
                     aux = "La hora n°1  es mayor que la n°2";
                     }else if ( sg > segundo){
            aux = "La hora n°1  es mayor que la n°2";
        }else{
         aux = "La hora n°1 mayor que la n°2";   
        }
        return aux;
}
    
    public String mostrar ( int horas , int minutos , int segundo){
        String aux;
        
        aux = "Hora 1"+"\n"
                +"Las horas son "+this.getHoras() + "\n"
                + "Los minutos son "+this.getMinutos() + "\n"
                + "Los segundo son "+this.getSegundos() +"\n\n"
                + "Hora 2"+"\n"
                + "Las Horas son "+ horas +"\n"
                + "Los minutos son "+minutos+"\n"
                + "Los Segundos son "+segundo+"\n";
        
        return aux;
    }
     
}
