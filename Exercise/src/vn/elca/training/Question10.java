package vn.elca.training;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question10 {
	public static void main(String[] args) {
		sortDates(Arrays.asList(new DAY[] {DAY.MON, DAY.TUE, DAY.WED, DAY.THU, DAY.FRI, DAY.SAT, DAY.SUN}));
	}

	public static void sortDates(List<DAY> dayList) {
		Set<DAY> set = new TreeSet<DAY>(dayList);
		for(DAY day: set) {
			System.out.println(day);
		}
		
	}
}

enum DAY {
	MON("Monday"), TUE("Tuesday"), WED("Wednesday"), THU("Thurday"), FRI("Friday"), SAT("Saturday"), SUN("Sunday");
	
	String m_name;

	DAY(String name) {
		m_name = name;
	}
	
}
