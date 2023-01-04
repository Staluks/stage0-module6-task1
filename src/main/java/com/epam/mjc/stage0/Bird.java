package com.epam.mjc.stage0;

public class Bird extends Animal{
    public String color;
    public int numberOfPaws;
    public boolean hasFur;

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }
    public Bird(){
        this.color = "blue";
        this.numberOfPaws = 2;
        this.hasFur = false;
    }

    @Override
    public String getDescription() {
        String fur = null;
        String paws = null;
        if(numberOfPaws ==1){
            paws = "paw";
        }else{
            paws = "paws";
        }
        if(hasFur){
            fur = "a";
        }else{
            fur = "no";
        }
        return "This animal is mostly "+ color+". It has "+ numberOfPaws + " "+paws+" and "+ fur +" fur. " +
                "Moreover, it has 2 wings and can fly.";
    }
}
