package thirdLab;

public class CoffeeMachine {
    int Coffee = 0;
    int Money = 0;
    int type = 0;

    public String start(int value){
        Coffee += value;
        Money += value;
        return this.busy();
    }

    public String busy(){
        if (Coffee > 1) {
            this.type(type);
            return "Busy";
        }
        if (Coffee == 0)
            return "Order your coffee";
        return this.prep();
    }

    //Stub function
    public String prep(){
        if(Coffee == 1)
            return "Preparing Coffee";
        return "Error";
    }

    public String type(int type){
        if(Coffee == 1){
            switch(type){
                case 0:
                    return "Coffee";
                case 1:
                    return "Tea";
                case 2:
                    return "Espresso";
            }
            return "Water";
        }
        return this.prep();
    }
}
