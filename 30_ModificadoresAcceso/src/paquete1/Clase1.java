package paquete1;
//modificador acceso publico
 class Clase1 {
    //Atributo publico
     private String atributoPrivado = "Valor atributo privado";

    //Clase privado
     private Clase1(){
        System.out.println("Constructor privado");
    }
    //publico
    public Clase1(String argumento){
        this();
        System.out.println("Contructor publico");
    }
   
    private void metodoPrivado(){
        System.out.println("Método default");
    }


    //para modificar el valor de atributo privado - usamos get set
 
    public String getAtributoPrivado() {
        return atributoPrivado;
    }
    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }

    
    
}
