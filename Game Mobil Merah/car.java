import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class car extends Actor
{
    GreenfootSound sound = new GreenfootSound("Backsound.mp3");
    int score = 0;   
    
    public void act() {
        getWorld().showText("Score : " + score, 70, 30);
        checkKey();
        music();
        end();
        addScore();
    } 
    
    public void checkKey () {
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("right")) {
            setLocation(getX()+4, getY());
        }
    }
    
    public void music (){
        if (!isTouching(ambulan.class)){
            sound.play();
        } else {
            sound.pause();
        }
    }
    
    public void end () {
        if(isTouching(ambulan.class)){
            getWorld().showText("Game Over \n Score : " + score, 300, 40);
            Greenfoot.stop();
            Greenfoot.playSound("GameOver.mp3");
        }
    }
    
    public void addScore () {
        if(isTouching(koin.class)){
            score = score + 10;
            removeTouching(koin.class);
            Greenfoot.playSound("Coin.mp3");
        }
    }
}
