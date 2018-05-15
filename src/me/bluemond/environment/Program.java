package me.bluemond.environment;

import me.bluemond.environment.Organisms.OrganismWorm;

public class Program
{

    // starting point
    public static void main(String[] args){

        //create an instance of Environment for testing
        Environment environment = new Environment();

        //create a default instance of OrganismWorm for testing
        OrganismWorm testWorm = new OrganismWorm();

        //register the created worm to the environment
        environment.registerOrganism(testWorm);

        //start the environmental processing
        environment.startup();

        printArgs(args);

    }

    public static void printArgs(String[] args){
        for(String arg : args){
            System.out.println("argument: '" + arg + "'");
        }
    }

}
