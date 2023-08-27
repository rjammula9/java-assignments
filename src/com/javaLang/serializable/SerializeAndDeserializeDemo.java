package com.javaLang.serializable;
import java.io.*;

public class SerializeAndDeserializeDemo {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.i = 5;
        a.j = 10;
        a.s = "Hello from ClassC";
        a.classBInstance.l = 20;

        try {

            FileOutputStream fileOut = new FileOutputStream("serialized.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(a);
            out.close();
            fileOut.close();

            System.out.println("ClassA object serialized successfully.");

            // Deserialize
            FileInputStream fileIn = new FileInputStream("serialized.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ClassA deserializedA = (ClassA) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("ClassA object deserialized successfully.");

            // Print contents
            System.out.println("i: " + deserializedA.i);
            System.out.println("j: " + deserializedA.j); // Transient variable should have default value (0)
            System.out.println("s: " + deserializedA.s);
            System.out.println("l: " + deserializedA.classBInstance.l);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
