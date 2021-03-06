package vn.elca.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question10 {
	public static void main(String[] args) {
		sortDates(Arrays.asList(new DAY[] { DAY.TUE, DAY.MON, DAY.WED, DAY.THU, DAY.SAT, DAY.SUN, DAY.FRI }));
	}

	public static void sortDates(List<DAY> dayList) {
		Set<DAY> set = new TreeSet<DAY>(dayList);

		/*
		 * List<DAY> list = new ArrayList<DAY>(set); Collections.sort(list,
		 * Collections.reverseOrder()); set = new LinkedHashSet<DAY>(list);
		 */
		List<DAY> list = new ArrayList<DAY>(set);
		Collections.sort(list, new Comparator<DAY>() {

			@Override
			public int compare(DAY d1, DAY d2) {
				// TODO Auto-generated method stub
				if (d1.equals(DAY.SUN)) {
					return -1;
				}
				return d1.ordinal() - d2.ordinal();
			}
		});
		for (DAY day : list) {
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
