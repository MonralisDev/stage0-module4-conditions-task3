package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            if ((character == 'a' || character == 'A') ||
                (character == 'E' || character == 'e') ||
                (character == 'I' || character == 'i') ||
                (character == 'O' || character == 'o') ||
                (character == 'U' || character == 'u')) {
                System.out.println("Vowel");
            }
            else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
