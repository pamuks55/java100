import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
public static void main(String[] args) {
	Scanner k=new Scanner(System.in);
	String ism=k.next();
	Map<Character, Integer> isim=new TreeMap<>();
	for (int i = 0; i <ism.length() ;i++) {
	     isim.put(ism.charAt(i), 0);
	}
	for (int i = 0; i <ism.length() ;i++) {
	     int sayac=isim.get(ism.charAt(i));
	     isim.put(ism.charAt(i), sayac+1);
	}
	
	System.out.println(isim);

}
}
