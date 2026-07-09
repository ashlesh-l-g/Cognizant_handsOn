package design_patterns_and_principles.FactoryMethodPatternExample;

public class WordDocument implements Document {

    @Override
    public void open(){
        System.out.println("Opeaning Word Document");
    }
    
}
