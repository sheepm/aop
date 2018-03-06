package sheepm.libjava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by paomo on 2018/3/6.
 */

public class TimeCache {

    public static Map<String, Long> sStartTimes = new HashMap<>();
    public static Map<String, Long> sEndTimes = new HashMap<>();

    public static void setStartTime(String methodName, long time) {
        sStartTimes.put(methodName, time);
    }

    public static void setEndTime(String methodName, long time) {
        sEndTimes.put(methodName, time);
    }

    public static String getMethodTime(String methodName){
        return methodName + " cost time :" + (sEndTimes.get(methodName) - sStartTimes.get(methodName));
    }
}
