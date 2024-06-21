package SplitPractice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        String str = "The tiger (Panthera tigris) is the largest living cat species and a member of the genus Panthera native to Asia. " +
                "It has a powerful, muscular body with a large head and paws, a long tail, and orange fur with black, mostly vertical stripes. " +
                "It is traditionally classified into nine recent subspecies, though some recognise only two subspecies, mainland Asian tigers and island tigers of the Sunda Islands.";

        /*
        separate above paragrapf in to sentences
        -count and print how many sentences there are
         */

        /*
        The tiger (Panthera tigris) is the largest living cat species and a member of the genus Panthera native to Asia. It has a powerful, muscular body with a large head and paws, a long tail, and orange fur with black, mostly vertical stripes. It is traditionally classified into nine recent subspecies, though some recognise only two subspecies, mainland Asian tigers and island tigers of the Sunda Islands.

Throughout the tiger's range, it inhabits mainly forests, from coniferous and temperate broadleaf and mixed forests in the Russian Far East and Northeast China to tropical and subtropical moist broadleaf forests on the Indian subcontinent and Southeast Asia. The tiger is an apex predator and preys mainly on ungulates such as deer and wild boar, which it takes by ambush. It lives a mostly solitary life and occupies home ranges, which it defends from individuals of the same sex. The range of a male tiger overlaps with that of multiple females with whom he mates. Females give birth to usually two or three cubs that stay with their mother for about two years. When becoming independent, they leave their mother's home range and establish their own.

Since the early 20th century, tiger populations have lost at least 93% of their historic range and are locally extinct in West and Central Asia, in large areas of China, and on the islands of Java and Bali. Today, the tiger's range is severely fragmented. It is listed as Endangered on the IUCN Red List of Threatened Species, as its range is thought to have declined by 53% to 68% since the late 1990s. Major reasons for this decline are habitat destruction and fragmentation due to deforestation, poaching for fur, and the illegal trade of tiger body parts for medicinal purposes. Tigers are also victims of human–wildlife conflict for attacking and preying on livestock in areas where natural prey is scarce. The species is legally protected in all range countries, which have ratified conservation action plans, established anti-poaching patrols and schemes for monitoring tiger populations.

The tiger is among the most popular of the world's charismatic megafauna. It has been kept in captivity since ancient times and has been trained to perform in circuses and other entertainment shows. The tiger featured prominently in the ancient mythology and folklore of cultures throughout its historic range and has continued to appear in culture worldwide.
         */
        String[] split = str.split("\\.");
        System.out.println(Arrays.toString(split));
        System.out.println(split.length);
        String strrr = " The tiger (Panthera tigris) is the largest living cat species and a member of the genus Panthera native to Asia. It has a powerful, muscular body with a large head and paws, a long tail, and orange fur with black, mostly vertical stripes. It is traditionally classified into nine recent subspecies, though some recognise only two subspecies, mainland Asian tigers and island tigers of the Sunda Islands.\n" +
                "\n" +
                "Throughout the tiger's range, it inhabits mainly forests, from coniferous and temperate broadleaf and mixed forests in the Russian Far East and Northeast China to tropical and subtropical moist broadleaf forests on the Indian subcontinent and Southeast Asia. The tiger is an apex predator and preys mainly on ungulates such as deer and wild boar, which it takes by ambush. It lives a mostly solitary life and occupies home ranges, which it defends from individuals of the same sex. The range of a male tiger overlaps with that of multiple females with whom he mates. Females give birth to usually two or three cubs that stay with their mother for about two years. When becoming independent, they leave their mother's home range and establish their own.\n" +
                "\n" +
                "Since the early 20th century, tiger populations have lost at least 93% of their historic range and are locally extinct in West and Central Asia, in large areas of China, and on the islands of Java and Bali. Today, the tiger's range is severely fragmented. It is listed as Endangered on the IUCN Red List of Threatened Species, as its range is thought to have declined by 53% to 68% since the late 1990s. Major reasons for this decline are habitat destruction and fragmentation due to deforestation, poaching for fur, and the illegal trade of tiger body parts for medicinal purposes. Tigers are also victims of human–wildlife conflict for attacking and preying on livestock in areas where natural prey is scarce. The species is legally protected in all range countries, which have ratified conservation action plans, established anti-poaching patrols and schemes for monitoring tiger populations.\n" +
                "\n" +
                "The tiger is among the most popular of the world's charismatic megafauna. It has been kept in captivity since ancient times and has been trained to perform in circuses and other entertainment shows. The tiger featured prominently in the ancient mythology and folklore of cultures throughout its historic range and has continued to appear in culture worldwide.";
        String[] split1 = strrr.split(" ");
        System.out.println(Arrays.toString(split1));

        for (String word : split1) {
            if(word.length()%2 != 0 ){
                System.out.println(word.charAt(word.length()/2));
            }

        }
        Scanner scr = new Scanner(System.in);
        Scanner scr1 = new Scanner(System.in);
        Scanner scr2 = new Scanner(System.in);
        Random random = new Random();
        String name = "John";
        int age = 21;
        boolean b = true;

        Object [] ab = {scr, random,name, age, b};
        Scanner[] ar = {scr,scr1,scr2};
    }
}
