public class CuentaBancaria{
    private String NomTit;
    private double Dinero;


    public CuentaBancaria(String Nombre, double Entrada){
        this.NomTit= Nombre;
        this.Dinero += Entrada;
        }
    
    public void SacarDinero(double Cantidad){
        if(Dinero >= Cantidad){
            System.out.println("La cantidad solicictada ha sido retirada");
            this.Dinero = Dinero - Cantidad;
        }
        else{
            System.out.println("La cantidad solicitada es mayor a su balance");
            System.out.println("Su balance es: "+Dinero);
        }
    }
    public void EntrarDinero(double Cantidad){
        this.Dinero += Cantidad;
        System.out.println("Su Cantidad ha sido ingresada Correctamente. \n Su balance es de: "+Dinero);
    }
}

