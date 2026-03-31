interface DataExporter {

    void export();   // existing abstract method

    // new feature added later
    default void exportToJSON() {
        System.out.println("Exporting data to JSON format");
    }
}
