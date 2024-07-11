package NumeroDePersonas;


//Clasificar a cierto número de personas
public class Persona{
    private String name;                   //Nombre
    private String lastName;               //Apellido
    private int age;                       //Edad
    private boolean married;               //¿Esta casado/a?
    private String identityDocumentNumber; //Numero del documento de identidad

    //Constructor
    public Persona(){
        this.name= " ";
        this.lastName= "";
        this.age= 0;
        this.married= true;
        this.identityDocumentNumber= "No establecido";
    } //Cierre de constructor

    //Como se definen las caracteristicas:
    //Nombre
    public void setName(String valueName){
        this.name= valueName;
        
    } 
    //Apellido
    public void setLastName(String valueLastName){
        this.lastName= valueLastName;
    }
    //Edad
    public void setAge(int valueAge){
        this.age= valueAge;
    }
    //Casado/a o no casado/a
    public void setMarried(boolean valueMarried){
        this.married= valueMarried;
        
        if(married==true){
            System.out.println("casado: Si");
        }
        else{
            System.out.println("casado: No");
        }
        
    }
    
    //Su numero de identidad
    public void setIdentityDocumentNumber(String valueIdentityDocumentNumber){
        this.identityDocumentNumber= valueIdentityDocumentNumber;
    }

    //Obtener las caracteristicas:
    //Nombre
    public String getName(){return this.name;}
    //Apellido
    public String getLastName(){return this.lastName;}
    //Edad
    public int getAge(){return this.age;}
    //Casado/a o no casado/a
    public boolean getMarried(){return this.married;}
    //Su numero de identidad
    public String valueIdentityDocumentNumber(){return this.identityDocumentNumber;}
}