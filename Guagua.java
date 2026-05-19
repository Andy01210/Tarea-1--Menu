public class Guagua extends Vehiculo{
   private String Color;
   

   public Guagua(String marca, String Modelo, String Color){
    super(marca, Modelo);
    this.Color = Color;
   }

   public void ImprimirGuagua(){
        Imprimir();
        System.out.println("El Color del vehiculo es: " + Color);
        
   }




}