public enum NumStrings {
    TWELVE,
    SIX;

    public String toString() {
        switch (this) {
            case TWELVE:
                return "Twelve";
            case SIX:
                return "Six";
            default:
                return "Twelve";
        }
    }
}