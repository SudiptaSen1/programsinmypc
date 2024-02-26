package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Layer<T extends Mappable> {
    
    private List<T> layerElements;

    public Layer(T[] layerElements){this.layerElements=new ArrayList<>(List.of(layerElements));}

    public void addElements(T... elements){layerElements.addAll(List.of(elements));}

    public void renderLayer(){

        for(T element:layerElements){
            element.render();
        }
    }
}

interface Mappable {

    void render();

    static double[] stringTOLatLon(String location){

        var splits=location.split(",");
        double lat=Double.valueOf(splits[0]);
        double lng=Double.valueOf(splits[1]);
        return new double[]{lat,lng};
    }
}

abstract class Point implements Mappable{

    private double[] location= new double[2];

    public Point(String location){
        this.location=Mappable.stringTOLatLon(location);
    }

    @Override
    public void render(){

        System.out.println("Render " +this +" as POINT ( "+location()+" )");
    }

    private String location(){return (Arrays.toString(location));}
}

abstract class Line implements Mappable{

    private double[][] locations;

    public Line(String... locations){
        this.locations=new double[locations.length][];
        int index=0;
        for(var l:locations){
            this.locations[index++]=Mappable.stringTOLatLon(l);
        }
    }

    @Override
    public void render(){

        System.out.println("Render " +this +" as LINE ( "+locations()+" )");
    }

    private String locations(){ return Arrays.deepToString(locations);}
}

