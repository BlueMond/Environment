package me.bluemond.environment.Organisms;

import me.bluemond.environment.EnvironmentalOrganism;




public abstract class OrganismBase implements EnvironmentalOrganism {


    //ranges from 0 to 1 (0-100% health condition)
    private double health;
    //ranges from 0 to 1 (0-100% fed)
    private double fed;
    //age of organism (in steps)
    private int age;
    //movement speed of organism (arbitrary double precision unit)
    private double speed;
    //species classification (mandatory)
    private final String species;




    //constructors

    public OrganismBase(double health, double fed, double speed, String species){
        this.health = health;
        this.fed = fed;
        this.speed = speed;
        this.species = species;
        age = 0;
    }


    public OrganismBase(String species){
        this(1, 0.5, 1, species);

    }

    //END constructors






    @Override
    public void performTimeStep() {
        age++;
    }






    //getters and setters


    public void setHealth(double health) {
        this.health = health;
    }

    public void setFed(double fed) {
        this.fed = fed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }



    public double getHealth() {
        return health;
    }

    public double getFed() {
        return fed;
    }

    public int getAge() {
        return age;
    }

    public double getSpeed() {
        return speed;
    }

    public String getSpecies() {
        return species;
    }

    //END getters and setters
}



