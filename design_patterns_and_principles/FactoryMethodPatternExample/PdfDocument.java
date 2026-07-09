package design_patterns_and_principles.FactoryMethodPatternExample;

public class PdfDocument implements Document {
    
    @Override
    public void open(){
        System.out.println("Opeaning PDF Document");
    }
}
