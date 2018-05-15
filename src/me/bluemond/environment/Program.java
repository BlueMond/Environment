package me.bluemond.environment;

public class Program
{

    // starting point
    public static void main(String[] args){

        Environment environment = new Environment();

        printArgs(args);

    }

    public static void printArgs(String[] args){
        for(String arg : args){
            System.out.println("argument: '" + arg + "'");
        }
    }

}
