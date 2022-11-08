import java.util.ArrayList;


public class Main 
{
	public static void lettercount(String name)
	{
		ArrayList<Character> chars=new ArrayList<>();
		ArrayList<Integer> nums=new ArrayList<>();
		for (int i = 0; i < name.length() ; i++) 
		{
			char letter = name.charAt(i);
			if (chars.contains(letter)) 
			{
				int index=chars.indexOf(letter);
				nums.set(index,nums.get(index)+1);
			}
			else
			{	
				chars.add(letter);
				nums.add(1);
			}
		}
		for (int i = 0; i < chars.size(); i++) {
			 System.err.print(chars.get(i) +""+ nums.get(i));
		}
		System.out.println("\n");
	}
	public static void letterzip(String name)
	{
		ArrayList<Character> chars=new ArrayList<>();
		for (int i = 0; i < name.length() ; i++) 
		{
			char letter = name.charAt(i);
			if (!chars.contains(letter)) 
			{
				chars.add(letter);
			}
			
		}
		for (int i = 0; i < chars.size(); i++) {
			System.out.print(chars.get(i));
		}
	}

	public static void main(String[] args) 
	{
		lettercount("numan");
		letterzip("numan");
	
	}
}
