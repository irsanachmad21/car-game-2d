import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class koin extends pendukung
{
    int speed = 3;
    public void act() 
    {
        koin a = new koin();
        Actor i = getOneIntersectingObject(koin.class);
        move(speed);
        checkDouble(i);
        end();
    }    
}
