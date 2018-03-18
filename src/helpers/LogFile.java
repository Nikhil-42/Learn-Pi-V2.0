package helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class LogFile extends File {
	
    private BufferedReader br;
    private String latest;
    private List<String> data;

    public LogFile(String name) throws FileNotFoundException {
        this(name, Loader.LOGSUF);
    }
    
    public LogFile(String name, String extension) throws FileNotFoundException {
    	super(Loader.LOGSPATH + name.toUpperCase() + extension);
        try {
			br = new BufferedReader(new FileReader(this));
			latest = br.readLine();
			data = loadData();
		} catch (FileNotFoundException e) {
			if (extension.equals(Loader.LOGSUF))
				Loader.createLogFile(name);
			else if (extension.equals(Loader.RECORDSUF))
				Loader.createRecordFile(name);
			e.printStackTrace();
			throw new FileNotFoundException("Exception indicating a log file is missing or uncreated.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    private List<String> loadData() {
    	List<String> records;
        records = new ArrayList<>();
        records.add("Error");

        if (exists() && isFile()) {
            records.clear();
            try {
                records = com.google.common.io.Files.readLines(this, Charset.defaultCharset());
            } catch (IOException e) {
                System.out.println("An error has occured.");
            }
        } else {
            System.out.println("Your file couldn't be found.");
        }
        return records;
    }
    
    public String getLatest() {
    	return latest;
    }
    
    public List<String> getAllData() {
    	return data;
    }
}
