// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 8 Aufgabe 8-3
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class AddressFile {
    Scanner scr;
    String filename;

    public AddressFile (String filename){
        this.filename = filename;
    }

    public String toLine (Address addr){
        int id = addr.getId();
        String name = addr.getName();
        String street = addr.getStreet();
        int zipCode = addr.getZipCode();
        String city = addr.getCity();

        return id + ", " + name + ", " + street + ", " + zipCode + ", " + city;
    }

    public Address parseLine(String line) throws AddressFileException{
        scr = new Scanner(line).useDelimiter(",");
        if (!scr.hasNext()) throw new AddressFileException("Id not integer");
        int id = Integer.parseInt(scr.next().trim());
        if (!scr.hasNext()) throw new AddressFileException("name not String");
        String name = scr.next().trim();
        if (!scr.hasNext()) throw new AddressFileException("street not String");
        String street = scr.next().trim();
        if (!scr.hasNext()) throw new AddressFileException("ZIP not int");
        int zipCode = Integer.parseInt(scr.next().trim());
        if (!scr.hasNext()) throw new AddressFileException("City not String");
        String city = scr.next().trim();

       Address address = new Address(id, name, street, zipCode, city);
       return address;
    }

    public void save(ArrayList<Address> addresses) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(filename);
        for (int i = 0; i < addresses.size(); i++){
            Address address = addresses.get(i);
            printStream.println(toLine(address));
        }
        printStream.close();
    }

    public ArrayList<Address> load() throws FileNotFoundException, AddressFileException{
        ArrayList<Address> addresses = new ArrayList<Address>();
        File myObj = new File(filename);
        Scanner scr = new Scanner(myObj);
        while (scr.hasNextLine()) {
            String data = scr.nextLine();
            Scanner test = new Scanner(data).useDelimiter(",");
            addresses.add(parseLine(data));
        }
        return addresses;
    }
}
