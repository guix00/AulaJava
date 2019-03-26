/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
import java.sql.*;
public class AlunoDAO {
   private Connection conn;
   
   public AlunoDAO() {
   
   }
   
   AlunoDAO (Connection c) 
   {
       this.conn = c;
   }
   
   
   public void inserir (String nome) throws SQLException
   {
       try{
       String SQL = "insert into aluno(nome) values ('"+nome+"')";
       java.sql.PreparedStatement UL = conn.prepareStatement(SQL);
       UL.executeUpdate();
       System.out.println("Tudo bem");
       }catch(Exception ex){System.out.println(ex);}
   }
   
   
   }
   

