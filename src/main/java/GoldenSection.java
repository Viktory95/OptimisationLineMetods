/**
 * Created by Ivan on 04.03.2016.
 */
public class GoldenSection {
    int iteration = 0;
    double Left,Right;
    double Capacity = 10e-2;
    double Alfa = (Math.sqrt(5)-1)/2;
    double Alfa1 = (3-Math.sqrt(5))/2;
    double U1 = Left + Alfa1*(Right - Left);
    double U2 = Left + Alfa*(Right - Left);
    double FunctionValue1, FunctionValue2;

    private void Recoursive(){
        iteration++;
        FunctionValue1=MakeFunction(U1);
        FunctionValue2=MakeFunction(U2);

        if(FunctionValue1<FunctionValue2){
            Right=U2;
            U2=U1;
            FunctionValue2=FunctionValue1;
            U1=Left+Alfa1*(Right - Left);
            FunctionValue1 = MakeFunction(U1);
        }else{
            if(FunctionValue1>FunctionValue2){
                Left=U1;
                U1=U2;
                FunctionValue1=FunctionValue2;
                U2 = Left + Alfa*(Right - Left);
                FunctionValue2 = MakeFunction(U2);
            }else{
                Right=U2;
                Left=U1;
                U1=Left+Alfa1*(Right - Left);
                U2 = Left + Alfa*(Right - Left);
                FunctionValue1 = MakeFunction(U1);
                FunctionValue2 = MakeFunction(U2);
            }
        }
        if(Right-Left>=Capacity){
            Recoursive();
        }else{
            double UResult=(Right+Left)/2;
            double FunctionResult=MakeFunction(UResult);
        }

    }


    private double MakeFunction(double u){
        double Function=Math.pow(u,5)-3*Math.pow(u,3)-2*u+1;
        return Function;
    }

}
