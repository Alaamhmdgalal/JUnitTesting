package secondLab;

public class SecondLab {

    public static String oddOrEven(int n){
        if (n % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    public static int [] checkMinMax(int [] a){
        int max = a[0];
        int min = a[0];
        int [] v = new int[2];
        for (int i = 0; i < a.length; i++){
            if(a[i] > max)
                max = a[i];
            if(a[i] < min)
                min = a[i];
            v[0] = min;
            v[1] = max;
        }
        return v;
    }
}
