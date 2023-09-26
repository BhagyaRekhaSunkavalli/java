import java.io.*;
import java.util.*;
interface Language {
    void getName(String name);
}//interface end
class ProgrammingLanguage implements Language
{
public void getName(String name) {
        System.out.println("my faviourate programming language is "+name);
    }//method end
}//class end
public class InterfaceDemo {
    public static void main(String args[]) {
        ProgrammingLanguage PL =new ProgrammingLanguage();
        PL.getName("java");
    }//main method end
}//main class end
