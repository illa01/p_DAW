
package tema_4;
import java.util.Scanner;

public class Tema_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
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
        ejercicio16();
    }
//16. Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en calificación alfabética, 
//    escribiendo el resultado. 
//    • de 0 a <3 Muy Deficiente. 
//    • de 3 a <5 Insuficiente. 
//    • de 5 a <6 Bien. 
//    • de 6 a <9 Notable 
//    • de 9 a 10 Sobresaliente

    public static void ejercicio16(){
        
        Scanner teclado = new Scanner(System.in);
        double nota;
        System.out.println("Este programa transforma una nota en texto por tramos");
        System.out.println("Por favor, inserta un nota numérica");
        nota = teclado.nextDouble();
        if (nota<3){
            System.out.println("Muy deficiente");
        }else if(nota<5){
            System.out.println("Insuficiente");
        }else if(nota<6){
            System.out.println("Suficiente");
        }else if(nota<7){
            System.out.println("Bien");
        }else if(nota<9){
            System.out.println("Notable");
        }else{
            System.out.println("Sobresaliente");
        }
    }
    
//15. Escribe un programa que lea tres números distintos y nos diga cuál es el mayor
public static void ejercicio15(){
    Scanner teclado = new Scanner(System.in);
    double num1, num2, num3;
    System.out.println("Este programa compara tres números distintos y nos dice cual es mayor");
    System.out.println("Por favor, introduce el primer número");
    num1 = teclado.nextDouble();
    System.out.println("Por favor, introduce el segundo número, distinto al primero");
    num2 = teclado.nextDouble();
    System.out.println("Por favor, introduce el tercer número, distinto a los dos anteriores");
    num3 = teclado.nextDouble();
    if(num1>num2)
    {
        if(num1>num3){
            System.out.println(num1 + " es el mayor");
        }else{
            System.out.println(num3 + " es el mayor");
        }
    }else{
        if(num2>num3){
            System.out.println(num2 + " es el mayor");
        }else{
            System.out.println(num3 + " es el mayor");
        }
    }
}
//14. Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
public static void ejercicio14(){
    Scanner teclado = new Scanner(System.in);
    double num1;
    double num2;
    System.out.println("Este programa compara dos números y dice cuál es mayor o si son iguales");
    System.out.println("Por favor, teclea el primer número");
    num1 = teclado.nextDouble();
    System.out.println("Por favor, teclea el segundo número");
    num2 = teclado.nextDouble();
    if(num1 == num2){
        System.out.println("Son iguales");
    }else{
        if(num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        }else{
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}


//13. Escribe un programa que lee dos números y los visualiza en orden ascendente.
    public static void ejercicio13(){
        Scanner teclado = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Este programa pide dos números y los ordena de forma ascendente");
        System.out.println("Por favor, teclea el primer número");
        num1 = teclado.nextDouble();
        System.out.println("Por favor, teclea el segundo número");
        num2 = teclado.nextDouble();
        if(num1 > num2)
        {
            System.out.println(num2 + " ; " + num1);
        }else{
            if(num2 > num1)
            {
                System.out.println(num1 + " ; " + num2);
            }else{
                System.out.println("Son iguales");
            }
        }
    }

//12. Escribe un programa que lee un número y me dice si es positivo o negativo, consideraremos el cero como positivo.
    public static void ejercicio12(){
        
        Scanner teclado = new Scanner(System.in);
        double num;
        System.out.println("Este programa dice si el número tecleado es positivo o negativo");
        System.out.println("Por favor, teclea un número");
        num = teclado.nextDouble();
        if(num>=0)
        {
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es negativo");
        }
    }
    
    //11. Escribe un programa que lee 2 números y muestra el mayor.
    public static void ejercicio11()
    {
        Scanner teclado = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Compararé los dos números que teclees y mostraré el mayor");
        System.out.println("Escribe el primer número");
        num1 = teclado.nextDouble();
        System.out.println("Escribe el segundo número");
        num2 = teclado.nextDouble();
        if(num1>num2)
        {
            System.out.println(num1 + " es el número mayor");
        }else{
            if(num2>num1)
            {
                System.out.println(num2 + " es el número mayor");
            }else{
                System.out.println("Son iguales");
            }
        }
    }
    
    //10. Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta, producto y división. 
    //(Ten en cuenta la división por cero).
    public static void ejercicio10()
    {
    Scanner teclado10 = new Scanner(System.in);
    double num1;
    double num2;
    double suma;
    double resta;
    double division;
    double producto;
    System.out.println("Por favor, introduzca el primer número");
    num1 = teclado10.nextDouble();
    System.out.println("Por favor, introduzca el segundo número");
    num2 = teclado10.nextDouble();
    suma = num1 + num2;
    resta = num1 - num2;
    producto = num1 * num2;
    System.out.println("La suma de " + num1 + " más " + num2 + " vale " + suma);
    System.out.println("La resta de " + num1 + " menos " + num2 + " vale " + resta);
    System.out.println("El producto de " + num1 + " por " + num2 + " vale " + producto);
    if(num2 == 0)
    {
        System.out.println("Error al dividir por cero");
    }else{
        division = num1 / num2;
        System.out.println("La división de " + num1 + " y " + num2 + " es " + division);
    }
    
    }
    //9. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”.
    public static void ejercicio9()
    {
        double edad9;
        Scanner teclado9 = new Scanner(System.in);
        System.out.println("Por favor, teclea tu edad");
        edad9 = teclado9.nextDouble();
        if(edad9>=18)
        {
            System.out.println("Eres mayor de edad.");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
    
    //8. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de edad” solo si lo somos.
    public static void ejercicio8()
    {
        double edad;
        Scanner teclado8 = new Scanner(System.in);
        System.out.println("Teclea tu edad");
        edad = teclado8.nextDouble();
        if(edad>=18)
        {
            System.out.print("Eres mayor de edad");
        }
    }
    
    //7. Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. 
    //   Sabiendo que una milla marina equivale a 1.852 metros.
    public static void ejercicio7()
    {
        Scanner teclado7 = new Scanner(System.in);
        double millas;
        double metros;
        final double equivalencia = 1852;
        System.out.println("Teclee una distancia en millas");
        millas = teclado7.nextDouble();
        metros = (millas * 1852);
        System.out.println(millas + " millas marinas equivalen a " + metros + " metros");
        
    }
    
    //6. Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado.
    public static void ejercicio6()
    {
        Scanner teclado6 = new Scanner(System.in);
        double precioArticulo;
        double precioVenta;
        System.out.println("Por favor, teclee el precio del artículo");
        precioArticulo = teclado6.nextDouble();
        System.out.println("Por favor, teclee el precio de venta");
        precioVenta = teclado6.nextDouble();
        double descuento = (precioVenta * 100)/precioArticulo ;
        System.out.println("El precio del artículo es " + precioArticulo + "€");
        System.out.println("El precio de venta es " + precioVenta + "€");
        System.out.println("El descuento realizado es " + descuento + "%");
        
    }
    
    //5. Escribe un programa que toma como dato de entrada un número que corresponde a la longitud de un radio 
    //y nos escribe la longitud de la circunferencia, el área del círculo y el volumen de la esfera que corresponden con dicho radio.
    public static void ejercicio5()
    {
        Scanner teclado5 = new Scanner(System.in);
        double radio5;
        System.out.println("Por favor, teclea el valor del radio");
        radio5 = teclado5.nextDouble();
        double circunferencia5 = 2 * Math.PI * radio5;
        double areaCirculo5 = Math.PI * Math.pow(radio5, 2);
        double volumenEsfera5 = (4/3) * (Math.PI * Math.pow(radio5, 3));
        System.out.println("La circunferencia de radio " + radio5 + " mide " + circunferencia5);
        System.out.println("El area del círculo de radio " + radio5 + " es " + areaCirculo5);
        System.out.println("El volumen de la esfera de radio " + radio5 + " es " + volumenEsfera5);
    }
    
    
    
    /*4. Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y división.*/
    public static void ejercicio4()
    {
        Scanner teclado4 = new Scanner(System.in);
        System.out.println("Por favor, teclea un número");
        double num41 = teclado4.nextFloat();
        System.out.println("Por favor, teclea otro número");
        double num42 = teclado4.nextFloat();
        double suma4 = num41 + num42;
        double resta4 = num41 - num42;
        double producto4 = num41 * num42;
        double division4 = num41 / num42;
        System.out.println("La suma de " + num41 + " y " + num42 + " es " + suma4);
        System.out.println("la resta de " + num41 + " menos " + num42 + " es " + resta4);
        System.out.println("el producto de " + num41 + " por " + num42 + " es " + producto4);
        System.out.println("La división de " + num41 + " entre " + num42 + " es " + division4);
    }
    
    
    /*3. Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.*/
    public static void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, teclea el lado del cuadrado");
        double lado1 = teclado.nextDouble();
        double area1 = Math.pow(lado1,2);
        System.out.println("Dado un lado de valor " + lado1 + " el area del cuadrado es  " + area1);
    }
    
   
    /*2. Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.*/
    public static void ejercicio2()
    {
        final double lado = 5;
        double area = Math.pow(5,2);
        System.out.println("El area de un cuadrado de lado 5 es: " + area);
    }
}
