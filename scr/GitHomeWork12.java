import java.util.Arrays;
import java.util.Scanner;
public class GitHomeWork12 {
        public static void main(String[] args) {

            int[] computerLotteryNumbers = generateRandomArray(7);
            int[] playerNumbers = PlayerInput();

            Arrays.sort(computerLotteryNumbers);
            Arrays.sort(playerNumbers);

            System.out.println(Arrays.toString(computerLotteryNumbers));
            System.out.println(Arrays.toString(playerNumbers));

            int numbersMatches = countMatches(computerLotteryNumbers, playerNumbers);

            System.out.println("Кількість збігів: " + numbersMatches);
        }

        public static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 10);
            }
            return array;
        }

        public static int[] PlayerInput() {
            Scanner scanner = new Scanner(System.in);
            int[] playerNumbers = new int[7];

            System.out.println("Введіть 7 чисел (від 0 до 9): ");

            for (int i = 0; i < playerNumbers.length; i++) {
                while (true) {
                    try {
                        playerNumbers[i] = scanner.nextInt();
                        if (playerNumbers[i] >= 0 && playerNumbers[i] <= 9)
                        {
                            break;
                        } else {
                            System.out.println("Невірно. Введіть число між 0 до 9.");
                        }

                    } catch (Exception e) {
                        System.out.println("Треба ввести цифру.");
                        scanner.next();
                    }
                }
            }

            return playerNumbers;
        }
        public static int countMatches(int[] array1, int[] array2) {
            int count = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    count++;
                }
            }
            return count;
        }
    }