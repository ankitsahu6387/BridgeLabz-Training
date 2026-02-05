public class Main {
    public static void main(String[] args) {
        DataExporter csv = new CSVExporter();
        csv.export();
        csv.exportToJSON(); // works without modifying CSVExporter

        DataExporter pdf = new PDFExporter();
        pdf.export();
        pdf.exportToJSON();
    }
}
