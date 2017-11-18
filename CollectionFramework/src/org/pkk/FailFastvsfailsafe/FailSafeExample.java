package org.pkk.FailFastvsfailsafe;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;


public class FailSafeExample
{
    
    
    public static void main(String[] args)
    {
        ConcurrentHashMap<String,String> premiumPhone = 
                               new ConcurrentHashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }
        for(Map.Entry<String, String> en : premiumPhone.entrySet()){
        	 System.out.println(en.getKey());
        }
    }
    
}