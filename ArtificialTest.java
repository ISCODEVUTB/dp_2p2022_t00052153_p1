package com.mycompany.videogame;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArtificialTest {

    @Test
    public void testGetParametroFuerzaArtificial(){
        Artificial artificial = new Artificial(30,"Roger",100,30,10);


        int resultado = artificial.getFuerzaArtificial();
        int esperado = 30;

        assertEquals(esperado,resultado);

    }

    @Test
    public void testSetParametroFuerzaArtificial(){
        Artificial artificial = new Artificial(30,"Roger",100,30,10);

        artificial.setFuerzaArtificial(30);
        int resultado = 30;

        assertEquals(30,resultado);
    }

    @Test
    public void testSetvida(){
        Artificial artificial = new Artificial(30,"Roger",100,30,10);
        int esperado = artificial.setVida(50,60);
        int resultado = artificial.setVida(50,60);

        assertEquals(esperado,resultado);
    }

    @Test
    public void testataque(){
        Artificial artificial = new Artificial(30,"Roger",100,30,10);
        int esperado = artificial.ataque(30);
        int resultado = artificial.ataque(30);

        assertEquals(esperado,resultado);
    }

    @Test
    public void testataquesimple(){
        Artificial artificial = new Artificial(30,"Roger",100,30,10);

        int esperado = artificial.Ataquesimple();
        int resultado = artificial.Ataquesimple();

        assertEquals(esperado,resultado);

    }

    @Test
    public void testdefensaferrea(){
        Artificial artificial = new Artificial(30,"Roger",100,30,10);
        int de = IFichaB.defensaExtra;
        int esperado = artificial.Defensaferreo(de,artificial.getDefensa());
        int resultado = artificial.Defensaferreo(de,artificial.getDefensa());
        assertEquals(esperado,resultado);
    }
}