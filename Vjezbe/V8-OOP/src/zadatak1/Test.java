package zadatak1;

public class Test {

    public static void main(String[] args) {

        String fileName = "src/zadatak1/randTekst.txt";
        String fileNameToWrite = "src/zadatak1/nova.txt";

        System.out.println("******************** Reading with Scanner *************************");
        FileHandling.readFileWithScanner(fileName);
        System.out.println("\n******************** Reading with Buffrdr *************************");
        FileHandling.readFileWithBufferedReader(fileName);
        System.out.println("\n******************** Writing to file *************************");
        FileHandling.write2File(fileNameToWrite);
        System.out.println("\n******************** Ask user for file name *************************");
        FileHandling.askUser4File();
    }
}
