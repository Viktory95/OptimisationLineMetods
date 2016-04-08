/**
 * Created by Ivan on 04.03.2016.
 */
public class Newton {
    double U0;
    double Capacity = 10e-2;
    double k=0;
    double[] U = new double[10];




    private double MakeFunction(double u){
        double Function=Math.pow(u,5)-3*Math.pow(u,3)-2*u+1;
        return Function;
    }
}
