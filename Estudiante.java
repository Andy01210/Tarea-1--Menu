import java.util.Scanner;



public class Estudiante{
    Scanner leer = new Scanner(System.in);
    private String Nombre;
    private String Matricula;
    private String Carrera;
    
    public Estudiante(){

    }



    public Estudiante(String Nombre, String Matricula, String Carrera){
        this.Nombre = Nombre;
        this.Matricula = Matricula;
        this.Carrera = Carrera;
    }

    public String getNombre(){return Nombre;}
    public String getMatricula(){return Matricula;}
    public String getCarrera(){return Carrera;}

    public void SetNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setMatricula(String Matricula){
        this.Matricula = Matricula;
    }
    public void setCarrera(String Carrera){
        this.Carrera = Carrera;
    }

    public void Llenar(){
        System.out.println("Ingrese el nombre del estudiante");
        this.Nombre = leer.nextLine(); 
        System.out.println("Ingrese la matricula del estudiante");
        this.Matricula = leer.nextLine();
        System.out.println("Ingrese la carrera del estudiante");
        this.Carrera = leer.nextLine();
        Imprimir();
    }

    public void Imprimir(){
        System.out.println("El nombre del estudiante es: " +this.Nombre);
        System.out.println("La Carrera a la que pertenece el estudiante es: " + this.Carrera);
        System.out.println("La Matricual de es: " +this.Matricula);




        
    }


}

