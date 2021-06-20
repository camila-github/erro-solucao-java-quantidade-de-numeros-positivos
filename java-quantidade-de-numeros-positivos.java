  import java.io.BufferedReader;
  import java.io.InputStreamReader;
  import java.io.IOException;
  import java.util.StringTokenizer;
  
  public class QuantidadeNumerosPositivos {
      public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      String validarNumero ;
      Double numeroEntrada;
      int quantNumPositivos = 0, contador = 1;
          
      do{
          st = new StringTokenizer(br.readLine());
          numeroEntrada = Double.parseDouble(st.nextToken());
          validarNumero = String.valueOf(numeroEntrada);
          
          if(validarNumero != null || validarNumero.isEmpty() || validarNumero.trim().isEmpty()){             
            if(numeroEntrada > 0) quantNumPositivos++;
          }

          contador++;
      } while(contador <= 6);
      
      System.out.println(quantNumPositivos + " valores positivos");
      br.close();
      
    }
  }
  

