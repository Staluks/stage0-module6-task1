package com.epam.mjc.stage0;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal{
    public String color = "brown";
    public int numberOfPaws = 4;
    public boolean hasFur = true;
    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }
    public Dog(){
        this.color = "brown";
        this.numberOfPaws = 4;
        this.hasFur = true;
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
        return "This animal is mostly "+ color+". It has "+ numberOfPaws + " "+paws+" and "+ fur +" fur.";
    }



}
