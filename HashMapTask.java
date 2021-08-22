package hashmap;
import java.util.Scanner;
import java.util.*;
public class HashMapTask{
   Scanner sc=new Scanner(System.in);
   HashMap<String,String> stringMap=new HashMap<>();
   HashMap<Integer,Integer> integerMap=new HashMap<>();
   HashMap<String,Integer> stringIntegerMap=new HashMap<>();
   public  HashMap<String,String> createStringHashMap(){
     System.out.println("Enter the no.of key value pairs for string,string Hashmap:");
     int num=sc.nextInt();
     for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        String key=sc.next();
        System.out.println("Enter the value:");
        String value=sc.next();
        stringMap.put(key,value);
     }
     return stringMap;
    }
     public HashMap<Integer,Integer> createIntegerHashMap(){
      System.out.println("Enter the no.of key value pairs for int,int hashmap:");
      int num=sc.nextInt();
      for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        int intKey=sc.nextInt();
        System.out.println("Enter the value:");
        int intValue=sc.nextInt();
        integerMap.put(intKey,intValue);
     }
     return integerMap;
    }
     public HashMap<String,Integer> createStringIntegerHashMap(){
      System.out.println("Enter the no.of key value pairs for string,int hashmap:");
      int num=sc.nextInt();
      for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        String strKey=sc.next();
        System.out.println("Enter the value:");
        int integerValue=sc.nextInt();
        stringIntegerMap.put(strKey,integerValue);
     }
     return stringIntegerMap;
    }
   public static int findSize(){
       HashMap map=new HashMap();
       int size=map.size();
       System.out.println("Hashmap elements:"+map);
       return size;
   }
   public HashMap<String,String> findStringMapSize(){
       HashMap<String,String> map=createStringHashMap();
       return map;
   }
    public HashMap<Integer,Integer> findIntegerMapSize(){
       HashMap<Integer,Integer> map=createIntegerHashMap();
       return map;
   }
   public HashMap<String,String> addNullValue(){
       HashMap<String,String> map=createStringHashMap();
       return map;
    }
   public HashMap<Integer,Integer> addNull(){
       HashMap<Integer,Integer> map=createIntegerHashMap();
       return map;
   }
   public boolean checkKey(){
     HashMap<String,String> map=createStringHashMap();
     System.out.println("Enter the key to be checked:");
     String key=sc.next();
     boolean value= map.containsKey(key);
     return value;
   }
   public boolean checkValue(){
     HashMap<String,String> map=createStringHashMap();
     System.out.println("Enter the value to be checked:");
     String strValue=sc.next();
     boolean checkValue= map.containsValue(strValue);
     return checkValue;
   }
   public HashMap<String,String> changeValues(){
      HashMap<String,String> map=createStringHashMap();
      map.replaceAll((key, oldValue)
                            -> oldValue + oldValue);
      return map;                      
   }
   public int getValue(){
     HashMap<String,Integer> map=createStringIntegerHashMap();
     System.out.println("Enter the key for which you want the value:");
     String key=sc.next();
     int value=0;
      if(map.containsKey(key)){
           value=map.get(key);
      }
      else{
          System.out.println("Given key is not existing");
      }
      return value;
   } 
    public  String getValueForKey(){
     HashMap<String,String> map=createStringHashMap();
     System.out.println("Enter the non existing key for which you want the value:");
     String nonExistingKey=sc.next();
     int size=map.size();
     System.out.println("Size of the HashMap before changes:"+size);
     String value=null;
      if(map.containsKey(nonExistingKey)){
           value=map.get(nonExistingKey);
      }
      else{
          System.out.println("Given key is not existing");
          value="zoho";
      }
      return value;
   } 
   public HashMap<Integer,Integer> removeKey(){
     HashMap<Integer,Integer> map=createIntegerHashMap();
     System.out.println("Enter the key which you want to remove:");
     int removeKey=sc.nextInt();
      System.out.println("Hashmap elements before changes:");
           for(Map.Entry map1: map.entrySet()){    
                System.out.println(map1.getKey()+" "+map1.getValue());    
           } 
     int size=map.size();
     System.out.println("Size of the HashMap before changes:"+size);
     if(map.containsKey(removeKey)){
        map.remove(removeKey);
     }
     else{
       System.out.println("Given key is not existing");
     }
     return map;
   }
   public HashMap<String,String> removeMatchedValue(){
        HashMap<String,String> map=createStringHashMap();
         System.out.println("Enter the key which you want to remove:");
         String removedKey=sc.next();
         System.out.println("Enter the value for which you want to check matching:");
         String matchValue=sc.next();
         System.out.println("Hashmap elements before changes:");
           for(Map.Entry map2: map.entrySet()){    
                System.out.println(map2.getKey()+" "+map2.getValue());    
           } 
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
       if(map.containsKey(removedKey)){
            if(matchValue.equals(map.get(removedKey))){
                map.remove(removedKey);
            }
            else{
               System.out.println("Given value not matched with key value");
            }
       }
       else{
        System.out.println("Given key is not existing");   
       }
    return map;
   }
   public HashMap<String,Integer> replaceValue(){
         HashMap<String,Integer> map=createStringIntegerHashMap();
         System.out.println("Enter the key which you want to replace:");
         String replaceKey=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue=sc.nextInt();
         System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         int size=map.size();
         System.out.println("Size of the HashMap before changes:"+size);
         if(map.containsKey(replaceKey)){
              map.replace(replaceKey,replaceValue);
          }
         else{
        System.out.println("Given key is not existing");   
       }
    return map;
   } 
    public HashMap<String,Integer> replaceMatchedValue(){
          HashMap<String,Integer> map=createStringIntegerHashMap();
          System.out.println("Enter the key which you want to replace:");
         String replaceKey1=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue1=sc.nextInt();
         System.out.println("Enter the value for which you want to check matching:");
         int matchValue1=sc.nextInt();
          System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         int size=map.size();
         System.out.println("Size of the HashMap before changes:"+size);
         if(map.containsKey(replaceKey1)){
             if(matchValue1==map.get(replaceKey1)){
                 map.replace(replaceKey1,replaceValue1);
             }
             else{
                 System.out.println("Given value not matched with key value");
             }
          }
         else{
           System.out.println("Given key is not existing");   
       }
    return map;
   } 
  public HashMap<String,Integer> transferKeysValues(){
        HashMap<String,Integer> firstMap=createStringIntegerHashMap();
         HashMap<String,Integer> secondMap=createStringIntegerHashMap();
          System.out.println("Hashmap1 elements before changes:");
          for(Map.Entry hashMap1: firstMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int size1=firstMap.size();
          System.out.println("Size of the HashMap1 before changes:"+size1);
           System.out.println("Hashmap2 elements before changes:");
          for(Map.Entry hashMap1: secondMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int size2=secondMap.size();
          System.out.println("Size of the HashMap2 before changes:"+size2);
       secondMap.putAll(firstMap);
       System.out.println("Hashmap1 elements after changes:");
          for(Map.Entry hashMap: firstMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }
           int size=firstMap.size();
          System.out.println("Size of the HashMap1 after changes:"+size);
       return secondMap;
  }  
  public HashMap<String,Integer> iterateHashMap(){
         HashMap<String,Integer> map=createStringIntegerHashMap();
         return map;
  }
  public HashMap<String,Integer> removeAllEntries(){
         HashMap<String,Integer> map=createStringIntegerHashMap();
         System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
        map.clear(); 
        return map;
   }        
 }