package utilpack;
//https://fluvid.com/videos/detail/QKZX3hda8wIRLgKRM#.YkLvNbgOgXQ.link
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo3 {
	public static void main(String[] args) {
		Set hs=new TreeSet();
		
		hs.add(new Question(1,"who is cm","chief minister"));
		hs.add(new Question(2,"who is pm","prime minister"));
		hs.add(new Question(3,"who is fm","finance minister"));
		hs.add(new Question(4,"who is dm","defence minister"));
		
		System.out.println(hs);
		
		Iterator iter=hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(Object o:hs) {
			System.out.println(o);
		}				
	}
}

class Question implements Comparable<Question>{
	int qno;
	String question;
	String ans;
	public Question(int qno, String question, String ans) {
		super();
		this.qno = qno;
		this.question = question;
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [qno=" + qno + ", question=" + question + ", ans=" + ans + "]";
	}
	@Override
	public int compareTo(Question o) {
		return o.qno-this.qno;
	}
}