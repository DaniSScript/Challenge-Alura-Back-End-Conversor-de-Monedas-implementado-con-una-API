import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConexionAPI conex= new ConexionAPI();
        Moneda moneda= new Moneda();
        JSON json=conex.consultarValorMonedas();
        String OG;
        String DT;
        int op=0; //Creo una variable la cual almacenará la opción que elija el usuario (inicializo con el valor 0)
        do {
            try {
                System.out.println("*********************************************************");
                System.out.println("HOLA! Sea bienvenido a mi conversor de monedas por el CHALLENGE ALURA!");
                System.out.println();
                System.out.println("1) Dólar =>> Peso Argentino");
                System.out.println("2) Peso Argentino =>> Dólar");
                System.out.println("3) Dólar =>> Real Brasileño");
                System.out.println("4) Real Brasileño =>> Dólar");
                System.out.println("5) Dólar =>> Peso Colombiano");
                System.out.println("6) Peso Colombiano =>> Dólar");
                System.out.println("7) Dolar =>> Sol Peruano");
                System.out.println("8) Sol Peruano =>> Dolar");
                System.out.println("9) Salir");
                System.out.print("Elija una opción válidad:");
                op = entrada.nextInt();

                if (op>=1 && op<=9) {
                    if (op != 9) {
                        System.out.print("Ingrese la CANTIDAD que desea convertir: ");
                        double cantidad = entrada.nextDouble();


                        switch (op) {
                            case 1:
                                moneda.calcularConversion("USD", "ARS", cantidad);
                                break;
                            case 2:
                                moneda.calcularConversion("ARS", "USD", cantidad);
                                break;
                            case 3:
                                moneda.calcularConversion("USD", "BRL", cantidad);
                                break;
                            case 4:
                                moneda.calcularConversion("BRL", "USD", cantidad);
                                break;
                            case 5:
                                moneda.calcularConversion("USD", "COP", cantidad);
                                break;
                            case 6:
                                moneda.calcularConversion("COP", "USD", cantidad);
                                break;
                            case 7:
                                moneda.calcularConversion("USD", "PEN", cantidad);
                                break;
                            case 8:
                                moneda.calcularConversion("PEN", "USD", cantidad);
                                break;
                            default:
                                System.out.println("TIPO DE MONEDA NO REGISTRADA EN EL SISTEMA :(");
                        }
                    }
                }else{
                    System.out.println("Opción incorrecta, asegurese de ingresar una de las opciones mostradas!");
                }
            } catch (Exception e){
                System.out.println("CANTIDAD U OPCIÓN INGRESADA ERRONEAMENTE, VUELVA A INTENTARLO :)");
                entrada.nextLine();
            }

        }while(op!=9);
    }
}
