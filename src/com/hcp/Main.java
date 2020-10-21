package com.hcp;

import com.google.gson.Gson;
import com.hcp.json.Event;
import com.hcp.json.Seg;
import com.hcp.json.YTJson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Path to the YouTube caption JSON: ");
        String path = scanner.nextLine();
        Gson gson = new Gson();
        YTJson jsonClass = gson.fromJson(new FileReader(path), YTJson.class);

        StringBuilder out = new StringBuilder();

        for (Event event: jsonClass.events) {
            if (event.segs == null) continue;
            for (Seg seg: event.segs) {
                if (seg.utf8 == null) continue;
                out.append(seg.utf8);
            }
        }

        System.out.println("Parse successful - enter the save file name: ");
        String outName = scanner.nextLine();

        FileWriter fileWriter = new FileWriter(outName);
        fileWriter.write(out.toString());
        fileWriter.close();
    }
}
