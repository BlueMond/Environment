package me.bluemond.environment.Organisms;

import me.bluemond.environment.EnvironmentalOrganism;




public class OrganismBase implements EnvironmentalOrganism {


    //ranges from 0 to 1 (0-100% health condition)
    double health;
    //ranges from 0 to 1 (0-100% fed)
    double fed;
    //age of organism (in steps)
    int age;
    //movement speed of organism (arbitrary double precision unit)
    double speed;





    //modifying constructor
    public OrganismBase(double health, double fed, double speed){
        this.health = health;
        this.fed = fed;
        this.speed = speed;
        age = 0;
    }

    //default constructor
    public OrganismBase(){
        this(1, 0.5, 1);
    }





    @Override
    public void performTimeStep() {
        age++;
    }





    //getters and setters

    public
}



