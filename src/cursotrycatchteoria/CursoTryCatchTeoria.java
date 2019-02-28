/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursotrycatchteoria;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class CursoTryCatchTeoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       /* Sem exceção 1
            String[] vect = sc.nextLine().split(" "); //vai armazenar cada string entre os espaços Ex.: maria jose => vect[0] = maria e vect[1] = jose
            int position = sc.nextInt();
            System.out.println(vect[position]); 
            "Se utilizarmos só o código acima inserirmos Juliano José maria e depois o índice 5 ou letra vai dar exceção que precisamos tratar
        */
        try {
            String[] vect = sc.nextLine().split(" "); //vai armazenar cada string entre os espaços Ex.: maria jose => vect[0] = maria e vect[1] = jose
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) { //caso seja digitado uma posição inexistente do array vai gerar essa msg
            System.out.println("Invalid position!"); 
        } catch (InputMismatchException e) { //caso digite um tipo diferente do definido
            System.out.println("Input Error!");
        } 
        System.out.println("End! Program :)" );
        sc.close();
    }
    
}
