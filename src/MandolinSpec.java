public class MandolinSpec extends InstrumentSpec{
    private Style style;

    public MandolinSpec(String model, Builder builder, Type type, Wood backWood, Wood topWood) {
        super(model, builder, type, backWood, topWood);
    }
    public Style getStyle() {
        return style;
    }
    public boolean matches(MandolinSpec spec){
        return super.matches(spec);
    }
}
