public class RunDemo {
    public static void main(String[] args) {
            Vermenigvuldigbaar procuct = new Vermenigvuldigbaar() {
                @Override
                public int vermenigvuldig(int eersteInteger, int tweedeInteger) {
                    return eersteInteger * tweedeInteger;
                }
            };
            System.out.println(procuct.vermenigvuldig(3, 5));
            System.out.println(procuct.kwadraat(4));
            System.out.println(procuct.derdeMacht(3));
        }
    }
