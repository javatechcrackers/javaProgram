
import java.util.*; 
class HashMapDemo { 
public static void main(String args[]) { 
// Create a hash map 
HashMap<String,Double> hm = new HashMap<String,Double>(); 
// Put elements to the map 
hm.put("John Doe", 3434.34); 
hm.put("Tom Smith", 123.22); 
hm.put("Jane Baker", 1378.00); 
hm.put("Todd Hall", 99.22); 
hm.put("Ralph Smith", -19.08); 
// Get a set of the entries 
System.out.println(hm);
System.out.println("Bollean value" + hm.containsKey("Johnj Doe"));

Set set = hm.entrySet(); 
System.out.println(set.isEmpty());
// Get an iterator 
Iterator i = set.iterator(); 
// Display elements 
System.out.println(set);
while(i.hasNext()) { 
Map.Entry me = (Map.Entry)i.next(); 
System.out.print(me.getKey() + ": "); 
System.out.println(me.getValue()); 
} 
System.out.println(); 
// Deposit 1000 into John Doe's account 
double balance = ((Double)hm.get("John Doe")).doubleValue(); 
hm.put("John Doe", new Double(balance + 1000)); 
System.out.println("John Doe's new balance: " + 
hm.get("John Doe")); 
} 
}