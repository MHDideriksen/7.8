import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        //Konsollen skal udskrive 10 tal

        System.out.println("Skriv 10 tal");

        // Her importeres der en ny scanner
        Scanner input = new Scanner(System.in);

        //En liste som indholder værdien double af 10
        double[] numbers = new double[10];
        // Her laves "for" loopet
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }

        System.out.println("Gennemsnittet er " + average(numbers));

    }

    public static int average(int[]array){
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        { sum += array[i];
        }

        //Her viser den summen divideret med array

        return sum / array.length;

}

public static double average (double[] array)
{double sum = 0;
for (int i = 0; i < array.length; i++){
    sum += array [i];

}
return sum / array.length;

}
}