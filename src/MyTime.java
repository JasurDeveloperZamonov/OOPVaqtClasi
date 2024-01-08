public class MyTime {
    private int hour;
    private int minut;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int minut) {
        this.minut = minut;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public MyTime() {
    }
    public MyTime(int hour, int minut, int second) {
        this.hour = hour;
        this.minut = minut;
        this.second = second;
    }



    public void setTime(int soat, int daqiqa, int soniya ){
        MyTime myTime=new MyTime();

        if (soat<=23 && soat>=0){
            myTime.setHour(soat);
            setHour(soat);
            int soat1= myTime.getHour()/10;
            if ( soat1>=1){
                System.out.print(myTime.getHour()+":");
            }else {System.out.print("0"+myTime.getHour()+":");}

        }else {
            System.out.print("Soat yaroqsiz!");
        }
        if (daqiqa<=59 && daqiqa>=0){
            myTime.setMinut(daqiqa);
            setMinut(daqiqa);
            int daqiqa1= myTime.getMinut()/10;
            if ( daqiqa1>=1){
                System.out.print(myTime.getMinut()+":");
            }else {System.out.print("0"+myTime.getMinut()+":");}
        }else {
            System.out.print("Daqiqa yaroqsiz!");
        }
        if (soniya<=59 && soniya>=0){
            myTime.setSecond(soniya);
            setSecond(soniya);
            int soniya1= myTime.getSecond()/10;
            if ( soniya1>=1){
                System.out.print(myTime.getSecond());
            }else {System.out.print("0"+myTime.getSecond());}
        }else {
            System.out.print("Soniya yaroqsiz!");
        }
    }

    public void format(int st,int mt,int sd){
         st=getHour();
         mt=getMinut();
         sd=getSecond();

        st=getHour()/10;
        if ( st>=1){
            System.out.print(getHour()+":");
        }else {System.out.print("0"+getHour()+":");}

        mt=getMinut()/10;
        if ( mt>=1){
            System.out.print(getMinut()+":");
        }else {System.out.print("0"+getMinut()+":");}

        sd=getSecond()/10;
        if ( sd>=1){
            System.out.print(getSecond());
        }else {System.out.print("0"+getSecond());}
    }

    public void nextSecond(){
        setSecond(getSecond()+1);
        if (getSecond()==60){
            setSecond(0);
            setMinut(getMinut()+1);
            if (getMinut()==60){
                setMinut(0);
                setHour(getHour()+1);
                if (getHour()==24){
                    setHour(0);
                }
            }
        }
       format(getHour(),getMinut(),getSecond());
    }

    public void nextMinut(){
        setMinut(getMinut()+1);
        if (getMinut()==60){
            setMinut(0);
            setHour(getHour()+1);
            if (getHour()==24){
                setHour(0);
            }
        }
        format(getHour(),getMinut(),getSecond());
    }

    public void nextHour(){
        setHour(getHour()+1);
        if (getHour()==24){
            setHour(0);
        }
        format(getHour(),getMinut(),getSecond());
    }

    public void previousSecond(){
        setSecond(getSecond()-1);
        if (getSecond()==-1){
            setSecond(59);
            setMinut(getMinut()-1);
            if (getMinut()==-1){
                setMinut(59);
                setHour(getHour()-1);
                if (getHour()==-1){
                    setHour(23);
                }
            }
        }
        format(getHour(),getMinut(),getSecond());
    }

    public void previousMinute(){
        setMinut(getMinut()-1);
        if (getMinut()==-1){
            setMinut(59);
            setHour(getHour()-1);
            if (getHour()==-1){
                setHour(23);
            }
        }
        format(getHour(),getMinut(),getSecond());
    }

    public void oldingiHour(){
        setHour(getHour()-1);
        if (getHour()==-1){
            setHour(23);
        }
        format(getHour(),getMinut(),getSecond());
    }

}
