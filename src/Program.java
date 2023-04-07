import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		Champion A = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.next();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		
		Champion B = new Champion(name, life, attack, armor);
		System.out.println();
		
		System.out.print("Quantos turnos você deseja executar? ");
		int rounds = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < rounds; i++) {
			
			A.takeDamage(B.getAttack());
			B.takeDamage(A.getAttack());
			System.out.println("Resultado do turno " + (i + 1) + ":");
			System.out.println(A.status());
			System.out.println(B.status());
			System.out.println();
			
			if (A.getLife() <= 0 || B.getLife() <= 0) {
				i = rounds;
			}
			
		}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}

}
