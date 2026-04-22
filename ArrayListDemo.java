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
        //To display the list 
        System.out.println("List :"+listLanguages);
    }
}