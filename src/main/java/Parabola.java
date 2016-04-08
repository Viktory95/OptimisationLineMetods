/**
 * Created by Ivan on 29.02.2016.
 */
public class Parabola {
   double U1,U2,U3;
   double W=U2+((U3-U2)*(U3-U2)*(MakeFunction(U1)-MakeFunction(U2))-(U2-U1)*(U2-U1)*(MakeFunction(U3)-MakeFunction(U2))/2*((U3-U2)*MakeFunction(U1)-MakeFunction(U2)+(U2-U1)*MakeFunction(U3)-MakeFunction(U2)));

    public void Recoursive(){
        if (W < U2){
            if(MakeFunction(W) < MakeFunction(U2)){
                U1 = U1;
                U2=W;
                U3 = U2;
            }
            if (MakeFunction(W) > MakeFunction(U2)){
                U1 = W;
                U2 = U2;
                U3 = U3;
            }
            if (MakeFunction(W) == MakeFunction(U2)){
                if (MakeFunction(U1) > MakeFunction(U2)){
                    U1 = U1;
                    U2 = W;
                    U3 = U2;
                }
                if (MakeFunction(U2) > MakeFunction(U3)){
                    U1 = W;
                    U2 = U2;
                    U3 = U3;
                }
            }
        }
        if (W > U2){
            if (MakeFunction(W) < MakeFunction(U2)){
                U1 = U2;
                U2 = W;
                U3 = U3;
            }
            if (MakeFunction(W) > MakeFunction(U2)){
                U1 = U1;
                U2 = U2;
                U3 = W;
            }
            if (MakeFunction(W) == MakeFunction(U2)){
                if (MakeFunction(U3) > MakeFunction(U2)){
                    U1 = U2;
                    U2 = W;
                    U3 = U3;
                }
                if (MakeFunction(U1) > MakeFunction(U2)){
                    U1 = U1;
                    U2 = U2;
                    U3 = W;
                }
            }
        }
        if (W == U2){
            //??????????????????????????
        }
    }

    private double MakeFunction(double u){
        double Function=Math.pow(u,5)-3*Math.pow(u,3)-2*u+1;
        return Function;
    }
}
