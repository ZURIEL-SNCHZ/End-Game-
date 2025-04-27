/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author Zuriel Ali  
 */
public class EndGame {

    public static void main(String[] args) {
        Heroe blackPanter=new Heroe("Black Panter ","Ser Rey de Wakanda"," Garras de Vibranium");
        Villano loki=new Villano("Loki ","Poderes Magicos y Habilidades Fisicas Sobrehumanas","Chitauri");
        Avenger ironMan=new Avenger("Tony Stark ","Genio,Filantropo,multimillonario,playboy"," Mark 42"," Prime ");
        Thanos  thanos=new Thanos("Thanos ","El titan loco ","Ejercito Chitaury ","Gemas del infinito ");
        
       //Aplicando plomorfismo 
       
       Personaje[]personajes= {blackPanter,loki,ironMan,thanos};
       for(Personaje personaje:personajes){
           personaje.atacar();
       }
       
       //Metodo especifico de avenger
       ((Avenger)ironMan).reunirse();
       
       //ejemplo metodo especifico de thanos
       thanos.chasquearDedos();
             
    }
}
