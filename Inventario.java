import java.util.Scanner;

public class Inventario{
    private String [] Producto = new String [30];
    private int [] Cantidad = new int [30];

    public void AgregarProducto(String Nombre, int Cant){
        for(int i =0; i< Producto.length; i++){
            if(Producto[i]== null){
                Producto[i] = Nombre;
                Cantidad[i]= Cant;
                System.out.println("Producto agregado correctamente");
                break;
            }
            
        }
    }
        public void Imprimir(){
            System.out.println("Los productos alamacenado fueron;");
            for(int i = 0; i < Producto.length; i++){
                if(Producto[i]!= null){
                System.out.println(Producto[i]+": "+ Cantidad[i]);}
            }
        }

    }
