import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Inventory {
    private List guitars;
    public Inventory(){
        guitars = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){

        Guitar guitar = new Guitar(serialNumber,price,spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); ((Iterator) i).hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }


    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();


        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if(guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
            GuitarSpec guitarSpec = guitar.getSpec();

            if(searchSpec.getBuilder() != guitarSpec.getBuilder())
                continue;
            String model = searchSpec.getModel().toLowerCase();

            if((model != null) && (!model.equals(""))&&(!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;
            if(searchSpec.getType()!= guitarSpec.getType())
                continue;
            if(searchSpec.getBackWood()!= guitarSpec.getBackWood())
                continue;
            if(searchSpec.getTopWood()!= guitarSpec.getTopWood())
                continue;

                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
    public List searchMandolin(MandolinSpec searchSpec) {
        List matchingGuitars = new LinkedList();


        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if(guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
            GuitarSpec guitarSpec = guitar.getSpec();

            if(searchSpec.getBuilder() != guitarSpec.getBuilder())
                continue;
            String model = searchSpec.getModel().toLowerCase();

            if((model != null) && (!model.equals(""))&&(!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;
            if(searchSpec.getType()!= guitarSpec.getType())
                continue;
            if(searchSpec.getBackWood()!= guitarSpec.getBackWood())
                continue;
            if(searchSpec.getTopWood()!= guitarSpec.getTopWood())
                continue;

            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }


}
