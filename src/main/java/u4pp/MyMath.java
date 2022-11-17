package u4pp;

public class MyMath {
    
    public static int abs(int x){
        if (x > 0){
            return x;
        }
        if (x < 0){
            x *= -1;
        }
        return x;
    }

    public static double abs(double x){
        if (x > 0.0){
            return x;
        }
        if (x < 0.0){
            x *= -1.0;
        }
        return x;
    }

    public static double pow(double base, int exponent){
        double pow = 1.0, i; 
        for (i = 1.0 ; i <= exponent ; i++) {  
            pow = pow * base ;  
        }  
        return pow ;  
    }

    public static int perfectSqrt(int x){
        if (x < 0) {
            return -1;
        } else if (x < 2) {
            return x;
        } else {
            for (int i = 0; i < x; i++) {
                if (i * i == x) {
                    return i;
                }
            }
            return -1;
        }
    }
}

