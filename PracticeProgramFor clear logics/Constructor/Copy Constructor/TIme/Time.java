class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(){
        this.hour=0;
        this.minute=0;
        this.second=0;
    }
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void show(){
        System.out.println(hour+":"+minute+":"+second);
    }
    public static Time add(Time t1, Time t2){
        int totalSecond = t1.second + t2.second;
        int totalMinute = t1.minute + t2.minute + totalSecond /60;
        int totalHour = t1.hour + t2.hour + totalMinute / 60;
        totalSecond%=60;
        totalMinute%=60;
        return new Time(totalHour,totalMinute,totalSecond);
    }
}