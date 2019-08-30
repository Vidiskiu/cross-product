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
public class Vectors{
    private int i;
    private int j;
    private int k;
    
    public Vectors()
    {
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }
    
    public Vectors(int i, int j)
    {
        this.i = i;
        this.j = j;
        this.k = 0;
    }
    
    public Vectors(int i, int j, int k)
    {
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public Vectors cross(Vectors v)
    {
        int i,j,k;
        
        i=(this.j*v.getK()-this.k*v.getJ());
        j=((-1)*(this.i*v.getK()-this.k*v.getI()));
        k=(this.i*v.getJ()-this.j*v.getI());
        
        Vectors vect = new Vectors(i,j,k);
        
        return vect;
    }
    
    public void getComponents()
    {
        System.out.println("("+getI()+","+getJ()+","+getK()+")");
    }
    
    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }
}
