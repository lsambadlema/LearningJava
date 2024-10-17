package com.campusdual.statics;

import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.Date;

public class StaticMethod {

    public static String countDownToYear (String name, int year) {
        Date today = new Date(); //1 opcion: creas un nuevo objeto
        Calendar calendar = Calendar.getInstance(); //2 opcion: no creas objeto. ventajas:puedes ir modificando. es más facil
        calendar.set(year,Calendar.JANUARY,1, 0,0,0);
        Date targetDate = calendar.getTime();
        long millis = targetDate.getTime() - today.getTime();
        long days = millis / (1000 * 60 * 60 * 24);
        if (days>0){
            return "Hi " + name + "!, countdown to " + year + ": " + days + " days.";
        }else {
            return "Hi " + name + "!, days from year " + year + ": " + Math.abs(days) + " days.";
        }

    }

}


