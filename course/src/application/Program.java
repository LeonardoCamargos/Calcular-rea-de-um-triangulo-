package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		//Chamando todas dependecias
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Chamando x e y
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com os lados do triangulo x");
		x.a = sc.nextDouble();
		x.b= sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os lados do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Chamando a função de calculo da area 
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("AREA DO TRIANGULO : %.4f%n", areaX);
		System.out.printf("AREA DO TRIANGULO : %.4f%n", areaX);
		
		if(areaX > areaY) {
			System.out.println("Larger area:  X");
		}
		else {
			System.out.println("Larger area:  y");
		}
		
		sc.close();
	}

}
