import java.util.Scanner;


public class Tarea1{
    
    static Scanner leer = new Scanner(System.in); 
    public static void main(){
       
        int op = 0;
        while(op != 11){
            System.out.println("Elija la opcion que desea realizar: \n 1.Calculadora\n 2.Numero par o impar \n 3.Tabla de multiplicar\n 4.Contador de vocales\n" +
            " 5.promedio de notas\n 6.Clase Estudiante\n 7. Cuenta Bancaria\n 8.Herencia vehiculo\n 9.Matriz 3x2\n 10.Sistema Basico de inventario\n 11.Salir del menu"
            );
            op = leer.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese el primer numero a operar");
                    double num1 = leer.nextDouble();
                    System.out.println("Elija la operacion que desea realizar: \n 1.Suma \n 2.Resta \n 3.Multiplicacion\n 4.Division");
                    int opSuma = leer.nextInt();
                    System.out.println("Ingrese el segundo numero a operar");
                    double num2 = leer.nextDouble();
                    double resultado = 0;           
                    switch(opSuma){
                        case 1:
                            resultado = num1 + num2;
                            System.out.println("El resultado de su operacion fue:"+ resultado);
                         break;
                        case 2:
                            resultado = num1 - num2;
                            System.out.println("El resultado de su operacion fue:"+ resultado);
                            break;
                        case 3:
                            resultado = num1 * num2;
                            System.out.println("El resultado de su operacion fue:"+ resultado);
                            break;
                        case 4:
                            resultado = num1 / num2;
                            System.out.println("El resultado de su operacion fue: "+ resultado);
                            break;
                        default:
                            System.out.println("opcion no valida");
                            break;

                        }
                     Cls();
                     break; 
                case 2:
                    System.out.println("ingrese un numero");
                    int a = leer.nextInt();
                    if(a % 2 == 0){
                        System.out.println("El numero ingresado es par");
                    }else
                        {System.out.println("El numero ingresado es impar");}
                    Cls();
                    break;
                case 3:
                    System.out.println("Ingrese el numero del cual desea ver su tabla");
                    int b = leer.nextInt();
                    System.out.println("La tabla del numero ingresado es la siguiente: \n"
                    +b +" x 1 = " + b*1 +"\n"
                    +b +" x 2 = " + b*2+"\n"
                    +b +" x 3 = " + b* 3+"\n"
                    +b +" x 4 = " + b*4+"\n"
                    +b +" x 5 = " + b*5+"\n"
                    +b +" x 6 = " + b*6+"\n"
                    +b +" x 7 = " + b*7 +"\n"
                    +b +" x 8 = " + b*8+"\n"
                    +b +" x 9 = " + b*9 +"\n"
                    +b +" x 10 = " + b*10 );
                    Cls();
                    break;
                case 4:
                    System.out.println("Ingrese una frase");
                    leer.nextLine();
                    String frase = leer.nextLine();
                    int contador = 0;
                    for(int i = 0; i < frase.length(); i++){
                        char c = frase.charAt(i);
                        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                            contador++;
                        }
                    }
                    System.out.println("El numero de vocales en la frase es: " + contador);
                    Cls();
                    break;
                case 5:
                    System.out.println("Ingrese el numero de notas a promediar");
                    int numNotas = leer.nextInt();
                    leer.nextLine();
                    double SumaNotas = 0;
                    int SumaCreditos = 0;
                    String Nota = "";
                    for(int i =0; i< numNotas; i++){
                        System.out.println("ingrese la calificacion " + (i +1));
                        Nota = leer.nextLine();
                        System.out.println("ingrese el numero de creditos de la materia");
                        int Creditos = leer.nextInt();
                        leer.nextLine();
                        if(Nota.equalsIgnoreCase("A")){
                            SumaNotas += 4 * Creditos;
                        }else if(Nota.equalsIgnoreCase("B+")){
                            SumaNotas += 3.5 * Creditos;
                        }else if(Nota.equalsIgnoreCase("B")){
                            SumaNotas += 3 * Creditos;
                        }else if(Nota.equalsIgnoreCase("C+")){
                            SumaNotas += 2.5 * Creditos;
                        }else if(Nota.equalsIgnoreCase("C")){
                            SumaNotas += 2 * Creditos;
                        }else if(Nota.equalsIgnoreCase("D")){
                            SumaNotas += 1 * Creditos;
                        }else if(Nota.equalsIgnoreCase("F")){
                            SumaNotas += 0 * Creditos;
                    }
                    SumaCreditos += Creditos;
                    }
                    double Promedio = SumaNotas / SumaCreditos;
                    System.out.println("El promedio es: " + Promedio);
                    Cls();
                    break;
                case 6:
                    Estudiante nuevo = new Estudiante();
                    nuevo.Llenar();
                    Cls();
                    break;
                case 7:
                    CuentaBancaria cuenta = new CuentaBancaria("Andy", 5000);
                    cuenta.EntrarDinero(2000);
                    cuenta.SacarDinero(3000);
                    Cls();
                    break;
                case 8:
                    Guagua guagua = new Guagua("Toyota", "Hilux", "Blanca");
                    guagua.ImprimirGuagua();
                    Cls();
                    break;
                        
                case 9:
                    int [][] matriz = new int[3][3];
                        for(int i = 0; i < 3; i++){
                            for(int j = 0; j < 3; j++){
                                System.out.println("ingrese el elemento ["+ i +"," + j +"]");
                                matriz[i][j] = leer.nextInt();
                           }
                        }
                        System.out.println("La matriz ingresada es:\n\n ");
                        for(int i = 0; i < 3; i++){
                            System.out.print("[");
                            for(int j = 0; j < 3; j++){
                                System.out.print(" "+matriz[i][j] + " ");
                            }
                            System.out.print("]");
                            System.out.println();
                        }
                        Cls();
                        break; 
                case 10:
                int opInv = 0;
                Inventario inv = new Inventario();
                do{
                     System.out.println(" 1.Agregar Producto \n 2.Mostrar inventario \n 3. Salir");
                    opInv = leer.nextInt();
                    leer.nextLine();
                switch(opInv){
                    
                    case 1:
                        System.out.println("Ingrese el nombre del producto");
                        String Nombre = leer.nextLine();
                        System.out.println("ingrese la cantidad de producto");
                        int Cant = leer.nextInt();
                        leer.nextLine();
                        inv.AgregarProducto(Nombre, Cant);
                        Cls();
                        break;
                    case 2:
                        System.out.println("los productos ingresados fueron:");
                        inv.Imprimir();
                        Cls();
                        break;   
                    case 3:
                        System.out.println("Ha salido correctamente");
                        Cls();
                        break;
                }}
                while(opInv != 3);
                case 11:
                    System.out.println("Gracias por participar");
                    break;
                default:
                    System.out.println("Opcion fuera de rango, intente nuevamente");
                    Cls();
    }
}
    }






static void pausa(){
    System.out.println("\n\nPresione Enter para continuar");
    leer.nextLine(); 
    

}
static void Cls(){
    pausa();
    for(int i =0; i < 50; i++){
                System.out.println(" ");
            }

}
}