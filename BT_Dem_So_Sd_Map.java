package BT_Dem_So_Sd_map;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> newMap = new TreeMap<>();
        String string = "Chuong trinh su dung mot treemap de luu tru muc bao gom tu va so luong cua no";
        String[] words = string.toUpperCase().split("");
        for(int i = 0; i< words.length; i++) {
            words[i] = words[i].replace(',',',');
            words[i] = words[i].replace(',',',');
            words[i] = words[i].replace(',',',');
            words[i] = words[i].replace(',',',');
            words[i] = words[i].replace(',',',');
            String key = words[i];
            if(newMap.containsKey(key)) {
                newMap.put(key, newMap.get(key) + 1);
            } else {
                newMap.put(key, 1);
            }
            System.out.println(newMap);
        }
    }
}
