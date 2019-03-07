
/**
 * Uses string classes to analyze and modify quote from Benjamin Franklin.
 *
 * @author (Ryan Kim)
 * @version (2-4-2019)
 */
public class StringManips
{
    public static void main(String[] args) 
    {
        String bFranklin = "A penny saved is a penny earned";
        char first, last;
        int phraseLength;
        String byBen = bFranklin + ": By Benjamin Franklin";
        phraseLength = bFranklin.length();
        first = bFranklin.charAt(0);
        last = bFranklin.charAt(phraseLength-1);
        System.out.println("Programmer: Ryan Kim");
        System.out.println("Course:     COSC 111, Winter 2019");
        System.out.println("Lab#:       2, part #1");
        System.out.println("Due date:   2-4-2019\n");
        System.out.println("bFranklin = " + bFranklin);
        System.out.println("phraseLength = " + phraseLength);
        System.out.println("first = " + first + "           last = " + last);
        System.out.println(bFranklin.toUpperCase() + " " + bFranklin.toLowerCase());
        System.out.println("byBen = " + byBen);
        System.out.println(byBen.substring(byBen.lastIndexOf("penny")).toUpperCase());
    }
}
/*
Programmer: Ryan Kim
Course:     COSC 111, Winter 2019
Lab#:       2, part #1
Due date:   2-4-2019

bFranklin = A penny saved is a penny earned
phraseLength = 31
first = A           last = d
A PENNY SAVED IS A PENNY EARNED a penny saved is a penny earned
byBen = A penny saved is a penny earned: By Benjamin Franklin
PENNY EARNED: BY BENJAMIN FRANKLIN
*/