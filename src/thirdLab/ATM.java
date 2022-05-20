package thirdLab;

import java.util.ArrayList;
import java.util.Iterator;

public class ATM {
    ArrayList account = new ArrayList<>();

    public int screen(int click, int value){
        switch (click){
            case 0:
                this.deposit(value);
            case 1:
                this.draw(value);
            case 2:
                this.settlement();
        }
        return this.settlement();
    }

    public void deposit(int value){
        account.add(value);
    }

    public void draw(int value){
        account.add(value);
    }

    public int settlement(){
        int result = 0;
        Iterator i = account.iterator();
        while(i.hasNext()){
            Integer value_integer = (Integer)i.next();
            int val = value_integer.intValue();
            result = result + val;
        }
        return result;
    }
}
