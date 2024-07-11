package test;

import enumeracion.*;
public class TestEnumeraciones{

    public static void main(String[] args) {
        //System.out.println("Dia 1: "+Dias.LUNES);

        //indicarDiaSemana(Dias.JUEVES);

        
        System.out.println("Continente 4: "+Continentes.AMERICA);
        System.out.println("No. Paises en el 4to continente: "+Continentes.AMERICA.getPaises());
        System.out.println("Continente 2: "+Continentes.EUROPA);
        System.out.println("No. Paises en el 2ndo continente:  "+Continentes.EUROPA.getPaises());
        System.out.println("Continente 3: "+Continentes.ASIA);
        System.out.println("No. Paises en el 3er continente: "+Continentes.ASIA.getPaises());
        
    }

    private static void indicarDiaSemana(Dias dias){
        switch (dias){
            case LUNES:{
                System.out.println("Primer dia de la semana");
                break;
            }
            case MARTES:{
                System.out.println("Segundo dia de la semana");
                break;
            }
            case MIERCOLES:{
                System.out.println("Tercer dia de la semana");
            }
            case JUEVES:{
                System.out.println("Cuarto dia de la semana");
            }
        }
    }

}