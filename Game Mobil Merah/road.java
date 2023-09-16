    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    public class road extends World
    {
        
    public road()
    {
        super(400, 600, 1); 
        prepare();
        
    }
    
    public void prepare() {
        car myCar = new car();
        addObject(myCar,159,545);
    }
    
    public void act () {
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new ambulan(), Greenfoot.getRandomNumber(400) + 30,0);
        }
        
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new koin(), Greenfoot.getRandomNumber(400) + 30,0);
        }
    }
}
