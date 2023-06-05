package zadatak1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ObjectsHandling {

    public static <T> void saveObj2File(String fullPath, List<T> objcts) {

        File file = new File(fullPath);

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objcts);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> read4File(String fullPath) {

        File file = new File(fullPath);
        ArrayList<T> objects = new ArrayList<>();

        try(FileInputStream fis = new FileInputStream(file)) {

            ObjectInputStream ois = new ObjectInputStream(fis);

            T ob = (T) ois.readObject();
            System.out.println(ob.toString());
            System.out.println(ob.getClass().getCanonicalName());
            objects.addAll((Collection<? extends T>) ob);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        for (T object : objects) {
            System.out.println(object.toString());
        }
        return objects;
    }
}
