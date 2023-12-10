package Week10.Events;

import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Events {

    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final int NUM_OF_RECORDS = 1000000;

    public static void generateEventsFile(String filename) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(filename)
        );

        Random random = new Random();
        for (int i = 0; i<NUM_OF_RECORDS; i++){
            int timestamp = random.nextInt(Integer.MAX_VALUE);
            String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];
            int userID = random.nextInt(1000);

            bufferedWriter.write(timestamp + ", " + eventType + ", " + userID);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    public static void readEventsFile(String  filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filename)
        );
        int iteration = 1;

        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        for(int i = 0; i<5; i++){
            for (String line : lines)
                System.out.println(line);
            iteration = (iteration%5) + 1;
        }

        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        String filename = "events.txt";

        generateEventsFile("events.txt");
        readEventsFile("events.txt");



    }
}
