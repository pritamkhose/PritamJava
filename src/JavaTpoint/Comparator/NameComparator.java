package JavaTpoint.Comparator;

import java.util.*;  
abstract class NameComparator implements Comparator{  
public int Compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
return s1.name.compareTo(s2.name);  
}

}  