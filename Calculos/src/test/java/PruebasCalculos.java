/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class PruebasCalculos {
    
    public PruebasCalculos() {
    }
    
    Calculos instancia=new Calculos();
    
    @Test
    public void pruebaSuma1(){
        int x=4;
        int y=2;
        int esperado=6;
        int obtenido=instancia.suma(x, y);
        assertEquals(esperado, obtenido);
    }
    
    @Test
    public void pruebaSuma2(){
        int x=6;
        int y=8;
        int esperando=14;
        int obtenido=instancia.suma(x, y);
        assertEquals(esperando,obtenido);
        
    }
    
    @Test
    public void pruebaSuma3 (){
        int x=10;
        int y=12;
        int esperando=22;
        int obtenido=instancia.suma(x, y);
        assertEquals(esperando,obtenido);
    }
    
    @Test
    public void pruebaSuma4 (){
    int x=14;
    int y=16;
    int esperando=30;
    int obteniendo=instancia.suma(x,y);
    assertEquals(esperando,obteniendo);
    
}
}


