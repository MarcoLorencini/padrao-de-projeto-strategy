/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author mv_fr
 */
public class Transportadora {
    
    private EstrategiaCalculoCustoEnvio estrategiaCalculoCustoEnvio;
    
    public Transportadora (EstrategiaCalculoCustoEnvio estrategiaCalculoCustoEnvio){
        this.estrategiaCalculoCustoEnvio = estrategiaCalculoCustoEnvio;
    }
    
    public void setEstrategiaCalculoCustoEnvio( EstrategiaCalculoCustoEnvio estrategia){
        this.estrategiaCalculoCustoEnvio = estrategia;
    }
    
    public double calcularCustoEnvio(double peso, double distancia){
        return this.estrategiaCalculoCustoEnvio.calcularCusto(peso, distancia);
    }
}
