package task3;

    import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {
            Florist fl= new Florist("Роза",50,5,100);
            Florist fl_0= new Florist("Орхідея",40,4,95);
            Florist fl1= new Florist("Лілія",60,6,80);
            Florist fl1_0= new Florist("Гортензія",50,4,75);
            Florist fl2= new Florist("Ромашка",25,10,50);
            Florist fl2_0= new Florist("Іріс",20,5,45);
            Florist fl_1 = new Florist(40,"Кольорова бумага");
            Florist fl_2 = new Florist(30,"Прозора бумага");
            Florist fl_3 = new Florist(10,"Без упаковки, звязаний тоненькою стрічкою");

            Florist[] first = new Florist[]{fl,fl1,fl2,fl_1};
            Florist[] second = new Florist[]{fl_0,fl2_0,fl1_0,fl1,fl, fl_2};
            Florist[] third = new Florist[]{fl,fl2_0,fl1_0,fl1,fl_0, fl_3};

            Florist[][] florist = {first, second, third };

            int temp = 1;
            for (Florist[] florists : florist) {
                System.out.println("Букет " + temp + ": ");
                getPrice(florists);
                Arrays.sort(florists);
                System.out.println(Arrays.toString(florists));
                findLength(florists, 75, 75);
                System.out.println("_____________________________________");
                temp++;
            }
        }

        static void findLength(Florist[] florists, int begin, int end){

            for (Florist florist : florists) {
                if (florist.getLength() >= begin && florist.getLength() <= end) {
                    System.out.println(florist.getName() + " довжина  " + florist.getLength());
                }
            }
        }

        public static void getPrice(Florist[] florists){
            int price = 0;
            for (Florist florist : florists) {
                if (florist.getName() == null) {
                    System.out.println(florist.getAccessory());
                } else {
                    System.out.println(florist.getName());
                }
                price += florist.getPrice();
            }
            System.out.println("Вартість букету = " + price);
        }
    }

