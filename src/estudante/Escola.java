/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudante;

/**
 *
 * @author lisley
 */
public class Escola {
    int ra; 
   String nome;
   char nota;
   double frequencia;
   boolean matriculaTrancada;
    
   
   // métedos 
   public void apresentarEstudante(){
       
       System.out.println("Nome do Aluno: " + nome);
       System.out.println("R.A do aluno: " + ra);
       System.out.println("Nota do Aulo: " + nota);
       System.out.println("Frequencia do aluno: " + frequencia);
       System.out.println("O aluno está com a matricula trancada: " + matriculaTrancada); 
      
 }
   
  public void responderChamada(){
      
    
  }
   
   
   
}