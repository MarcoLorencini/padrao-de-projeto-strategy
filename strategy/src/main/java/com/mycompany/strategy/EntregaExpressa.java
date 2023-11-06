/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author mv_fr
 */
public class EntregaExpressa implements EstrategiaCalculoCustoEnvio{
    @Override
    public double calcularCusto(double peso, double distancia){
        return(peso * 0.5) + (distancia * 0.1);
    }
}
