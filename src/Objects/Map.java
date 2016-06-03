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
public class Map implements Objeto{
    private final int SIZE      = 10;
    public final int WATER      = 1;
    public final int SHIP       = 2;
    public final int XPLOTION   = 3;
    
    private int [][] world;
    
    public Map(){
        initWorld();
    }
    
    public void initWorld(){
        world = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                world[i][j] = WATER; 
            }
        }
        
    }

    @Override
    public void paint() {
        System.out.println("Pintando Mapa");
    }
    
}
