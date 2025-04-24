package com.skills.test;

import com.skills.practice.Exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercise exec = new Exercise();
        Scanner scanner = new Scanner(System.in);

        String option = "";
        String panelOptions = """
                
                PANEL DE OPCIONES
                ___________________________________________________________
                  01 .- Verificar número par o impar
                  02 .- Verificar aprobación de asignatura
                  03 .- Validación de contraseña
                  04 .- Comparar dos números
                  05 .- Verificación de dscto en compras
                  06 .- Verificación de día hábil
                  07 .- Verificación si un número esta en un intervalo
                  08 .- Verificación de triángulo
                  09 .- Verificación de compatibilidad para donar sangre
                  10 .- Verificación de código de acceso y nivel de permiso
                  00 .- Salir
                ___________________________________________________________""";
        while(!option.equals("00")){
            System.out.println(panelOptions);
            option = scanner.nextLine();

            switch (option){
                case "01":
                    exec.evenOrOdd();
                    break;
                case "02":
                    exec.approvalCourse();
                    break;
                case "03":
                    exec.validatePassword();
                    break;
                case "04":
                    exec.compareNumbers();
                    break;
                case "05":
                    exec.verifyDiscountSale();
                    break;
                case "06":
                    exec.verifyBusinessDay();
                    break;
                case "07":
                    exec.verifyAllowedRangeValuesAmount();
                    break;
                case "08":
                    exec.verifyTriangle();
                    break;
                case "09":
                    exec.verifyCompatibilityDonateBlood();
                    break;
                case "10":
                    exec.verifyAccessCodeAndPermissionLevel();
                    break;
            }
        }
    }
}
