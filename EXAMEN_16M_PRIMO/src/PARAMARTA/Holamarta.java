package PARAMARTA;

import java.util.Scanner;

public class Holamarta {
	public static void main(String[]args) {
		Scanner ent=new Scanner(System.in);
		System.out.println("Buenos días Ceinmark, soy Marta Gómez");
		System.out.println("Introduce un número para averiguar si es primo o no:");
		int numero=Integer.parseInt(ent.nextLine());
		int numerodivisores[]= new int[numero];
		int o=0;
		for(int i=1;i<=numero;i++) {
			if(numero/i==0) {
				numerodivisores[o]=i;
				o++;
			}
		}
		for(int i=0;i<numerodivisores.length;i++) {
			System.out.println(numerodivisores[i]);
		}
	}

}
