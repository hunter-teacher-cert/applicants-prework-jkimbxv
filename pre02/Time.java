import java.io.*;
import java.util.*;
public class Time{
  public static void main(String[] args){
    double hour = 21.0;
    double minute = 1.0;
    double second = 0.0;
    System.out.print("Minutes since midnight: ");
    double minSinceMidnight = hour*60 + minute;
    System.out.println(minSinceMidnight);
    System.out.print("Seconds remaining in day: ");
    double secSinceMidnight = minSinceMidnight * 60;
    double totalSecDay = 24*60*60;
    System.out.println(totalSecDay-secSinceMidnight);
    System.out.print("Percentage of day passed: ");
    System.out.println(secSinceMidnight/totalSecDay*100+"%");
    double oldHour = 20.0;
    double oldMinute = 49.0;
    double oldSec = 0.0;
    double minSinceMidnightOld = oldHour * 60 + oldMinute;
    System.out.print("Time spent on this exercise: ");
    System.out.println(minSinceMidnight-minSinceMidnightOld);

  }
}
