/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_6;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class Tema_6 {

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
        ejercicio20();
        //ejercicio21();
        //ejercicio22();
        //ejercicio23();
        //ejercicio24();
        //ejercicio25();
        //ejercicio26();
        //ejercicio27();
        //ejercicio28();
        //ejercicio29();
        //ejercicio30();
    }
    //30. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
    //    empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por
    //    teclado la información de N personas distintas (valor también introducido por teclado).
    //    Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta
    //    información debe guardarse en una única matriz. Luego se mostrará por pantalla el sueldo 
    //    medio de cada género.
        public static void ejercicio30()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el número de personas ");
        int n = sc.nextInt();
        int nvarones = 0, nmujeres = 0, sumavarones = 0, sumamujeres = 0;

        float sueldos[][] = new float[n][2];

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                if (j == 0) {
                    System.out.print("Dime el género (0 para varón y 1 para mujer) de la persona " + (i + 1) + ": ");
                    sueldos[i][j] = sc.nextFloat();
                }
                if (j == 1) {
                    System.out.print("Dime el sueldo: ");
                    sueldos[i][j] = sc.nextFloat();
                }
            }
        }

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                System.out.print(sueldos[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i][0] == 0.0) {
                nvarones++;
                sumavarones += sueldos[i][1];
            }
            if (sueldos[i][0] == 1.0) {
                nmujeres++;
                sumamujeres += sueldos[i][1];
            }
        }
        System.out.println("El sueldo medio de los varones es: " + (sumavarones / nvarones));
        System.out.println("El sueldo medio de las mujeres es: " + (sumamujeres / nmujeres));
    }
    
    //29. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados "Alumno
    //    1", "Alumno 2", etc.) y 5 asignaturas. El usuario introducirá las notas por teclado
    //    y luego el programa mostrará la nota mínima, máxima y media de cada alumno.
        public static void ejercicio29()
    {
        Scanner sc = new Scanner(System.in);        
        float notas[][]= new float[4][5];
        float minima=0,maxima=0,media=0,suma=0;
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print("Para el alumno "+(i+1)+" dime su nota "+(j+1)+": ");
                notas[i][j]=sc.nextFloat();
                suma+= notas[i][j];
                if (j==0) {
                    minima=notas[i][j];
                    maxima=notas[i][j];
                }
                if(minima>notas[i][j]){
                    minima=notas[i][j];
                }
                if(maxima<notas[i][j]){
                    maxima=notas[i][j];
                }
            }
            System.out.println("La nota mínima del alumno "+(i+1)+" es: "+minima);
            System.out.println("La nota máxima del alumno "+(i+1)+" es: "+maxima);
            System.out.println("La nota media del alumno "+(i+1)+" es: "+ (suma/5));
            suma=0;
            System.out.println("");
        }
    }
    
    //28. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
    //    introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer
    //    la matriz y mostrar por pantalla cuántos valores son mayores que cero, cuántos son 
    //    menores que cero y cuántos son igual a cero.
        public static void ejercicio28()
    {
                Scanner sc = new Scanner(System.in);

        int n, m, menor = 0, mayores = 0, menores = 0, cero = 0;

        System.out.println("Introduce numero de filas");

        n = sc.nextInt();

        System.out.println("Introduce numero de columnas");

        m = sc.nextInt();

        int matriz[][] = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {

            for (int x = 0; x < matriz[0].length; x++) {

                System.out.println("Introduce valor de fila : " + (i + 1) + " Columna: " + (x + 1));

                matriz[i][x] = sc.nextInt();

                if (matriz[i][x] < 0) {
                    menores++;
                } else if (matriz[i][x] > 0) {
                    mayores++;
                } else {
                    cero++;
                }

            }

        }
    }
    
    //27. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
    //    multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
        public static void ejercicio27()
    {
        int x = 1;
        int m[][] = new int[10][10];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = x * (j + 1);
                System.out.printf("%4d", m[i][j]);
            }
            x++;
            System.out.println("");

        }
    }
    
    //26. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
    //    y luego muestre la matriz por pantalla.
        public static void ejercicio26()
    {
        int x = 1;
        int m[][] = new int[5][5];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = x++;
                System.out.printf("%4d", m[i][j]);
            }
            System.out.println("");

        }
    }
    
    //25. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o no
    //    (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que el 
    //    usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.) Un palíndromo
    //    es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
    //    Por ejemplo:
    //          Amigo no gima
    //          Dabale arroz a la zorra el abad
    //          Amo la pacífica paloma
    //          A man a plan a canal Panama
        public static void ejercicio25()
    {
                Scanner sc = new Scanner(System.in);
        String frase;
        boolean palindromo = true;

        // Suponemos que la frase no tiene acentos ni signos de puntuación.
        System.out.print("Introduce una frase: ");

        frase = sc.nextLine();
        frase = frase.replace(" ", "");
        frase = frase.toUpperCase();
        int longitud = frase.length();

        for (int i = 0; i < longitud && palindromo; i++) {
            // comparamos el carácter de la posición i con el de la última posición - i
            if (frase.charAt(i) != frase.charAt((longitud - 1) - i)) {
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("La frase es palindromo");
        } else {
            System.out.println("La frase no es palindromo");
        }
    
    }
    
    //24. Crea un programa que muestre por pantalla cuántas vocales de cada tipo hay (cuantas 'a',
    //    cuántas 'e', etc) en una frase introducida por teclado. No se debe diferenciar entre mayúsculas
    //    y minúsculas. Por ejemplo dada la frase "Mi mama me mima" dirá que hay:
    //    Nº de A's: 3
    //    Nº de E's: 1
    //    Nº de I's: 2
    //    Nº de O's: 0
    //    Nº de U's: 0
        public static void ejercicio24()
    {
        Scanner in = new Scanner(System.in);
        String frase;
        int a, e, i, o, u, cont;
        char c;
        a = 0;
        e = 0;
        i = 0;
        o = 0;
        u = 0;

        System.out.print("Introduce una frase: ");
        frase = in.nextLine();

        frase = frase.toLowerCase(); // Pasamos todo a minúsculas.

        for (cont = 0; cont < frase.length(); cont++) {
            switch (frase.charAt(cont)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("El número de 'a' es: " + a);
        System.out.println("El número de 'e' es: " + e);
        System.out.println("El número de 'i' es: " + i);
        System.out.println("El número de 'o' es: " + o);
        System.out.println("El número de 'u' es: " + u);

    
    }
    
    //23. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
    //    mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres primeras
    //    letras de cada uno de ellos. Por ejemplo si se introduce "Lionel", "Tarazón" y "Alcocer" mostrará
    //    "LIOTARALC".
        public static void ejercicio23()
    {
        Scanner in = new Scanner(System.in);

        String nombre, apellido1, apellido2, codigo;

        System.out.print("Introduce el nombre: ");
        nombre = in.nextLine();

        System.out.print("Introduce el primer apellido: ");
        apellido1 = in.nextLine();

        System.out.print("Introduce el segundo apellido: ");
        apellido2 = in.nextLine();
        codigo = nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3);

        System.out.println("El código es " + codigo);
    }
    
    //22. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
    //    además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
        public static void ejercicio22()
    {
        System.out.println("22. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,\n" +
"    //    además de si son iguales sin diferenciar entre mayúsculas y minúsculas.");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe una cadena de texto: ");
        String cadena1 = sc.nextLine();
        System.out.print("Escribe otra cadena de texto: ");
        String cadena2 = sc.nextLine();
        
        if(cadena1.equals(cadena2))
        {
            System.out.println("Las dos cadenas son iguales");
        }else if (cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Las dos cadenas son iguales, sin diferenciar mayusculas/minusculas");
        }else{
            System.out.println("Son cadenas diferentes");
        }
        System.out.println();
    }
    
    //21. Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra de la 
    //    cadena en una línea distinta
        public static void ejercicio21()
    {
        System.out.println("21. Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra de la \n" +
"    //    cadena en una línea distinta");
        
        Scanner sc = new Scanner(System.in);
        
        String frase;
        String[] frase_dividida;
        int i;
        
        System.out.print("Introduce la frase: ");
        frase = sc.nextLine();
        
        frase_dividida = frase.split(" "); //El método split devuelve el resultado en un vector de Strings.
        
        System.out.println("La frase dividida es: ");
        
        for(i = 0; i < frase_dividida.length; i++)
        {
            System.out.println(frase_dividida[i]);
        }
    }
    
    //20. Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios
    //    entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se mostrará por
    //    pantalla si N existe en el array, además de cuantas veces.
        public static void ejercicio20()
    {
        System.out.println("20. Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios\n" +
"    //    entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se mostrará por\n" +
"    //    pantalla si N existe en el array, además de cuantas veces.");
        
        //Creamos vector
        int vector[] = new int[1000];
        
        //Introducimos valores aleatorios en el rango [0,99]
        for(int i = 0; i < vector.length; i++)
        {
            vector[i] = (int)(Math.random() * 100);
        }
        
        //Pedimos valor N a buscar en el vector
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca valor entre 0 y 99 a buscar en el vector: ");
        int n = entrada.nextInt();
        
        //Buscamos la posición N en el vector (primero debe estar ordenado)
        Arrays.sort(vector);
        int pos = Arrays.binarySearch(vector, n);
        
        //Si N existe
        if(pos >= 0)
        {
            //Buscamos cuantas veces aparece
            int veces = 0;
            for (int i = pos; i < vector.length; i++)
            {
                if (vector[i] == n)veces++;
                else break;
            }
            System.out.println("Sí existe en el vector. Aparece " + veces + " veces.");
        }
        //Si N no existe
        else{
            System.out.println("No existe en el vector.");
        }
        
        //
    }
    
    //19. Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez
    //    con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores
    //    (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las puntuaciones en orden 
    //    descendente (de la más alta a la más baja).
        public static void ejercicio19()
    {
        System.out.println("19. Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez\n" +
"    //    con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores\n" +
"    //    (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las puntuaciones en orden \n" +
"    //    descendente (de la más alta a la más baja).");
        
        //Creamos por teclado las puntuaciones
        int p[] = new int[8];
        
        //Pedimos por teclado las puntuaciones
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca las 8 puntuaciones: ");
        for(int i = 0; i < p.length; i++)
        {
            p[i] = entrada.nextInt();
        }
        
        //Ordenamos el array (de menor a mayor)
        Arrays.sort(p);
        
        //Mostramos el array de mayor a menor
        System.out.print("Puntuaciones ordenadas de mayor a menor: ");
        for(int i = p.length - 1; i >= 0; i--)
        {
            System.out.print(p[i] + " ");
        }
    }
    
    //18. Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0
    //    y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por pantalla.
        public static void ejercicio18()
    {
        System.out.println("18. Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0\n" +
"    //    y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por pantalla.");
        
        //Creamos el vector
        int vector[] = new int[30];
        
        //Introducimos valores aleatorios en el rango [0,9]
        for(int i = 0; i < vector.length; i++)
        {
            vector[i] = (int) (Math.random() * 10);
        }
        
        //Ordenamos el vector
        Arrays.sort(vector);
        
        //Mostramos el vector
        String vectorStr = Arrays.toString(vector);
        System.out.println(vectorStr);
    }
    
    //17. Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array
    //    y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario si son 
    //    iguales o no.
        public static void ejercicio17()
    {
        System.out.println("Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array\n" +
"    //    y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario si son \n" +
"    //    iguales o no.");
        
        //Creamos los vectores
        int v1[] = new int[10];
        int v2[] = new int[10];
        
        //Pedimos los 20 valores y los guardamos
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < v1.length; i++)
        {
            System.out.print("Introduce valor: ");
            v1[i] = entrada.nextInt();
        }
        for(int i = 0; i < v2.length; i++)
        {
            System.out.print("Introduce valor: ");
            v2[i] = entrada.nextInt();
        }
        
        //Comparamos si son iguales
        if(Arrays.equals(v1, v2))
        {
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
    
    //16. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:
    //    1, 2, 2, 3, 3, 3, 4, 4, 4, 4, etc hasta introducir 10 diez veces, y luego la muestre por pantalla.
    //    En esta ocasion debes utilizar Arrays.fill().
        public static void ejercicio16()
    {
        System.out.println("Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:\n" +
"    //    1, 2, 2, 3, 3, 3, 4, 4, 4, 4, etc hasta introducir 10 diez veces, y luego la muestre por pantalla.\n" +
"    //    En esta ocasion debes utilizar Arrays.fill().");
        
        //Calculamos cuántos números tiene la secuencia
        int cuantos = 0;
        for(int i = 1; i <= 10; i++)
        {
            cuantos += i;
        }
        
        //Creamos el vector
        int valores[] = new int[cuantos];
        
        //Posición donde insertar los números
        int pos = 0;
        
        //Para cada número n del 1 al 10
        for(int n = 1; n <= 10; n++)
        {
            // Introducimos n veces 'n' en la posición 'pos'
            Arrays.fill(valores, pos, pos + n, n);
            
            //Actualizamos pos
            pos += n;
        }
        //Mostramos el array
        String arrayStr = Arrays.toString(valores);
        System.out.println("Array: " + arrayStr);
    }
    
    //15. Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N
    //    que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
        public static void ejercicio15()
    {
        System.out.println("Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N\n" +
        "que contenga M en todas sus posiciones. Luego muestra el array por pantalla.");
        
        //Pedimos tamaño (n) y valor (m)
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = entrada.nextInt();
        System.out.print("Valor a introducir: ");
        int m = entrada.nextInt();
        
        //Creamos el array
        int vector[] = new int[n];
        
        //Insertamos m en todas sus posiciones
        Arrays.fill(vector, m);
        
        //Mostramos el array
        String arrayStr = Arrays.toString(vector);
        System.out.println("Array: " + arrayStr);
    }
    
    //14. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:
    //    1, 2, 2, 3, 3, 3, 4, 4, 4, 4, etc hasta introducir 10 diez veces, y luego la muestre por pantalla
        public static void ejercicio14()
    {
        System.out.print("Este programa crea un array de enteros en donde se van a introducir la ");
        System.out.print("siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, etc hasta introducir");
        System.out.print("10 diez veces y luego se mostrará por pantalla");
        
        //Calculamos cuantos números tiene la secuencia
        int cuantos = 0;
        for(int i = 1; i <= 10; i++)
        {
            cuantos += i;
        }
        
        //creamos el vector
        int valores[] = new int[cuantos];
        
        //Índice para recorrer el vector
        int posicion = 0;
        
        //Para cada número i del 1 al 10
        for(int i = 1; i <= 10; i++)
        {
            //repetimos i veces
            for(int j = 0; j < i; j++)
            {
                //Guardar el valor en 'posición'
                valores[posicion] = i;
                
                //Actualizadmos posición
                posicion++;
            }
        }
        //Mostramos el array
        System.out.print("Array: ");
        for(int i = 0; i < valores.length; i++)
        {
            System.out.print(valores[i] + " ");
        }
    }
    
    //13. Crea un programa que permita al usuario almacenar unasecuencia aritmética en un array y
    //    luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un valor
    //    inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
    //    1, 3, 5, 7, 9... Con V=7 e I=10, la secuencia sería 7, 17, 27, 37... El programa solicitará
    //    al usuario V, I además de N (nº de valores a crear).
        public static void ejercicio13()
    {
        int vini, inc, n;
        int secuencia[];
        
        //pedimos valor inicial, incremento y cuántos números
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor inicial: ");
        vini = entrada.nextInt();
        System.out.print("Incremento: ");
        inc = entrada.nextInt();
        System.out.print("Cuántos números: ");
        n = entrada.nextInt();
        
        //Creamos el vector con la secuencia
        secuencia = new int[n];
        for (int i = 0; i < n; i++)
        {
            secuencia[i] = vini + (i * inc);
        }
        
        //Mostramos la secuencia
        System.out.print("Secuencia: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(secuencia[i] + " ");
        }
    }
    
    //12. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
    //    distintas opciones:
    //    a. Mostrar valores.
    //    b. Introducir valor.
    //    c. Salir.
    //    La opción 'a' mostrará todos los valores por pantalla. La opción 'b' pedirá un valor V 
    //    y una posición P, luego escribirá V en la posición P del array. El menú se repetirá inde
    //    finidamente hasta que el usuario elija la opción 'c' que terminará el programa.
        public static void ejercicio12()
    {
        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[10];
        boolean continuar = true;
        String opcion;
        
        while (continuar)
        {
            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción y presiona intro: ");
            opcion = entrada.nextLine();
            
            switch(opcion)
            {
                case "a":
                    for(int i = 0; i < vector.length; i++)
                    {
                        System.out.print(vector[i] + " ");
                    }
                    System.out.println();
                    break;
                
                case "b":
                    int v, p;
                    System.out.print("Valor: ");
                    v = entrada.nextInt();
                    System.out.println("Posición: ");
                    p = entrada.nextInt();
                    if(p < 0 || p >= vector.length)
                    {
                        System.out.println("Posición fuera de límite");
                    }else{
                        vector[p] = v;
                    }
                    break;
                    
                case "c":
                    System.out.println("Fin del programa");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            entrada.nextLine();
        }
    }
    
    //11. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
    //    primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
    //    del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
        public static void ejercicio11()
    {
        int length = 100;
        int v1[] = new int[length];
        int v2[] = new int[length];
        
        //V1: Valores del 1 al 100
        for(int i = 0; i < length; i++)
        {
            v1[i] = i + 1;
        }
        
        //Copiamos v1 en v2 en orden inverso
        for(int i = 0; i < length; i++)
        {
            v2[i] = v1[length - i - 1];
        }
        
        //Mostramos vector 1
        System.out.print("Vector 1: ");
        for(int i = 0; i < length; i++)
        {
            System.out.print(v1[i] + " ");
        }
        System.out.println();
        
        //Mostramos vector 2
        System.out.print("Vector 2: ");
        for(int i = 0; i < length; i++)
        {
            System.out.print(v2[i] + " ");
        }
    }
    
    //10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
    //    Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. luego
    //    mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y por 
    //    debajo de la media.
        public static void ejercicio10()
    {
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos nº de alturas y creamos vector
        System.out.print("¿Cuantas alturas a introducir?: ");
        int n = entrada.nextInt();
        double alturas[] = new double[n];
        
        //Pedimos alturas al usuario e introducimos en array
        System.out.print("Introduce las alturas de una en una: ");
        for(int i = 0; i < alturas.length; i++)
        {
            alturas[i] = entrada.nextDouble();
        }
        
        //Calculamos media, máximo y mínimo
        double suma = 0, media, max = alturas[0], min = alturas[0];
        for(int i = 0; i < alturas.length; i++)
        {
            suma += alturas[i];
            if(alturas[i] > max) max = alturas[i];
            if(alturas[i] < min) min = alturas[i];
        }
        media = suma / n;
        
        //Calculamos cuantas alturas por encima y por debajo de la media
        int encima = 0, debajo = 0;
        for(int i = 0; i < alturas.length; i++)
        {
            if(alturas[i] > media) encima++;
            if(alturas[i] < media) debajo++;
        }
        
        //Mostramos los datos
        System.out.println("Altura media: " + media);
        System.out.println("Altura máxima: " + max);
        System.out.println("Altura mínima: " + min);
        System.out.println("Alturas por encima de la media: " + encima);
        System.out.println("Alturas por debajo de la media: " + debajo);
    }
    
    //9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros
    //   aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará
    //   en qué posiciones del array aparece N.
        public static void ejercicio9()
    {
        Scanner entrada = new Scanner(System.in);
        
        //Creamos array con 100 números [1, 10]
        int vector[] = new int[100];
        for(int i = 0; i < vector.length; i++)
        {
            vector[i] = (int) (1 + Math.random() * 10);
        }
        
        //Pedimos valor N al usuario
        System.out.print("Introduce valor N a buscar: ");
        double n = entrada.nextInt();
        
        //Mostramos las posiciones en las que aparece N
        System.out.print("Posiciones donde aparece N:");
        for (int i = 0; i < vector.length; i++)
        {
            if(vector[i] == n)
            {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
    
    //8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
    //   utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
    //   cuántos valores del array son igual o superiores a R.
        public static void ejercicio8()
    {
        Scanner entrada = new Scanner(System.in);
        
        //Creamos array con 100 números [0.0, 1.0]
        double vector[] = new double[100];
        for(int i = 0; i < vector.length; i++)
        {
            vector[i] = Math.random();
        }
        //Pedimos valor R al usuario
        System.out.print("Introduce un número real de 0.0 a 1.0: ");
        double r = entrada.nextDouble();
        
        //Calculamos cuantos números son mayores o iguales a R
        int cuantos = 0;
        for(int i = 0; i < vector.length; i++)
        {
            if(vector[i] >= r)
            {
                cuantos++;
            }
        }
        System.out.println("Cantidad de números mayores o iguales: " + cuantos);
    }
    
    //7. Crea un programa que pida dos valores P y Q, luego cree un array que contenga todos
    //   los valores desde P hasta Q, y lo muestre por pantalla.
        public static void ejercicio7()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Valor inicial P: ");
        int p = entrada.nextInt();
        System.out.print("Valor final Q: ");
        int q = entrada.nextInt();
        
        //Creamos el array de tamaño (Q - P + 1)
        int vector[] = new int[q - p + 1];
        
        //En cada posición (i) insertamos (P + i)
        for(int i = 0; i < vector.length; i++)
        {
            vector[i] = p + i;
        }
        
        //Mostramos el array
        System.out.println("Array: ");
        for(int i = 0; i < vector.length; i++)
        {
            System.out.println(vector[i] + " ");
        }
    }
    
    //6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
    //   escriba M en todas sus posiciones y lo muestre por pantalla.
    public static void ejercicio6()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Tamaño del vector: ");
        int n = entrada.nextInt();
        System.out.print("Valor a introducir: ");
        int m = entrada.nextInt();
        
        //Creamos el array e inserta m en todas sus posiciones
        int vector[] = new int[n];
        for(int i = 0; i < vector.length; i++)
        {
            vector[i] = m;
        }
        //Mostramos el array
        System.out.print("Array: ");
        for(int i = 0; i < vector.length; i++)
        {
            System.out.print(vector[i] + " ");
        }
    }
    
    //5. Crea un programa que pida veinte números reales por teclado, los almacene en un
    //   array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
    public static void ejercicio5()
    {
        double valores[] = new double[10];
        Scanner entrada = new Scanner(System.in);
        
        // Introducimos todos los valores en el array
        for (int i = 0; i < valores.length; i++)
        {
            System.out.print("Introduce valor " + i + ": ");
            valores[i] = entrada.nextDouble();
        }
        // Recorremos el array para calcular la suma
        double suma = 0;
        for (int i = 0; i < valores.length; i++)
        {
            suma += valores[i];
        }
        //Calculamos y mostramos la media
        double media = suma / valores.length;
        System.out.println("Media: " + media);
    }
    
    //4. Crea un programa que pida veinte números por teclado, los almacene en un array y
    //   luego muestre por separado la suma de todos los valores positivos y negativos.
    public static void ejercicio4()
    {
        int pos = 0, neg = 0;
        int valores[] = new int[20];
        Scanner entrada = new Scanner(System.in);
        
        //Introducimos todos los valores en el array
        for(int i = 0; i < valores.length; i++)
        {
            System.out.print("Introduce valor " + i + ": ");
            valores[i] = entrada.nextInt();
        }
        //Sumamos positivos y negativos por separado
        for(int i = 0; i < valores.length; i++)
        {
            if(valores[i] > 0)
            {
                pos += valores[i];
            }else{
                neg += valores[i];
            }
        }
        System.out.println("Suma de positivos: " + pos);
        System.out.println("Suma de negativos: " + neg);
    }
    
    //3. Crea un programa que pida diez números reales por teclado, los almacene en un array, y
    //   luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
    public static void ejercicio3()
    {
        double valores[] = new double[10];
        Scanner entrada = new Scanner(System.in);
        
        //Introducimos todos los valores en el array
        for(int i = 0; i < valores.length; i++)
        {
            System.out.println("Introduce valor " + i + ": ");
            valores[i] = entrada.nextDouble();
        }
        // Averiguamos máximo y mínimo
        double max = valores[0], min = valores[0];
        for(int i = 1; i < valores.length; i++)
        {
            if(valores[i] > max)
            {
                max = valores[i];
            }else if(valores[i] < min){
                min = valores[i];
                
            }
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
        }
    }
    
    //2. Crea un programa que pida 10 números reales por teclado, los almacene en un array, y 
    //   luego muestre la suma de todos los valores
    public static void ejercicio2()
    {
        double valores[] = new double[10];
        Scanner entrada = new Scanner(System.in);
        
        //Introducimos todos los valores en el array
        for(int i = 0; i < valores.length; i++)
        {
            System.out.print("Introduce valor " + i + ": ");
            valores[i] = entrada.nextDouble();
        }
        
        //Recorremos el array para calcular la suma
        double suma = 0;
        for(int i = 0; i < valores.length; i++)
        {
            suma += valores[i];
        }
        System.out.println("Suma total: " + suma);
    }
    
    //1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y
    // luego muestre todos sus valores
    public static void ejercicio1()
    {
        double valores[] = new double[10];
        Scanner entrada = new Scanner(System.in);
        
        //Introducimos todos los valores en el array
        for(int i = 0; i < valores.length; i++)
        {
            System.out.print("Introduce valor " + i + ": ");
            valores[i] = entrada.nextDouble();
        }
        
        //Mostramos todos los valores del array
        for(int i = 0; i < valores.length; i++)
        {
            System.out.println("Valor " + i + ": " + valores[i]);
        }
    }
}
