package helpers;

import java.util.ArrayList;
import java.util.List;

public class Logs {

	/**
	 *
	 */
	public static boolean loggedIn;
	public static String username;

	public static boolean isRecord(String name, int rec) {
		return rec > Integer.parseInt(parseRecord(new RecordFile(name).getRecordData()));
	}

	public static boolean isRecord(int rec) {
		return isRecord("WORLD", rec);
	}

	public static List<String> parseLogs(String name) {
		return parseLogs(name, "NORMAL", false);
	}

	public static List<String> parseLogs(String name, String mode, boolean advanced) {
		return parseLogs(name, mode, advanced, true);
	}
	
	public static List<String> parseLogs(String name, String mode, boolean advanced, boolean isRecLoad) {
		if (!loggedIn) {
			name = "WORLD";
		}
		List<String> records, dates, times, logs;
		String allRecords, allDates, allTimes;
		int currentIndex;
		LogFile rf;
		if (isRecLoad)
			rf = new RecordFile(name);
		else
			rf = new LogFile(name);
		records = new ArrayList<>();
		dates = new ArrayList<>();
		times = new ArrayList<>();
		logs = rf.getAllData();
		allRecords = "";
		allDates = "";
		allTimes = "";
		switch (mode.toUpperCase()) {
		case "REVERSE":
			for (String s : logs) {
				records.add(0, parseRecord(s));
				dates.add(0, parseDate(s));
				times.add(0, parseTime(s, advanced));
			}
			break;
		case "NORMAL":
			for (String s : logs) {
				currentIndex = logs.indexOf(s);
				records.add(currentIndex, parseRecord(s));
				dates.add(currentIndex, parseDate(s));
				times.add(currentIndex, parseTime(s, advanced));
			}
			break;
		}
		allRecords = records.stream().map((s) -> {
			return s + "\n";
		}).reduce(allRecords, String::concat);
		allDates = dates.stream().map((s) -> {
			return s + "\n";
		}).reduce(allDates, String::concat);
		allTimes = times.stream().map((s) -> {
			return s + "\n";
		}).reduce(allTimes, String::concat);
		logs.clear();
		logs.add(allDates);
		logs.add(allTimes);
		logs.add(allRecords);
		return logs;
	}

	public static String parseRecord(String s) {
		int iend = s.indexOf("|");
		String out;
		if (iend != -1) {
			out = s.substring(0, iend);
		} else {
			out = "---";
		}
		return out;
	}

	private static String parseDate(String s) {
		int iend = s.indexOf("|"), iend2 = s.indexOf(" ");
		String out;
		if (iend != -1 && iend2 != -1) {
			out = s.substring(iend + 1, iend2);
		} else {
			out = "---";
		}
		return out;
	}

	private static String parseTime(String s, boolean advanced) {
		int iend = s.indexOf(" "), hour;
		String out, temp;
		if (iend != -1) {
			temp = s.substring(iend + 1);
			if (!advanced) {
				hour = Integer.parseInt(temp.substring(0, 2));
				if (hour > 12) {
					hour -= 12;
					temp = Integer.toString(hour) + temp.substring(2, 5);
					temp += " pm";
				} else {
					temp = temp.substring(0, 5);
					temp += " am";
				}
			}
			out = temp;
		} else {
			out = "---";
		}
		return out;
	}
	
	public static int getRecord(String name) {
		RecordFile rf = new RecordFile(name);
		return rf.getRecord();
	}

	public static void setUser(String name) {
		username = name.toUpperCase();
		loggedIn = true;
	}

	/**
	 *
	 * @param name
	 * @param rec
	 * @return
	 */
	public static boolean record(String name, int rec) {
		boolean isRec = isRecord(name, rec);
		Loader.addAttempt(rec, name);
		if (isRec) {
			Loader.setRecord(rec, name);
		}
		return isRec;
	}
}
