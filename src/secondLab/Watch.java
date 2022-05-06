package secondLab;

public class Watch {
    static int m = 0;
    static int h = 0;
    static int D = 1;
    static int M = 1;
    static int Y = 2000;
    String state = "NORMAL";
    String state1 = "TIME";

    public void setState(String state) {
        this.state = state;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String stateTransitions(char input){
        switch (state){
            case "NORMAL": {
                if (input == 'c') {
                    state = "UPDATE";
                    state1 = "MIN";
                    return state1;
                }
                if (input == 'b') {
                    state = "ALARM";
                    state1 = "ALARM";
                    return state1;
                }
                if (input == 'a'){
                    if (state1 == "TIME")
                        state1 = "DATE";
                    else
                        state1 = "TIME";
                    return state1;
                }
            }
            case "UPDATE":{
                if (input == 'd') {
                    state = "NORMAL";
                    state1 = "TIME";
                    return state1;
                }
                if (input == 'b') {
                    if (state1 == "MIN") {
                        if (m == 60)
                            m = 0;
                        else
                            m++;
                        return state1;
                    }
                    if (state1 == "HOUR"){
                        if (h == 24)
                            h = 0;
                        else
                            h++;
                        return state1;
                    }
                    if (state1 == "DAY"){
                        if (D == 31)
                            D = 0;
                        else
                            D++;
                        return state1;
                    }
                    if (state1 == "MONTH"){
                        if (M == 24)
                            M = 0;
                        else
                            M++;
                        return state1;
                    }
                    if (state1 == "YEAR"){
                        if (Y == 24)
                            Y = 0;
                        else
                            Y++;
                        return state1;
                    }
                }
                if(input == 'a') {
                    if(state1 == "MIN") {
                        state1 = "HOUR";
                        return state1;
                    }
                    if(state1 == "HOUR") {
                        state1 = "DAY";
                        return state1;
                    }
                    if(state1 == "DAY") {
                        state1 = "MONTH";
                        return state1;
                    }
                    if(state1 == "MONTH") {
                        state1 = "YEAR";
                        return state1;
                    }
                    if(state1 == "YEAR") {
                        state1 = "TIME";
                        return state1;
                    }
                }
            }
            case "ALARM":{
                if(input == 'd') {
                    state = "NORMAL";
                    state1 = "TIME";
                    return state1;
                }
                if(input == 'a') {
                    state1 = "CHIME";
                    return state1;
                }
            }
        }
        return state1;
    }
    
    public void DisplayDate() {
        System.out.println(Y + " - " + M + " - " + D);
    }
    public void DisplayTIME() {
        System.out.println(h + " : " + m);
    }
}