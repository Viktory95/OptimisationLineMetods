/**
 * Created by Ivan on 26.02.2016.
 */
public class HalfLine {
    public int iteration = 0;
    double Left,Right;
    double Capacity = 10e-2;
    double deviation = 0.2;
    double FunctionValue1, FunctionValue2;
    double U1,U2;
    public double FunctionResult;

    public void Recoursive(){
        iteration++;
        U1=(Right+Left-deviation)/2;
        U2=(Right+Left+deviation)/2;
        FunctionValue1=MakeFunction(U1);
        FunctionValue2=MakeFunction(U2);
        if(FunctionValue1<FunctionValue2){
            Right=U2;
        }else{
            if(FunctionValue1>FunctionValue2){
                Left=U1;
            }else{
                Right=U2;
                Left=U1;
            }
        }
        if(Right-Left>=deviation){
            Recoursive();
        }else{
            double UResult=(Right+Left)/2;
            FunctionResult=MakeFunction(UResult);
        }
    }

    private double MakeFunction(double u){
        double Function=Math.pow(u,5)-3*Math.pow(u,3)-2*u+1;
        return Function;
    }

}
