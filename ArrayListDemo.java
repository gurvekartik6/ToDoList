import java.io.*;
import java.util.*;
public class ArrayListDemo{
    public static void main(String []args){
        ArrayList<String> listLanguages = new ArrayList<>();
        //First method : add
        listLanguages.add("C");
        listLanguages.add("C++");
        listLanguages.add("Java");
        listLanguages.add("Python");
        listLanguages.add("PHP");
        listLanguages.add("GO");
        //Inserting Element at specified Index
        listLanguages.add(3,"Swfit");
        listLanguages.add(4,"Rust");
        //Changing the existing element
        listLanguages.set(1,"C#");
        listLanguages.set(2,"COBOL");
        //Remove the element from the list
        listLanguages.remove(1);
        listLanguages.remove(4);
        //To display the list 
        System.out.println("List :"+listLanguages);
        //using for loop
        for(int i = 0 ; i < listLanguages.size() ; i++){
            System.out.println(listLanguages.get(i));
        }
    }
}