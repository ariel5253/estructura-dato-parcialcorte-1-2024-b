import java.security.DigestOutputStream;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        Integer cantidad=0;
        Double valorUnitario=0.0;
        Double totalBruto = 0.0;
        Double totalNeto = 0.0;
        Double descuento = 0.0;
        String errorData  ="Verificar dato de entrada.";
        System.out.println("Digite nombre del producto: ");
        nombre = scanner.next();

        System.out.println("Digite la cantidad de "+nombre+": ");
        cantidad = scanner.nextInt();

        if(cantidad>0){
            System.out.println("Digite la valor unitario de "+nombre+": ");
            valorUnitario = scanner.nextDouble();
            if(valorUnitario>0){

                System.out.println("Proceso");
                totalBruto = cantidad*valorUnitario;

                if(cantidad<10){
                    //%0
                    totalNeto = totalBruto;
                }else{
                    if(cantidad<=20){
                        //%5
                        totalNeto = totalBruto*0.95;
                        descuento = totalBruto*0.05;
                    }else{
                        //%7
                        totalNeto = totalBruto*0.93;
                        descuento = totalBruto*0.07;
                    }
                }
                System.out.println("Producto: "+nombre);
                System.out.println("Valor unitario: "+valorUnitario);
                System.out.println("Total bruto: "+totalBruto);
                System.out.println("Total neto: "+totalNeto);
                System.out.println("Descuento: "+descuento);
            }else{
                System.out.println(errorData);
            }
        }else{
            System.out.println(errorData);
        }

    }
}
