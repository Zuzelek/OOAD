
public class GuitarSpec extends InstrumentSpec{
    private int numStrings;
    public int getNumStrings() {
        return numStrings;
    }



    public GuitarSpec(String model, Builder builder, Type type, Wood backWood, Wood topWood) {
        super(model, builder, type, backWood, topWood);
    }


    public boolean matches(GuitarSpec otherSpec) {
        return super.matches(otherSpec) && numStrings == otherSpec.getNumStrings();
    }
}
