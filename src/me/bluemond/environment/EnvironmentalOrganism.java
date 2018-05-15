package me.bluemond.environment;




// implement this to create an environmental organism data object
// (also needs to be registered in the environmental organism registry)


public interface EnvironmentalOrganism
{
    public void performTimeStep();
}
