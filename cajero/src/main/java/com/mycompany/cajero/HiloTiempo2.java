package com.mycompany.cajero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pengu
 */
public class HiloTiempo2 extends Thread{
    private String proceso;
    private long tiempo;

    HiloTiempo2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void run(){
        try{
            tiempo=(long)((Math.random()*5)*1000);
            Thread.sleep(tiempo);
        }catch(Exception e){
        System.out.println("Error de ejecucion");
    }
        System.out.println("Fin de proceso "+ proceso+" finalizado en "+tiempo+" milisegundos");
    }
    
    public HiloTiempo2(String proceso){
        this.proceso=proceso;
    }
}

