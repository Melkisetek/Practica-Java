package AlcanceDeVariable.Laboratorio1;
//Laboratorio: Proyecto Caja

public class Caja {
    //Atributos 
    int ancho;
    int profundo;
    int alto;

    //constructores
    public Caja(){
        System.out.println("Inicializando costructor vacio");
    }

    public Caja(int a, int b, int c){
        System.out.println("Constructor con argumentos");
        this.ancho=a;
        this.profundo=b;
        this.alto=c;

    }

    //metodo
    public int formulaVolumen(){
        //fórmula volumen: vol=ancho*alto*profundo
        return this.ancho*this.alto*this.profundo;

        
    }
}
