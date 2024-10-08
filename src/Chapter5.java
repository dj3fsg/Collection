import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Chapter5 {
	static class SortByDate implements Comparator<Task> {
	    @Override
	    public int compare(Task a, Task b) {
	      return a.getDate().compareTo(b.getDate());
	    }
	  }

	public static void main(String[] args) {
		 List<Task> list = new ArrayList<>();
		 //Taskクラスのオブジェクトを宣言
		 list.add(new Task("2021年10月21日","牛乳を買う"));
		 list.add(new Task("2021年9月15日","○○社面談"));
		 list.add(new Task("2021年12月4日","手帳を買う"));
		 list.add(new Task("2021年8月10日","散髪に行く"));
		 list.add(new Task("2021年11月9日","スクールの課題を解く"));
	 
		 //listのソート
		 //日付順(昇順)
		 Collections.sort(list, new SortByDate());
		 
		 //並び替えたタスクの表示
		 for(Task li:list) {
			 System.out.println(li.getDate()+":"+li.getTask());
		 }
	}


}
