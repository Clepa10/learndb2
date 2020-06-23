package other;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ChangeDBFile {

    private ArrayList<String> filesName;

    public ChangeDBFile(ArrayList<String> filesName) {
        this.filesName = filesName;
    }

//    public static void main(String[] args) throws IOException {
//        ArrayList<String> list = new ArrayList<>();
//        list.add(".\\src\\main\\java\\data\\huy.java");
//        ChangeDBFile changeDBFile = new ChangeDBFile(list);
//        changeDBFile.changeNewDB();
//    }

    public void changeNewDB(String oldName, String newName) throws IOException {
        for (String file : filesName) {

            String str = Files.readString(Paths.get(file));
            System.out.println("Huy   " + str);

            str = str.replace(oldName, newName);

            FileWriter fr = new FileWriter(file); // After '.' write

            fr.write(str);
            fr.close();
        }

    }

    public String newString(String string) {

        return null;
    }
}
