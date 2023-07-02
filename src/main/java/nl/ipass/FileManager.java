package nl.ipass;

import nl.ipass.model.Reis;
import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static ArrayList<Reis> ReadReis() {

        try {

            // Read Reizen array from file.
            FileInputStream fis = new FileInputStream("reizen.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Reis> reizenFromSavedFile = (ArrayList<Reis>) ois.readObject();
            ois.close();

            return reizenFromSavedFile;

        } catch (Exception e) {
            e.getStackTrace();
        }
        return null;
    }

    public static void WriteReis(ArrayList<Reis> reizen) {

        try {

            // Write Reizen array to file.
            FileOutputStream fos = new FileOutputStream("reizen.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(reizen);
            oos.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}