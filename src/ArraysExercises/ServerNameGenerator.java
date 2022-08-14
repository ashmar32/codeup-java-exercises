package ArraysExercises;

import java.util.Random;

public class ServerNameGenerator {
    private static Random random = new Random();

    public static String[] adjectives = {"giddy", "serendipitous", "eager", "austere", "idyllic", "unique", "stupendous", "thicc", "fire", "cosmic"};
    public static String[] nouns = {"lung", "cello", "abode", "tesla", "honda", "pheasant", "toe", "flier", "commons", "flashlight"};

    public static void main(String[] args) {
        String randomAdjective = getRandomStringFromArray(adjectives);
        String randomNoun = getRandomStringFromArray(nouns);
        System.out.println("Server Name is: " + randomNoun + " - "+ randomAdjective);
    }

    public static String getRandomStringFromArray(String[] strings) {
        int rando = random.nextInt(strings.length);
        return strings[rando];
    }

}

