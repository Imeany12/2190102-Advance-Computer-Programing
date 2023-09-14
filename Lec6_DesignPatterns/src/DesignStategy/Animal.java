package DesignStategy;
public class Animal {
    private SoundStrategy soundStrategy;
    private String name;

    public void setSoundStrategy(SoundStrategy soundStrategy) {
        this.soundStrategy = soundStrategy;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){
        if(soundStrategy != null){
            soundStrategy.makeSound();
    }
    }
}

class Dog extends Animal{
        public Dog(){
            setSoundStrategy(new BarkSoundStrategy());
        }
    }

class Cat extends Animal{
    public Cat(){
        setSoundStrategy(new MeowStrategy());
    }
}

class Fish extends Animal{
    public Fish(){
        setSoundStrategy(new NoSoundStrategy());
    }
}

class Snake extends Animal{
    public Snake(){
        setSoundStrategy(new NoSoundStrategy());
    }
}
