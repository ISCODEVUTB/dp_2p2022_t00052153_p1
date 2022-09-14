package com.mycompany.videogame;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanosTest {

    @Test
    public void testSetvida(){
        Humanos humanos = new Humanos(40,"Juan pablo",100,50,30);
        int esperado = humanos.setVida(40,20);
        int resultado = humanos.setVida(40,20);
        Assert.assertEquals(esperado,resultado);
    }

    @Test
    public void testataque(){
        Humanos humanos = new Humanos(40,"Juan pablo",100,50,30);
        int poder = humanos.AtaqueMultiple();
        int esperado = humanos.ataque(poder);
        int resultado = humanos.ataque(poder);

        Assert.assertEquals(esperado,resultado);

    }

    @Test
    public void testataquemultiple(){
        Humanos humanos = new Humanos(40,"Juan pablo",100,50,30);
        int esperado = humanos.getFuerzaHumana();
        humanos.setFuerzaHumana(40);
        int resultado = humanos.getFuerzaHumana();
        assertEquals(esperado,resultado);
    }

    @Test
    public void testdefensadebil(){
        Humanos humanos = new Humanos(40,"Juan pablo",100,50,30);

        int esperado = humanos.Defensadebil();
        int resultado = (humanos.defensa + 10); // "10" Es la constante de la interfaz ficha 1

        assertEquals(esperado,resultado);
    }
}