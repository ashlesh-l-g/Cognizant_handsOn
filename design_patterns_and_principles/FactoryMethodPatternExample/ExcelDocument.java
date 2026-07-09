package design_patterns_and_principles.FactoryMethodPatternExample;

public class ExcelDocument implements Document {

    @Override
    public void open(){
        System.out.println("opeaning Excel Document");
    }
}
