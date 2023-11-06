/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strategy;

/**
 *
 * @author mv_fr
 */
public class Main {

   public static void main(String[] args){
   
       double peso = 10; //Kg
       double distancia = 100; //Km
       
       Transportadora transportadora = new Transportadora(new EntregaExpressa());
       System.out.println("Custo de Envio Expresso: "
                            + transportadora.calcularCustoEnvio(peso, distancia));
       
       transportadora.setEstrategiaCalculoCustoEnvio(new EntregaNormal());
       System.out.println("Custo de Envio Normal: "
                            + transportadora.calcularCustoEnvio(peso, distancia));
       
       transportadora.setEstrategiaCalculoCustoEnvio(new EntregaEconomica());
       System.out.println("Custo de Envio Econômico: "
                            + transportadora.calcularCustoEnvio(peso, distancia));
   
   }
}
