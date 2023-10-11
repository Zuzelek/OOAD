public enum Style {
    a, f;
    public String toString() {
         switch (this){
             case a: return "A";
             case f: return "B";

             default: return "A";
         }
    }
}
