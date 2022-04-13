public class OperacionesAnidadas {
  public static void main(String[] args) {
    int operacion = 1;
    int num_uno = 8, num_dos = 4, resultado = 0;

    if(operacion ==1){
      resultado = num_uno +num_dos;
      System.out.println("El resultado de suma es: "+ resultado);
    }else if(operacion == 2){
      resultado = num_uno - num_dos;
      System.out.println("El resultado de resta es: "+ resultado);
    }else if(operacion == 3){
      resultado = num_uno * num_dos;
      System.out.println("El resultado de suma es: "+ resultado);
    } else if (operacion == 4){
      resultado = num_uno / num_dos;
      System.out.println("El resultado de suma es: "+ resultado);
    }else System.out.println("Operación no valida");
  }
}
