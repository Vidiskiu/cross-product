/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cross.product;

/**
 *
 * @author Vidiskiu
 */
import java.util.*;
        
public class CrossProductImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Vectors v1 = new Vectors();
        Vectors v2 = new Vectors();
        int i1,j1,k1,i2,j2,k2;
        
        System.out.println("# of dimensions");
        int dimensions = scn.nextInt();
            
        if(dimensions==2)
        {
            System.out.println("Vector 1");
            i1 = scn.nextInt();
            j1 = scn.nextInt();
            System.out.println("Vector 2");
            i2 = scn.nextInt();
            j2 = scn.nextInt();
            v1 = new Vectors(i1,j1);
            v2 = new Vectors(i2,j2);
        }
        else if(dimensions==3)
        {
            System.out.println("Vector 1");
            i1 = scn.nextInt();
            j1 = scn.nextInt();
            k1 = scn.nextInt();
            System.out.println("Vector 2");
            i2 = scn.nextInt();
            j2 = scn.nextInt();
            k2 = scn.nextInt();
            v1 = new Vectors(i1,j1,k1);
            v2 = new Vectors(i2,j2,k2);
        }
        
        System.out.print("\nCross Product Result: ");
        
        Vectors vresult = v1.cross(v2);
        
        vresult.getComponents();
    }
    
}
