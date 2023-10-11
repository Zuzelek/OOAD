public enum Type {
    ELECTRIC, ACOUSTIC;
    public String toString(){
        switch(this){
            case ELECTRIC: return "Electric";
            case ACOUSTIC: return "Acoustic";
            default: return "Acoustic";
        }
    }
}
