## Exercicio (Java): quantidade de numeros positivos

O exercicio publicado é referente ao treinamento do Bootcamp Java Developer - Fundamentos Aritméticos em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados

#### Entrada: 

Você receberá seis valores, negativos e/ou positivos.

#### Saída: 

Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos" ao final.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
7 | 4 valores positivos
-5
6
-3.4
4.6
12


#### Java　

```java
//SOLUCAO 1

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
```

