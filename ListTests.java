import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


class TestChecker implements StringChecker{
    @Override
    public boolean checkString(String s){
        return(s.contains("w"));
    }
}
public class ListTests {
    @Test
    public void filterTest(){
        List<String> input1 = new ArrayList<String>();
        input1.add("water");
        input1.add("fire");
        input1.add("waterfall");
        input1.add("firefall");
        List<String> filteredInput1 = new ArrayList<>();
        filteredInput1.add("water");
        filteredInput1.add("waterfall");
        List<String> filteredOutput = ListExamples.filter(input1, new TestChecker());
        for(int i = 0; i < filteredInput1.size(); i++){
            assertEquals(filteredInput1.get(i), filteredOutput.get(i));
        }
    }
    @Test
    public void mergeTest(){

        List<String> input1 = new ArrayList<String>();
        input1.add("a");
        input1.add("c");

        List<String> input2 = new ArrayList<String>();
        input2.add("b");
        input2.add("d");

        List<String> mergedInputs = new ArrayList<>();
        mergedInputs.add("a");
        mergedInputs.add("b");
        mergedInputs.add("c");
        mergedInputs.add("d");
        List<String> mergedOutput = ListExamples.merge(input1, input2);
        for(int i = 0; i < mergedInputs.size(); i++){
            assertEquals(mergedInputs.get(i), mergedOutput.get(i));
        }
    }
}