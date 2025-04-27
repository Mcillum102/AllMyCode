package PracticeMock;

import java.util.*;

public class Recipients {
    private ArrayList<String> lines;

    public Recipients() {
        lines = new ArrayList<String>();
    }

    public String extractCity(String cityZip) {
        // how to find index of comma?
        int end = cityZip.indexOf(",");
        return cityZip.substring(0, end);
    }

    public String getAddress(String name) {
        String address = "";
        for (int i = 0; i < lines.size(); i++) {
            String item = lines.get(i);
            if (item.equals(name)) {
                int x = i+1;
                while (!lines.get(x).equals("")) {
                    address += lines.get(x) + "\n";
                    x++;
                }
                break;
            }
        }
        return address;
    }

    
}
