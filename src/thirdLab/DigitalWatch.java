package thirdLab;

public class DigitalWatch {

    int hours;
    int minutes;
    int seconds;
    int arr[] = new int[3];

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    //Stub
    public String view(){
        return hours + ":" + minutes + ":" + seconds;
    }

    public String adjust(int h, int m, int s){
        this.setHours(h);
        this.setMinutes(m);
        this.setSeconds(s);
        return view();
    }

    public int[] setAlarm(int h, int m, int s){
        arr[0] = h;
        arr[1] = m;
        arr[2] = s;
        return arr;
    }

    public String alarm(int h, int m, int s){
        if(arr[0] == h && arr[1]== m && arr[2] == s)
            return "Ringing";
        return "Set alarm";
    }

}
