import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Task {
	//クラス変数
	private LocalDate date;
    private String task;
    
     // 文字列→日付へ変換
 	DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年M月d日");
 	
    public Task(String dateString ,String task) {
    	this.date = LocalDate.parse(dateString,f);
    	this.task = task;
    }
    
    public LocalDate getDate(){
    	return date;
    }
    
    public String getTask() {
    	return task;
    }
    
    @Override
    public String toString() {
    	return date +":" +task;
    }



}
