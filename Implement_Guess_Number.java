
import java.util.*;

public class Implement_Guess_Number {
    public static void main(String[] args) {
        System.out.print("Enter number of digits: ");
        Scanner scan = new Scanner(System.in);
        int estimatedOnes,estimatedTens,estimatedHundreds,estimatedThousands, guess;
        int digitsNumber = scan.nextInt();
        // We create random number four times until 10 as a digit. 
        Random rnd = new Random();
        int randomThousands = rnd.nextInt(10);
        int randomHundreds = rnd.nextInt(10);
        int randomTens = rnd.nextInt(10);
        int randomOnes = rnd.nextInt(10);
        if(digitsNumber == 3 || digitsNumber == 4){
            while(randomOnes == randomTens || randomOnes == randomHundreds || randomOnes == randomThousands || randomTens == randomHundreds || randomHundreds == randomThousands || randomThousands == 0 || randomTens == randomThousands){
                randomThousands = rnd.nextInt(10);
                randomHundreds = rnd.nextInt(10);
                randomTens = rnd.nextInt(10);
                randomOnes = rnd.nextInt(10);
                if(digitsNumber == 3 && randomHundreds == 0){
                    randomHundreds = rnd.nextInt(10);
                }
            }
        }
        guess = scan.nextInt();
        while(digitsNumber == 3 || digitsNumber == 4){
            
            estimatedThousands = guess / 1000;
            estimatedHundreds = guess / 100 % 10;
            estimatedTens = guess / 10 % 10;
            estimatedOnes = guess % 10;
            if(digitsNumber == 3){
                if(estimatedHundreds == randomHundreds && estimatedTens == randomTens && estimatedOnes == randomOnes){
                    System.out.print("You Found The Number !");
                    break;
                }
                if(estimatedHundreds == randomHundreds){
                    System.out.print("+");
                }else if(estimatedHundreds == randomTens || estimatedHundreds == randomOnes){
                    System.out.print("-");
                }
                if(estimatedTens == randomTens){
                    System.out.print("+");
                }else if(estimatedTens == randomHundreds || estimatedTens == randomOnes){
                    System.out.print("-");
                }
                if(estimatedOnes == randomOnes){
                    System.out.print("+");
                }else if(estimatedOnes == randomHundreds || estimatedOnes == randomTens){
                    System.out.print("-");
                }
                if(estimatedHundreds != randomHundreds && estimatedHundreds != randomTens && estimatedHundreds != randomOnes && estimatedTens != randomTens && estimatedTens != randomOnes && estimatedTens != randomHundreds && estimatedOnes != randomOnes && estimatedOnes != randomTens && estimatedOnes != randomHundreds){
                    System.out.println("No Match.");    
                }
                System.out.println();
                guess = scan.nextInt();
            }
            else if(digitsNumber == 4){
                if(estimatedThousands == randomThousands && estimatedHundreds == randomHundreds && estimatedTens == randomTens && estimatedOnes == randomOnes){
                    System.out.print("You Found The Number !");
                    break;
                }
                if(estimatedThousands == randomThousands){
                    System.out.print("+");
                }else if(estimatedThousands == randomHundreds || estimatedThousands == randomTens || estimatedThousands == randomOnes){
                    System.out.print("-");
                }
                if(estimatedHundreds == randomHundreds){
                    System.out.print("+");
                }else if(estimatedHundreds == randomThousands || estimatedHundreds == randomTens || estimatedHundreds == randomOnes){
                    System.out.print("-");
                }
                if(estimatedTens == randomTens){
                    System.out.print("+");
                }else if(estimatedTens == randomHundreds || estimatedTens == randomOnes || estimatedTens == randomThousands){
                    System.out.print("-");
                }
                if(estimatedOnes == randomOnes){
                    System.out.print("+");
                }else if(estimatedOnes == randomHundreds || estimatedOnes == randomTens || estimatedOnes == randomThousands){
                    System.out.print("-");
                }
                if(estimatedOnes != randomOnes && estimatedOnes != randomTens && estimatedOnes != randomHundreds && estimatedOnes != randomThousands && estimatedTens != randomOnes && estimatedTens != randomTens && estimatedTens != randomHundreds && estimatedTens != randomThousands && estimatedHundreds != randomOnes && estimatedHundreds != randomTens && estimatedHundreds != randomHundreds && estimatedHundreds != randomThousands && estimatedThousands != randomOnes && estimatedThousands != randomTens && estimatedThousands != randomHundreds && estimatedThousands != randomThousands){
                    System.out.print("No Match.");
                }
                System.out.println();
                guess = scan.nextInt();
            }
        }
        scan.close();
    }
}