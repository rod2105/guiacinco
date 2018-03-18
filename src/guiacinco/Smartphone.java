/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiacinco;

/**
 *
 * @author Rodrigo
 */
public class Smartphone {
    
    private int tamPantalla, capBateria, garantia, precio, pixCamara
            , gpu, cpu, puntaje, marcaIndex;
    private String marca;
    
    
    public void Smartphone(int tamPantalla, int capBateria, int garantia
    , int precio, int pixCamara, int gpu, int cpu, String marca, int marcaIndex){
        
        this.tamPantalla = tamPantalla;
        this.capBateria = capBateria;
        this.garantia = garantia;
        this.precio = precio;
        this.pixCamara= pixCamara;
        this.gpu = gpu;
        this.cpu = cpu;
        this.marca = marca;
        this.marcaIndex = marcaIndex;
        
    }
    public void Smartphone(){
        
    }
    
    public int BateriaPantalla(double tamPantalla, int capBateria){
        
        if (tamPantalla >= 6){
            if (capBateria<=1200){
                puntaje+=3;
            } 
            else if (capBateria>1200 && capBateria<=2400){
                puntaje+=4;
            } 
            else if (capBateria>3100) {
                puntaje+=5;
            }
        }
        else if(tamPantalla <= 5 && tamPantalla>4){
            if (capBateria<=1200){
                puntaje+=1;
            } 
            else if (capBateria>1200 && capBateria<=2400){
                puntaje+=2;
            } 
            else if (capBateria>3100) {
                puntaje+=3;
            }
        }
        else if(tamPantalla <= 4){
            if (capBateria<=1200){
                
            } 
            else if (capBateria>1200 && capBateria<=2400){
                puntaje+=1;
            } 
            else if (capBateria>3100) {
                puntaje+=2;
            }
        }
        return puntaje;
    }
    
    public int refMarca(int marcaIndex){
        if (marcaIndex <=5){
            puntaje=+4;
        } else if (marcaIndex>5 && marcaIndex<=8){
            puntaje=+3;
        } else {
            puntaje=+2;
        }
        
        return puntaje;
    }
    
    public int rangoPrecio (int precio){
        if (precio<100){
            puntaje=+2;
        } else if (precio>=100 && precio<=350){
            puntaje=+3;
        } else if (precio>350){
            puntaje=+4;
        }
        return puntaje;
    }
    
    public int pixelaje (double principal, double frontal, boolean tieneFlash){
        if (principal<=5){
            if (frontal<2){
                puntaje=+1;
            } else {
                puntaje=+2;
            }
        } else if (principal>5 && principal<=8){
            if (frontal<2){
                puntaje=+1;
            } else if (frontal<=3 && frontal>=2){
                puntaje=+2;
            } else {
                puntaje=+3;
            }
        } else if (principal>8){
            if (frontal<2){
                puntaje=+1;
            } else if (frontal<=5 && frontal>=2){
                puntaje=+2;
            } else {
                puntaje=+3;
            }
        }
        if (tieneFlash){
            
        } else{
            puntaje=-1;
        }
        return puntaje;
    }
    
    public int garantia (int garantia){
        if (garantia<=3){
            puntaje=+1;
        } else if (garantia>3 && garantia<6){
            puntaje=+2;
        } else {
            puntaje=+4;
        }
        
        return puntaje;
    }
    
    public int Cpu(int cpu){
        if(cpu==2){
           
        } else if (cpu==4){
            puntaje=+1;
        } else if (cpu==6){
            puntaje=+2;
        } else if (cpu==8){
            puntaje=+3;
        }
        return puntaje;
    }
    
    public int Ram (int ram){
        if (ram>1 && ram<2){
            puntaje=+2;
        } else if (ram>=2 && ram<4){
            puntaje=+4;
        } else if (ram>=4){
            puntaje=+6;
        }
        
        return puntaje;
    }
       
   public int getPuntaje(){
       return puntaje;
   }
            
    
}
