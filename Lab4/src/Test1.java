import java.util.ArrayList;



public class Test1 {



public static void main(String[] args){
	
	ArrayList<Character> combo = new ArrayList<Character>();

	combo.add ('a');
	combo.add ('b');
	combo.add ('c');
	combo.add ('d');
	combo.add ('e');

for(int indexa = 0; indexa < combo.size(); indexa++)
{
	for (int indexb = 0; indexb < combo.size(); indexb++)
	{
		System.out.print(combo.get(indexa));
		System.out.println(combo.get(indexb));
	}
}
}}