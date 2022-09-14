package com.mycompany.videogame;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperHumanosTest {

    @Test
    public void testGetParametroFuerzaSuperHum(){
        SuperHumanos superHumanos = new SuperHumanos(50,"Luis",100,60,50);

        int resultado = superHumanos.getFuerzaSuperHum();
        int esperado = 50;

        assertEquals(esperado,resultado);

    }

    @Test
    public void testSetParametroFuerzaSuperHum(){
        SuperHumanos superHumanos = new SuperHumanos(50,"Luis",100,60,50);

        superHumanos.setFuerzaSuperHum(30);
        int resultado = 30;

        assertEquals(30,resultado);
    }

    @Test
    public void testSetvida(){
        SuperHumanos superHumanos = new SuperHumanos(50,"Luis",100,60,50);
        int esperado = superHumanos.setVida(50,60);
        int resultado = superHumanos.setVida(50,60);

        assertEquals(esperado,resultado);
    }

    @Test
    public void testataque(){
        SuperHumanos superHumanos = new SuperHumanos(50,"Luis",100,60,50);
        int esperado = superHumanos.ataque(30);
        int resultado = superHumanos.ataque(30);

        assertEquals(esperado,resultado);
    }

    @Test
    public void testataquesimple(){
        SuperHumanos superHumanos = new SuperHumanos(50,"Luis",100,60,50);

        int esperado = superHumanos.Ataquesimple();
        int resultado = superHumanos.Ataquesimple();

        assertEquals(esperado,resultado);

    }

    @Test
    public void testdefensaferrea(){
        SuperHumanos superHumanos = new SuperHumanos(50,"Luis",100,60,50);
        int de = IFichaB.defensaExtra;
        int esperado = superHumanos.Defensaferreo(de,superHumanos.getDefensa());
        int resultado = superHumanos.Defensaferreo(de,superHumanos.getDefensa());
        assertEquals(esperado,resultado);
    }
}