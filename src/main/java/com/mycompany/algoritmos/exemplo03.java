/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 *
 * @author tayara.5970
 */
public class exemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome, senha;
        
        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe sua senha: ");
        senha = scanner.nextLine();
        
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua senha é: " + senha);
        
        if(nome.equals("Tayara Fernanda")){
        System.out.println("Usuario autorizado!");
        }else{
        System.out.println("Usuario NAO autorizado!");
        if(nome.equals("12345")){
        System.out.println("USUARIO AUTORIZADO!");
        }else{
        System.out.println("ERROOR! USUARIO NAO AUTORIZADO!");
        }
        }
        }
    }

