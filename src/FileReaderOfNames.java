import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderOfNames {

    public static ArrayList<String> ListOfNamesAndTrash() {
        ArrayList<String> list = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("C:\\Users\\slaki\\Desktop\\Drivers\\База данных имен и фамилий в формате CSV\\foreign_names.CSV");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }

            fileReader.close();
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static ArrayList<String> ListOfNames(ArrayList<String> list) {
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String [] lines = list.get(i).split(";");
            names.add(lines[1]);
        }
        names.remove(0);

        return names;
    }
}
