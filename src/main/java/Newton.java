import sun.util.locale.UnicodeLocaleExtension;

/**
 * Created by Ivan on 04.03.2016.
 */
public class Newton {
    double U0;
    double U =U0;
    double Unext;
    double UX;
    double Capacity;
    int iteration=0;
    double FunctionResult;

   public void Recoursive(){
       MakeFirstDerivative(U);
       if (Math.abs(MakeFirstDerivative(U))<=Capacity){
           UX=U;
           FunctionResult = MakeFunction(UX);

       }else{
           U= U - MakeFirstDerivative(U)/MakeSecondDerivative(U);
           iteration++;
           Recoursive();
       }
   }

    private double MakeFunction(double u){
        double Function=Math.pow(u,5)-3*Math.pow(u,3)-2*u+1;
        return Function;
    }

    private double MakeFirstDerivative(double u){
        double Derivative = 5*Math.pow(u,4) - 9*Math.pow(u,2) -2;
        return Derivative;
    }

    private double MakeSecondDerivative(double u){
        double Derivative = 20*Math.pow(u,3) - 18*u;
        return Derivative;
    }
}
