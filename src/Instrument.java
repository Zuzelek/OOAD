public class Instrument {
    private String serialNumber;
    private double price;

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public InstrumentSpec getSpec(InstrumentSpec spec){

        return spec;
    }
}
