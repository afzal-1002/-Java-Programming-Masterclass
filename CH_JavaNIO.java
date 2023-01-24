import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CH_JavaNIO {


    public static void main(String[] args) throws IOException {
//        Map<String, Integer> exist = new HashMap<String, Integer>();
//        exist.put("S",1);
//        exist.put("E",2);
//        exist.put("W",3);
//        exist.put("N",4);
//
//        Location location1 = new Location(101, "South Time", exist);
//        Location location2 = new Location(102, "East Time", exist);
//        Location location3 = new Location(103, "West Time", exist);
//        Location location4 = new Location(103, "North Time", exist);
//
//        Map<Integer, Location> allLocation = new LinkedHashMap<Integer, Location>();
//        allLocation.put(01, location1);
//        allLocation.put(02, location2);
//        allLocation.put(03, location3);
//        allLocation.put(04, location4);

        Path path = FileSystems.getDefault().getPath("E:\\Exception Results.txt");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            if (line.trim().length() == 0) {

            } else {
                System.out.println(line.trim() + "" + line.length());
            }

        }


//        for (int i = 0; i <= allLocation.size() ; i++) {
//            System.out.println(allLocation.get(i)+ "" + allLocation.containsKey(i+1) );
//        }

//        for (Location loc : allLocation.values()){
//            System.out.println(loc + "" + loc.getExits());
//        }

    }
}


class Location implements Serializable {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    private final long serialVersionUID = 1L;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) {
            this.exits = new LinkedHashMap<String, Integer>(exits);
        } else {
            this.exits = new LinkedHashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new LinkedHashMap<String, Integer>(exits);
    }

    protected void addExit(String direction, int location) {
        exits.put(direction, location);
    }


    @Override
    public String toString() {
        return "Location{" +
                "locationID=" + locationID +
                ", description='" + description + '\'' +
                '}';
    }
}
