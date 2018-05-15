package me.bluemond.environment;

import java.util.ArrayList;



// handles environmental registries and consolidation of environmental variables

//Run Environment (or TimeDriver?) on thread separate from User-Interface

public class Environment
{

    // turn registries into single arraylist that can be added to or removed from with default registries
    // (organism Registry) being added upon instantiation method

    // organism registry (to be moved)
    private ArrayList<EnvironmentalOrganism> organismRegistry;
    // instance of TimeDriver class
    public TimeDriver timeDriver;


    //constructor
    public Environment(){
        //instantiate environmental variables
        organismRegistry = new ArrayList<EnvironmentalOrganism>();
        timeDriver = new TimeDriver();
    }



    // drives the cycle of time in the environment, step-by-step

    private class TimeDriver
    {
        //standard measure of time in environment
        private int steps;
        //status of driver
        private boolean started;

        public final int MAX_STEPS = 380;


        public TimeDriver(){
            steps = 0;
            started = false;

            start();
        }

        public void start(){
            started = true;

            while(started){
                performStep();

                // only necessary for sololearn playground //
                if(steps >= MAX_STEPS){
                    stop();
                }
                // end excerpt //
            }
        }

        public void stop(){
            started = false;
        }

        private void performStep(){
            steps++;
            //debug line
            System.out.println("step: " + steps);

            cycleRegisteredOrganisms();
        }

        private void cycleRegisteredOrganisms(){
            for(EnvironmentalOrganism organism : organismRegistry){
                organism.performTimeStep();
            }
        }

    }


    // register a new organism in the environment
    public void registerOrganism
    (EnvironmentalOrganism organism){

    }


    public void shutdown(){
        timeDriver.stop();
    }

}
