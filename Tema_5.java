/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_5;
import java.util.*;

/**
 *
 * @author User
 */
public class Tema_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio15();
        //ejercicio16();
        //ejercicio17();
        //ejercicio18();
        //ejercicio19();
        //ejercicio20();
        //ejercicio21();
        ejercicio22();
    }
    //22. Realiza un programa que pida un número y construya por pantalla su pirámide.
    public static void ejercicio22()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int x = 1, s = 1;
        
        System.out.print("Dime un número para realizar su pirámide:");
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) //para filas
        {
            for(int j = x; j <= n; j++) //espacios en blanco en cada fila
            {
                System.out.print(" ");
            }
            for(int l = 1; l <= s; l++) //asteriscos en cada fila
            {
                System.out.print("*");
            }
            s += 2;
            x++;
            System.out.println("");
        }
    }
    
    //21. Realiza un programa que pida dos números enteros A y B, siendo B mayor que A. Luego
    //    visualiza los números desde A hasta B y que indique cuántos hay que sean pares.
    public static void ejercicio21()
    {
        int a, b, pares = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        a = sc.nextInt();
        System.out.print("Dime otro número mayor que el anterior:");
        b = sc.nextInt();
        
        for(int i = a; i <= b; i++)
        {
            System.out.print(i + " ");
            if(i % 2 == 0)
            {
                pares++;
            }
        }
        System.out.println("\nLa cantidad de pares son: " + pares);
    }
    
    
    //20. Codifica un programa que pida un número entero, entre 0 y 20, y que muestre en pantalla una
    //    secuencia de números, repitiendo cada número tantas veces como el valor que representa
    public static void ejercicio20()
    {
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        
        for(int i = 1; i <= numero; i++)
        {
            for(int n = 1; n <= i; n++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //19. Realiza un programa que lea un número y a continuación escriba el carácter "*" tantas veces
    //    como el valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá
    //    escribir un único asterísco.
    public static void ejercicio19()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un número: ");
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++)
        {
            System.out.print("* ");
        }
        System.out.println("");
        
        if(n < 0)
        {
            System.out.println("*");
        }
    }

    //18. Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números naturales.
    public static void ejercicio18()
    {
        int resultado = 0;
        for(int i = 1; i <= 5; i++)
        {
            resultado += i * i;
        }
        System.out.println("" + resultado);
    }
    
    //17. Diseña un algoritmo que lea y acepte únicamente aquellos números que sean mayores que el 
    //    último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
    //    a. El total de números introducidos, excluído el 0.
    //    b. El total de números fallados
    public static void ejercicio17()
    {
        int n, total = 0, fallos = 0, ant = 0;
        String aceptados = "";
        
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("Dime un número:");
            n = sc.nextInt();
            
            if(n <= ant && n != 0)
            {
                fallos++;
                total++;
            }
            if(n > ant)
            {
                ant = n;
                aceptados += Integer.toString(n) + " ";
                total++;
            }
        }while (n != 0);
        System.out.println("Los números aceptados son:" + aceptados);
        System.out.println("Total de números introducidos:" + total);
        System.out.println("Fallos: " + fallos);
    }



    //16. Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
    public static void ejercicio16()
    {
        Scanner sc = new Scanner(System.in);
        int n, contador;
        boolean esprimo = true;
        
        do
        {
            System.out.print("Dime un número:");
            n = sc.nextInt();
            if(n <= 0)
            {
                System.out.println("El número debe ser entero y positivo");
            }
        }while(n <= 0);
        
        contador = n - 1;
        while(esprimo == true && contador > 1)
        {
            if(n % contador == 0)
            {
                esprimo = false;
            }
            contador--;
        }
        if(esprimo)
        {
            System.out.println("Es primo.");
        }else{
            System.out.println("No es primo.");
        }
    }
    
    //15. Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que 
    //    introducimos por teclado.
    public static void ejercicio15()
    {
        int cuenta, n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Díme un número");
        n = sc.nextInt();
        cuenta = 0;
        
        for(int i = 3; i <= n; i = i + 3)
        {
            cuenta++;
        }
        System.out.println("Cantidad de múltiplos de 3: " + cuenta);
    }
    
    
    
    //14. Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado (múltiplo de
    // 5€) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha cantidad (utilizando
    // billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de billetes posible. Por ejemplo, 
    // si el usuario introduce 145 el programa indicará que será necesario 1 billete de 100€, 2 billetes de
    // 20€ y 1 billete de 5€ (no será válido por ejemplo 29 billetes de 5, que aunque sume 145€ no es el mínimo
    // número de billetes posible).
    public static void ejercicio14()
    {
        Scanner entrada = new Scanner(System.in);
        int cantidad, numBilletes, billete;
        
        billete = 500;
        System.out.println("Introduce una cantidad (múltiplo de 5) en €:");
        cantidad = entrada.nextInt();
        
        while(cantidad > 0)
        {
            numBilletes = cantidad / billete;
            cantidad = cantidad % billete;
            
            System.out.println(numBilletes + " billetes de " + billete);
            
            switch(billete){
                case 500:
                    billete = 200;
                    break;
                case 200:
                    billete = 100;
                    break;
                case 100:
                    billete = 50;
                    break;
                case 50:
                    billete = 20;
                    break;
                case 20:
                    billete = 10;
                    break;
                case 10:
                    billete = 5;
                    break;
            }
        }
    }
    
    //13. Realiza un programa donde el usuario piensa un número del 1 al 100 y el ordenador intenta adivinarlo.
    // Es decir, el ordenador irá poniendo números una y otra vez hasta adivinarlo (el usuario deberá indicarle
    // al ordenador si es mayor, menor o igual al número que ha pensado).
    public static void ejercicio13()
    {
        Scanner entrada = new Scanner(System.in);
        
        int num, max, min, anterior;
        boolean seguir;
        char respuesta;
        
        seguir = true;
        max = 100;
        min = 1;
        anterior = 0;
        
        while(seguir)  //Equivalente a (seguir == true)
        {
            num = (max + min)/2;
            if(num == anterior)
            {
                num++;
            }//Entender para qué se utiliza.
            System.out.print("El número es " + num + "?(Escribe:=,< 0 >):");
            respuesta = entrada.nextLine().charAt(0); //Leemos un caracter.
            
            switch(respuesta)
            {
                case '<':
                    max = num;
                    anterior = num;
                    break;
                case '=':
                    seguir = false;
                    break;
                case '>':
                    min = num;
                    anterior = num;
                    break;
            }
        }
        System.out.println("Lo acerté!!");
    }
    
    //12. Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de potencia
    // (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por pantalla.
    public static void ejercicio12()
    {
        Scanner entrada = new Scanner(System.in);
        
        float numA, potencia;
        int numB, cont, veces; //Utilizamos la variable veces para saber el número de iteraciones del bucle.
        
        potencia = 1;
        
        System.out.print("Introduce el número A (real):");
        numA = entrada.nextFloat();
        
        System.out.print("Introduce el número B (entero):");
        numB = entrada.nextInt();
        
        if(numB < 0)
        {
            veces = -numB; //si el exponente es negativo lo convertimos a positivo
        }else{
            veces = numB;
        }
        for(cont = 1; cont <= veces; cont++)
        {
            potencia = potencia * numA;
        }
        if(numB < 0)
        {
            potencia = 1 / potencia;
        }
        System.out.println(numA + " elevado a " + numB + " es " + potencia);
    }
    
    //11. Realiza un programa que sume independientemente los pares y los impares de los números comprendidos
    // entre 100 y 200, luego muestra por la pantalla ambas sumas.
    public static void ejercicio11()
    {
        int pares, impares, cont;
        pares = 0;
        impares = 0;
        
        for(cont = 100; cont <= 200; cont++)
        {
            if(cont%2 == 0)
            {
                pares = pares + cont;
            }else{
                impares += cont; //equivalente a impares = imapres + cont;
            }
        }
        System.out.println("La suma total de los pares es " + pares);
        System.out.println("La suma total de los impares es " + impares);
    }
    
    //10. Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que termina
    // con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
    public static void ejercicio10()
    {
        Scanner entrada = new Scanner(System.in);
        
        float nota;
        boolean hay10 = false;
        
        System.out.println("Introduce una nota entre 0 y 10 (-1 para salir):");
        nota = entrada.nextFloat();
        
        while (nota != -1)
        {
            if(nota==10)
            {
                hay10 = true;
            }
            System.out.print("Introduce una nota entre 0 y 10 (-1 para salir):");
            nota = entrada.nextFloat();
        }
        if(hay10) //equivalente a hay10==true
        {
            System.out.println("Hay al menos una nota de 10");
        }else{
            System.out.println("No hay notas de 10.");
        }
    }

    //9. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números naturales.
    public static void ejercicio9()
    {
        int i, suma, producto;
        
        suma = 0;
        producto = 1;
        
        for(i=1; i<=10; i++)
        {
            suma = suma + i;
            producto = producto * i;
        }
        System.out.println("La suma es " + suma + " y el producto es" + producto);
    }

    //8. Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y luego
    // muestre si ha leído algún número negativo, cuántos positivos y cuántos negativos.
    public static void ejercicio8()
    {
        Scanner entrada = new Scanner(System.in);
        int n, pos = 0, neg = 0;
        
        System.out.print("Introduce un número (0 para acabar):");
        n = entrada.nextInt();
        
        while(n != 0)
        {
            if(n<0)
            {
                neg++;
            }else{
                pos++;
            }
            System.out.print("Introduce un número:");
            n = entrada.nextInt();
        }
        if(neg>0)
        {
            System.out.println("Se ha introducido números negativos");
        }
        System.out.println("Se ha introducido " + pos + " número/s positivo/s.");
        System.out.println("Se ha introducido " + neg + "número/s negativo/s.");
    }
    
    //7. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando cuántos son positivos
    // y cuantos negativos.
    public static void ejercicio7()
    {
        Scanner entrada = new Scanner(System.in);
        int cont, num, pos, neg;
        final int maximo = 10;
        
        pos = 0;
        neg = 0;
        
        for(cont=1; cont<=maximo; cont++)
        {
            System.out.println("Introduce el número " + " de " + maximo + ":");
            num = entrada.nextInt();
            
            if(num<0)
            {
                neg++;
            }else{
                pos++;
            }
        }
        System.out.println("Se ha introducido " + pos + " número/s positivo/s.");
        System.out.println("Se han introducido " + neg + " número/s negativos/s");
    }
    //6. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leído algún número negativo
    // o no.
    public static void ejercicio6()
    {
        Scanner entrada = new Scanner(System.in);
        int cont, num;
        boolean negativo;
        final int maximo = 10; //El ejercicio es sobre 10 números pero podeis cambiar su valor para hacer pruebas
        
        negativo = false;
        
        for(cont = 1; cont<=maximo; cont++)
        {
            System.out.print("Introduce el número " + cont +" de " + maximo + ":");
            num = entrada.nextInt();
            if(num<0)
            {
                negativo = true;
            }
        }
        if(!negativo) //equivale a (negativo==false)
        {
            System.out.print("No ");
        }
        System.out.println("Se ha introducido números negativos.");
    }
    //5. Realiza un programa que lea un número positivo N y calcule y visualice su factorial N! Siendo el factorial: 
     //  0! = 1 
     //  1! = 1 
     //  2! = 2 * 1 
     //  3! = 3 * 2* 1 
     //  N! = N * (N-1) * (N-2)........* 3*2*1
  /*public static void ejercicio5()
    {
     Scanner teclado = new Scanner(System.in);
     int numero;
     System.out.println("Teclea un número y calcularé su factorial");
     numero = teclado.nextInt();
     System.out.print(numero + "! = ");
     for(int i = numero; i>=1; i--){
         int producto = numero * i
         System.out.print(i + " x ");
     }
    }*/
    
    //4. Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado
    public static void ejercicio4()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, teclea un número");
        double n = teclado.nextDouble();
        for(int i = 1; i<=n; i++)
        {
            System.out.print(i + "  ");
        }
    }
    
//3. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez utiliza un contador sumando de 1 en 1. 
    public static void ejercicio3()
    {
        for(int i = 1; i<201; i++)
        {
            int par;
            int contador = 0;
            if(i%2==0)
            {
                par = i;
                contador = contador + par;
                System.out.print(contador + "  ");
            }
        }
    }

//2. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello utiliza un contador y suma de 2 en 2.
    public static void ejercicio2()
    {
        for(int i = 2; i<201; i+=2)
        {
            System.out.print(i + "  ");
        }
    }
    
    
    
    //1. Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20).
    public static void ejercicio1()
    {
        //int i;
        for(int i=1; i<21; i++)
        {
            System.out.print(i + "  ");
        }
    }
    
}
