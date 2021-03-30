/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudante;



/**
 *
 * @author Lisley
 */
public class Escolinha {
    public static void main(String[] args) {
       Escola e4 = new Escola();
        
       e4.ra= 42145320;
       e4.nome = "Larissa";
       e4.matriculaTrancada = false;
       e4.frequencia = 1.25;
       e4.nota = 'C';
       
       
        System.out.println("\n\n\n\t------Ficha do aluno----\n");
        e4.apresentarEstudante();
        
        System.out.println("\n\n\n\t---- Chamada-----\n");
    
}}
