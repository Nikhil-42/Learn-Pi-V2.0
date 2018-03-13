package helpers;

public class RecordFile extends LogFile{
    
    public RecordFile(String name) {
		super(name, Loader.RECORDSUF);
	}

	public String getRecordData() {
    	return getLatest();
	}
	
	public int getRecord() {
		try {
			return Integer.parseInt(getRecordData().substring(0,getRecordData().indexOf("|")));
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
