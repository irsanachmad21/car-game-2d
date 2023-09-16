import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ambulan extends pendukung
{
    int speed = 3;
    public void act() {
        ambulan a = new ambulan();
        Actor i = getOneIntersectingObject(ambulan.class);
        move(speed);
        checkDouble(i);
        end();
    }    
}
