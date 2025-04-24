package com.skills.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

    public void evenOrOdd(){

        String message = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("\n Ingrese un número");
        int number = scn.nextInt();

        if(number % 2 == 0){
            message = """
                    El número %d es par.
                    """.formatted(number);
        }else{
            message = """
                    El número %d es impar.
                    """.formatted(number);
        }

        System.out.println(message);
    }

    public void approvalCourse(){
        Scanner scn = new Scanner(System.in);
        String message = "";
        double average = 0.0;
        double accumulator = 0.0;
        double grade = 0.0;

        message = """

                Notas del estudiante""";
        System.out.println(message);

        for(int i = 1; i <= 3; i++) {
            System.out.println("Ingrese nota " + i + ":");
            grade = scn.nextDouble();
            accumulator += grade;
            grade = 0.0;
        }

        average = accumulator / 3;
        message = "";

        if(average >= 7.0){
            message = """
                    El estudiante tuvo un promedio de %.1f y fue aprobado.
                    """.formatted(average);
        }else if (average >= 5.0 && average < 6.9){
            message = """
                    El estudiante tuvo un promedio de %.1f y está en recuperación.
                    """.formatted(average);
        }else if(average < 5.0){
            message = """
                    El estudiante tuvo un promedio de %.1f y fue reprobado.
                    """.formatted(average);
        }

        System.out.println(message);
    }

    public void validatePassword(){
        Scanner scn = new Scanner(System.in);
        String password = "";
        String message = "";
        String defaultPassword = "123456";

        System.out.print("\n Ingrese la contraseña: ");
        password =  scn.next();

        if(password.equals(defaultPassword)){
            message = "¡Acceso Permitido!";
        }else{
            message = "¡Acceso Denegado!";
        }

        System.out.println(message);
    }

    public void compareNumbers(){
        Scanner scn = new Scanner(System.in);
        String message = "";
        int n1 = 0, n2 = 0;

        System.out.println("\n Comparar dos números");

        System.out.print("Ingrese el primer número: ");
        n1 = scn.nextInt();
        System.out.print("Ingrese el segundo número: ");
        n2 = scn.nextInt();

        if(n1 > n2)
        {
            message = """
                    El número mayor es %d
                    """.formatted(n1);
        } else if (n1 < n2)
        {
            message = """
                    El número mayor es %d
                    """.formatted(n2);
        }else
        {
            message = """
                    Los números son iguales
                    """;
        }

        System.out.println(message);
    }

    public void verifyDiscountSale(){
        Scanner scn = new Scanner(System.in);
        String message = "";
        double saleValue = 0.00;

        System.out.println("\n Verificacion de dscto en compras");
        System.out.print("Ingrese el valor de la compra: ");
        saleValue = scn.nextDouble();

        if(saleValue >= 100.00){
            saleValue = saleValue * 0.9;
            message = """
                    Descuento del 10%% aplicado
                    Nuevo valor: %.1f
                    """.formatted(saleValue);
        }else{
            message = """
                    Descuento no aplicado
                    Valor total: %.1f
                    """.formatted(saleValue);
        }

        System.out.println(message);
    }

    public void verifyBusinessDay(){
        Scanner scn = new Scanner(System.in);
        String message = "";
        String  day= "";
        final String[] businessDay = {"lunes", "martes", "miércoles", "jueves", "viernes"};

        System.out.print("\n Ingrese el día de la semana (en minúsculas): ");
        day = scn.nextLine();

        if(Arrays.asList(businessDay).contains(day.toLowerCase()))
        {
            message = """
                    %s es un día hábil
                    """.formatted(
                    day.substring(0,1).toUpperCase() +
                            day.substring(1).toLowerCase()
                        );
        }else
        {
            message = """
                    %s NO es un día hábil
                    """.formatted(
                    day.substring(0,1).toUpperCase() +
                            day.substring(1).toLowerCase()
                    );
        }

        System.out.println(message);
    }

    public void verifyAllowedRangeValuesAmount(){
        Scanner scn = new Scanner(System.in);
        String message = "";
        double amountValue = 0.00;

        System.out.print("\n Ingrese valor del préstamo: ");
        amountValue = scn.nextDouble();

        if(amountValue >= 1000 && amountValue <= 5000){
            message = """
                    El valor %.2f está dentro del intervalo permitido para el préstamo.
                    """.formatted(amountValue);
        }else{
            message = """
                    El valor %.2f NO está dentro del intervalo permitido para el préstamo.
                    """.formatted(amountValue);
        }

        System.out.println(message);
    }

    public void verifyTriangle(){
        Scanner scn = new Scanner(System.in);
        String message = "";
        int firstSide = 0, secondSide = 0, thirdSide = 0;

        System.out.print("\n Ingrese el primer lado: ");
        firstSide = scn.nextInt();
        System.out.print("Ingrese el segundo lado: ");
        secondSide = scn.nextInt();
        System.out.print("Ingrese el tercer lado: ");
        thirdSide = scn.nextInt();

        if(firstSide + secondSide > thirdSide &&
                firstSide + thirdSide > secondSide &&
                secondSide + thirdSide > firstSide)
        {
            message = "Los lados pueden formar un triángulo";
        }else
        {
            message = "Los lados NO pueden formar un triángulo";
        }

        System.out.println("\n" + message);
    }

    public void verifyCompatibilityDonateBlood(){
        Scanner scn = new Scanner(System.in);
        String message = "";
        int age = 0;
        double weight = 0.00;
        boolean isAgeValidate , isWeightValidate ;

        System.out.print("\nIngrese la edad del donante: ");
        age = scn.nextInt();
        System.out.print("Ingrese el peso del donante(en kg): ");
        weight = scn.nextDouble();

        isAgeValidate = age >= 18 && age <=65;
        isWeightValidate = weight >= 50;

        if(isAgeValidate && isWeightValidate)
            message = "\nEl donante es compatible";
        else
            message = "\nEl donante no es compatible";

        if(!isAgeValidate)
            message += "\nMotivo: Debe tener entre 18 y 65 años.";

        if(!isWeightValidate)
            message += "\nMotivo: Debe pesar más de 50 kg";

        System.out.println(message);
    }

    public void verifyAccessCodeAndPermissionLevel() {
        Scanner scn = new Scanner(System.in);
        String message = "";
        final int accessCode = 2023;
        final Integer[] permissionLevel = {1, 2, 3};
        int code = 0, level = 0;
        boolean isCorrectCode, isPermissionAccepted;

        System.out.print("\nIngrese el código de acceso: ");
        code = scn.nextInt();
        System.out.print("Ingrese el nivel de permiso: ");
        level = scn.nextInt();

        isCorrectCode = code == accessCode;
        isPermissionAccepted = Arrays.asList(permissionLevel).contains(level);

        if(isCorrectCode && isPermissionAccepted)
            message = "\nAcceso permitido. ¡Bienvenido al sistema!";
        else
            message = "\nAcceso Denegado.";


        if(!isCorrectCode)
            message += "\nMotivo: Codigo de acceso incorrecto";

        if(!isPermissionAccepted)
            message += "\nMotivo: Nivel de permiso inválido";

        System.out.println(message);
    }
}
