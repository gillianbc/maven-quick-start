package gillian.bladenclark;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
    public int countWords(String phrase){
        String[] separateWords = StringUtils.split(phrase," ");
        return (separateWords == null) ? 0 : separateWords.length;
    }
    public void greet(){
        //Generics only came into java at 1.7
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        greetings.add("Goodbye");

        for (String word : greetings) {
            System.out.println("Greeting " + word);
        }
    }
    // Constructor
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
        Application app = new Application();
        app.greet();
        System.out.println(app.countWords("I have four words"));
    }
}