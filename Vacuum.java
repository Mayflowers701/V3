import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vacuum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vacuum extends Actor
{
    /**
     * Act - do whatever the Vacuum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static final int EAST = 0;
    private static final int NORTH = 1;
    private static final int WEST = 2;
    private static final int SOUTH = 3;
    
    private int direction = EAST;
    
    int[][] map = new int[10][10];
    
    public void act()
    {
        // Check current space for dirt
            //if there is dirt, clean it
        
        // Check surroundings 
            //mark all clean spaces as observed
            //mark all dirty spaces as dirty
            
        // Move
            //if there is a dirty space in surroundings, move there
            //if there are only clean spaces in surroundings, keep moving forward
            //if there is a wall in the way, make a U-turn
        
    }
    
    
    
    public void move(){
        // move forward one grid space
        switch(direction) {
            case SOUTH :
                setLocation(getX(), getY() + 1);
                break;
            case EAST :
                setLocation(getX() + 1, getY());
                break;
            case NORTH :
                setLocation(getX(), getY() - 1);
                break;
            case WEST :
                setLocation(getX() - 1, getY());
                break;
        }
        
    }
}
