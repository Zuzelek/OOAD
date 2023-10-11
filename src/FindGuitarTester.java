import java.util.Iterator;
import java.util.List;


public class FindGuitarTester {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        // What the customer is looking for
        InstrumentSpec whatLookingFor = new InstrumentSpec(Builder.GIBSON, "Stratocastor",
                Type.ELECTRIC, NumStrings.TWELVE, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(whatLookingFor);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("You might like these: ");

            for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("We have a " + spec.getBuilder() +
                        " " + spec.getModel() + " " + spec.getType() + " guitar: " + guitar.getPrice());
            }
        } else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }



    private static void initialiseInventory(Inventory inventory) {
        GuitarSpec spec = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ACOUSTIC, NumStrings.TWELVE, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V00001", 1499.99, spec);

        spec = new Instrument(Builder.GIBSON, "Stratocastor", Type.ELECTRIC, NumStrings.TWELVE, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V00002", 1199.99, spec);

    }

    }
}
