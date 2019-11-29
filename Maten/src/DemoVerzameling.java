public class DemoVerzameling {
    public static void main(String[] args) {
        Verzameling verzameling = new Verzameling(10);
        System.out.println(verzameling.totaleOmtrek());
        System.out.println(verzameling.totaleOppervlakte());
        System.out.println(verzameling.totaalVolume());
    }

}
