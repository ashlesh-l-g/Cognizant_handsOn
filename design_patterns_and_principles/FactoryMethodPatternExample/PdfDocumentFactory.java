package design_patterns_and_principles.FactoryMethodPatternExample;

public class PdfDocumentFactory extends DocumentFactory{
    
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
