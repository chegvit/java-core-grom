package lesson28;

import sun.util.calendar.BaseCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class DemoComparator {
    public static void main(String[] args) {

        Capability capability1 = new Capability(1001, "cest", "ggrr", true, new Date (2233456711111L));
        Capability capability2 = new Capability(1005, "best", "mnrr", false,new Date (1223232323234L));
        Capability capability3 = new Capability(900, "aest", "abrr", true,  new Date (2343545666611L));

        ArrayList<Capability> capabilities = new ArrayList<>();
        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        capabilities.sort(new IsActiveComparator());
        System.out.println(capabilities);
        capabilities.sort(new DateComparator());
        System.out.println(capabilities);
        capabilities.sort(new FullComparator());
        System.out.println(capabilities);

        Comparator<Capability> comparator = new Comparator<Capability>() {
            @Override
            public int compare(Capability o1, Capability o2) {
//                если channelName не равно - сравниваю по нему
//                если равно - перехожу к fingerprint
//                если fingerprint не равно - сравниваем по нему
//                если равно - перехожу к dateCreated
//                если dateCreated не равно - сравниваем по нему
//                если равно - объекты равны
                if (!o1.getChannelName().equals(o2.getChannelName()))
                    return o1.getChannelName().compareTo(o2.getChannelName());

                return 0;
            }
        };
    }
}