package revision.subpack;

import revision.AccessDemo;
//THE RELATION BETWEEN THIS CLASS AND ACCESSDEMO CLASS IS GENERALIZATION
public class DifPackSubAD extends AccessDemo{
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);//since nomod is package scope
		//nomod is not available outside the package
		System.out.println(pro);
		System.out.println(pub);
	}
}
//having a field of AccessDemo declared inside DifpackNonSubAD is
//creating a ASSOCIATION BETWEEN THIS CLASS AND ACCESSDEMO CLASS
class DifPackNonSubAD {
	public void met() {
		AccessDemo obj=new AccessDemo();//OBJ IS RELATED TO THIS CLASS-ASSOCIATION
		System.out.println(obj.pri);
		//all the below are package or more than package scope
		System.out.println(obj.nomod);
		
		//protected is relation scope
		System.out.println(obj.pro);
		
		//public is global scope
		System.out.println(obj.pub);
	}
}