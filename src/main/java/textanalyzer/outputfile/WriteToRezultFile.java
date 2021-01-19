package textanalyzer.outputfile;

import java.io.*;

public class WriteToRezultFile {
    public static void saveToFile(String stringIn) throws IOException {

        String separator = File.separator;
        String pathToRezultFile = separator + "E:" + separator + "java_course" + separator + "src" + separator
                + "main" + separator + "java" + separator + "textanalyzer" + separator + "outputfile"
                + separator + "result.csv";
        File fileDestination = new File(pathToRezultFile);
        FileWriter fileWriter = new FileWriter(fileDestination,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(stringIn);
        bufferedWriter.close();
    }

}
