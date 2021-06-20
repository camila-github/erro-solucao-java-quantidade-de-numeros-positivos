## Exercicio (Java): Exibindo Números Pares

O exercicio publicado é referente ao treinamento do Bootcamp Java Developer - Fundamentos Aritméticos em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

#### Entrada: 

Você receberá 1 valor inteiro N, onde N > 0.

#### Saída: 

<<<<<<< HEAD
Exiba uma mensagem dizendo quantos valores positivos foram lidos, assim como é exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos" ao final.
=======
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 
>>>>>>> a0670c13db91225b46dba7458bc9cb1793d6c4c8

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
6 | 2
 | 4
 | 6


#### Java　

```java
//SOLUCAO 1

<<<<<<< HEAD
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
=======
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ExibirNumerosPares {
    public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int numEntrada = Integer.parseInt(st.nextToken());
     
      for (int i = 0; i <= numEntrada; i++) {
        if (i % 2 == 0 && i != 0 ) System.out.println (i);
      }
  } 
}
>>>>>>> a0670c13db91225b46dba7458bc9cb1793d6c4c8
```

