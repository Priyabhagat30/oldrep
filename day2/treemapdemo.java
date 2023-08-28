package day2;
import java.util.*;
public class treemapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String> map=new TreeMap<>();
		 map.put(9, "priya");
		 map.put(5, "ghkj");
		 map.put(7, "ice");
		 System.out.println(" reversen " +map.descendingMap());
		 System.out.println(" headmap " +map.headMap(9,true));
		 System.out.println(" tailmap " +map.tailMap(7, true));
		 System.out.println(" submap " +map.subMap(5, false,9 ,true));

	}

}
