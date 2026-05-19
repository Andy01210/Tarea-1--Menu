public class Vehiculo{
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo =modelo;
    }
    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}

    public void Imprimir(){
        System.out.println("LA marca del vehiculo es: "+getMarca());
        System.out.println("El modelo del vehiculo es: "+getModelo());
    }
}