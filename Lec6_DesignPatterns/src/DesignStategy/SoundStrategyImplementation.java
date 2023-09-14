package DesignStategy;
class BarkSoundStrategy implements SoundStrategy{
    public void makeSound(){
        System.out.println("Woof!");
    }
    
}

class MeowStrategy implements SoundStrategy{
    public void makeSound(){
        System.out.println("Meow!");
    }
    
}

class NoSoundStrategy implements SoundStrategy{
    public void makeSound(){
        System.out.println("I have no sound");
    }
    
}
