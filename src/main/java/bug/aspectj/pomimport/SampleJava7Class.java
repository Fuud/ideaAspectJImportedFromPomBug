package bug.aspectj.pomimport;

import java.util.ArrayList;
import java.util.Collection;

public class SampleJava7Class {
    public static void main(String[] args) {
        Collection<String> data = new ArrayList<>();
        data.add("Hello World");
        for (String s : data) {
            System.out.println(s);
        }
    }
}
