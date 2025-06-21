package week1.designpatterns;

public class FactoryMethodPatternExample {

    interface Document {
        void open();
    }

    static class WordDocument implements Document {
        public void open() {
            System.out.println("Opening Word Document");
        }
    }

    static class PdfDocument implements Document {
        public void open() {
            System.out.println("Opening PDF Document");
        }
    }

    static class ExcelDocument implements Document {
        public void open() {
            System.out.println("Opening Excel Document");
        }
    }

    //  Abstract Factory
    abstract static class DocumentFactory {
        public abstract Document createDocument();
    }

    // concrete factory classes
    static class WordDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new WordDocument();
        }
    }

    static class PdfDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    static class ExcelDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new ExcelDocument();
        }
    }

    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}