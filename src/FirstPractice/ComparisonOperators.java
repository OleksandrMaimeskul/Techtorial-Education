package FirstPractice;

public class ComparisonOperators {
    public static void main(String[] args) {
        int flower = 13, vase = 12;
        System.out.println(flower == vase);
        boolean b = flower == vase;
        System.out.println(b == false);

        boolean isFunny = true, result2 = isFunny == b;
        System.out.println(isFunny == !result2);

        // >< greater or less

        boolean result3 = flower > vase;

        System.out.println(result3);
        System.out.println(vase > flower);
        System.out.println(4 > 4);
        System.out.println(flower-- > vase);
        System.out.println(flower > vase);
        System.out.println("-----------");
        System.out.println(--flower < vase);
        System.out.println(300 < 300);
        System.out.println("-----------");
        System.out.println('a' < 'A');


        // >= <= greater / less than or equal /
        System.out.println(6>=6);
        System.out.println(5>=7);
        System.out.println(6>=1);

        boolean result4 = flower >= vase;

        System.out.println(result4);

        System.out.println(flower<=vase);


        //!=

        boolean isCherry = true, isBlue = !isCherry;
        boolean result5 = isCherry != isBlue;
        System.out.println(result5);

        System.out.println(!result5 != !isBlue);


    }
}
