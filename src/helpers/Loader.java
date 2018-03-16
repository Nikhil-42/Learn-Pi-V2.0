package helpers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Loader {

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    public static LocalDateTime now;
    public static final String LOGSPATH = "src/data/", RECORDSUF = "_record.txt", LOGSUF = "_log.txt", ALLUSERSNAME = "WORLD";

    public static void createRecordFile(String name) {
        File file = new File(LOGSPATH + name.toUpperCase() + RECORDSUF);
        System.out.println(file.getAbsolutePath());
        try {
            file.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("0|");
            bw.close();
        } catch (IOException e) {

        }
    }
    
    public static void createLogFile(String name) {
    	File file = new File(LOGSPATH + name + LOGSUF);
    	System.out.println(file.getAbsolutePath());
    	try {
    		file.createNewFile();
    		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    		now = LocalDateTime.now();
    		bw.write("First_login|" + dtf.format(now));
    		bw.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }

    public static void setRecord(int rec) {
        setRecord(rec, ALLUSERSNAME);
    }

    public static void setRecord(int rec, String name) {
        write(rec, new RecordFile(name));
    }

	public static void addAttempt(int digits, String name) {
		write(digits, new LogFile(name));
	}

    public static boolean testForRecord(String name) {
        return (new RecordFile(name).exists());
    }

    public static boolean testForFile(String fileName, String filePath) {
        return testForFile(new File(filePath + fileName));
    }

    public static boolean testForFile(File f) {
        return (f.exists() && !f.isDirectory());
    }

    public static boolean isUser(String name) throws IOException {
        return testForRecord(name);
    }
    
    private static void write(int num, File toWrite) {
    	String oldData = "\n",
        		digits = Integer.toString(num);
        List<String> oldList;

        oldList = ((LogFile) toWrite).getAllData();
        oldData = oldList.stream().map((s) -> (s + "\n")).reduce(oldData, String::concat);

        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(toWrite))) {
                now = LocalDateTime.now();
                bw.write(digits + "|" + dtf.format(now) + oldData);
            }
        } catch (IOException e) {

        }
    }
}
