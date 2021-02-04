package com.company.jones;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
double temperature;
        do {
            temperature=gatherTemp(input);

            sendTemp(toCelcius(temperature));
        } while (temperature >= -460);

    }
        public static double toCelcius ( double inputTemp){
            inputTemp -= 32;
            inputTemp *= 5;
            inputTemp /= 9;
            return inputTemp;

        }
        public static double gatherTemp (Scanner input){
            System.out.println("what temperature would you like to convert? type a number below negative 460 to quit;");
            return input.nextDouble();
        }
        public static void sendTemp ( double temperature){
            System.out.println("temp in celcius is "+temperature+" degrees celcius");
        }
    }

