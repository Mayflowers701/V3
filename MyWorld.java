import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(10, 10, 60); 
        setBackground("sand.jpg");
        
        Vacuum newVac = new Vacuum();
        addObject(newVac, 0, 0);
        
        filth();
    }
    
    public void filth(){
        
        
        // Spread a bunch of dirt everywhere
        for(int i = 0; i < 10; i++){
            for(int j = 0; j <10; j++){
                
                // random num
                int randInt = Greenfoot.getRandomNumber(5);
                
                // add dirt
                if(randInt == 0){
                    Dirt newDirt = new Dirt();
                    addObject(newDirt, i, j);  
                }
                
                
            }            
        }
        
    }
}

