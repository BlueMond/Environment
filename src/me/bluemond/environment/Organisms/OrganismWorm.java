package me.bluemond.environment.Organisms;




public class OrganismWorm extends OrganismBase {


    //length of worm (in inches)
    private double length;




    @Override
    public void performTimeStep(){
        super.performTimeStep();

        //output worm stats for demonstration
        System.out.println("-Worm-\n" + "Age: " + super.getAge() + "\n");
    }




    //constructors

    public OrganismWorm(double health, double fed, double speed) {
        super(health, fed, speed, "Worm");
    }

    public OrganismWorm() {
        this(1, 0.5, 1);
    }

    //END constructors




    //getters and setters

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    //END getters and setters
}
