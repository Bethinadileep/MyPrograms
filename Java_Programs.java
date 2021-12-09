//codeby : Dileep

//Q1)
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 22, anotherVar = 7, result;
		String  str = "One";
		String anotherStr = "Two";
		result = var*anotherVar/anotherVar;
		if(result < 22) {
			System.out.println(str);
		}
		else {
			System.out.println(anotherStr);
		}
		
	}

}

//Q2)
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int loop = 0;loop < 5;loop++) {
			if(loop > 2) {
				continue;
			}
			if(loop > 4) {
				break;
			}
			
			System.out.println(loop);
		}
	}
}

//Q3)
import java.util.*;
public class demo {

	public static void main(String[] args) {
		int[] tempList = {1,-1,-2};
		int[] numList = {-2,-1,1};
		int length = numList.length;
		for(int value:tempList) {
			int tempValue = value;
			if(value<0) {
				tempValue = length - Math.abs(value);
			}
			if(value == tempList[tempValue]) {
				if(value<0) {
					numList[length-tempValue]=value;
				}
				else {
					numList[tempValue]=value;
				}
			}
			else {
				numList[0] = value;
			}
		}
		for(int val:numList) {
			System.out.println(val);
		}
		
	}
}



