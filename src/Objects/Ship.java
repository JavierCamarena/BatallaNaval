/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author xaovs
 */
public class Ship implements Objeto{

    private int size ;
    private int[][]body;
    
    public Ship(int size,int[][]coord){
        this.size = size;
        this.body = coord;
    }
    
    @Override
    public void paint() {
        System.out.println("Pintando Ship");
        for (int i = 0; i < size; i++) {
            System.out.printf("x[%d]y[%d]\n",body[0][i],body[1][i]);
        }
    }
    
    
    
}
