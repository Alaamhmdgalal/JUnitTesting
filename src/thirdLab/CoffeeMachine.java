package thirdLab;

public class CoffeeMachine {
    int Coffee = 0;

    public void start(int value){
        Coffee += value;
    }

    public String busy(){
        if (Coffee > 1)
            return "Busy";
        if (Coffee == 0)
            return "Get your coffee";
        return "Preparing Coffee";
    }

    public boolean isBusy(){
        if(this.busy() == "Busy")
            return true;
        return false;
    }

    public String money(){
        if(this.isBusy() == true)
            return "Not empty";
        return "Empty";
    }
}
