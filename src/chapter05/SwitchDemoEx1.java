package chapter05;
// SwitchDemoEx1.java
import java.util.Random;

public class SwitchDemoEx1 {
	    public static void main(String[] args) {

//		int yearNum = 0;

	    	Random randomNumY = new Random();
		int yearNum = randomNumY.nextInt(10001);

	        int numDays = 0;

	        Random randomNumM = new Random();
		int monthNum = randomNumM.nextInt(13);

	        switch (monthNum) {
	            case 1:
	            case 3:
	            case 5:
	            case 7:
	            case 8:
	            case 10:
	            case 12:
	                numDays = 31;
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                numDays = 30;
	                break;
	            case 2:
	                if (((yearNum % 4 == 0) &&
	                     !(yearNum % 100 == 0))
	                     || (yearNum % 400 == 0))
	                    numDays = 29;
	                else
	                    numDays = 28;
	                break;
	            default:
	                System.out.println("Oops!! Invalid month, please run again.");
	                break;
	        }
	        System.out.println("In year " + yearNum + " month #"+ monthNum + " has/had " + numDays + " days");
	    }
	}

