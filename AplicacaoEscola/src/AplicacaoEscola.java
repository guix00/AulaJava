/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class AplicacaoEscola {

    
    public static void main(String[] args) {
        Pessoa p1 = new Professor ("Porra Jamelão");
        Professor p2 = new Professor ("Zé");
        
        System.out.println(p1.getNome());
        

         p2.darAula();
        
    }
    
}

