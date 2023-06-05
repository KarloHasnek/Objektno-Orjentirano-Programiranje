import java.io.*;
import java.util.TreeMap;

public class SerDeserial {

    public static void saveUsr2File(String filePath, TreeMap<Integer, User> usrs){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(usrs);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("All saved to the file -> " + filePath+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readUsr4File(String filepath){

        File file = new File(filepath);
        if(!file.exists()){
            System.out.println("File does not exist!");
            return;
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(filepath);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                TreeMap<Integer, User> usrs = (TreeMap<Integer, User>) objectInputStream.readObject();

                objectInputStream.close();
                fileInputStream.close();

                System.out.println("<<<<<<<<<< All from file: >>>>>>>>>>>");
                for(User usr : usrs.values()){
                    usr.info();
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
