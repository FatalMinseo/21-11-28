import java.util.Random;
import java.util.Scanner;

public class Ex0002_���ٿ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~50 ������ ���ڸ� ���纸����.^^");
		int life = 5; // Ƚ�� ����
		System.out.println("��ȸ�� 5��");
		Random ran = new Random();

		int num = ran.nextInt(50) + 1;// 0~50 ������ ���ڸ� �������� ����
		int num3 = 0;
		int num4 = 51;
		int num2 = 0;
		while (num != num2 && life > 0) {
			num2 = sc.nextInt();
			if (num2 <= 50 && num2 >= 1) {

				if (num > num2) {
					if (num2 > num3) {
						System.out.println("UP!");
						System.out.println("��ȸ�� " + --life + "��");
					} else if (num2 <= num3) {
						System.out.println("MISSED!");
						System.out.println("��ȸ�� " + --life + "��");
					}
					num3 = num2;
				} else if (num < num2) {
					if (num2 < num4) {
						System.out.println("DOWN!");
						System.out.println("��ȸ�� " + --life + "��");
					} else if (num2 >= num4) {
						System.out.println("MISSED!");
						System.out.println("��ȸ�� " + --life + "��");
					}
					num4 = num2;
				} else if (num == num2) {
					System.out.println("CONGRATULATION!!!");
				}
			} else {
				System.out.println("MISSED!");
				System.out.println("��ȸ�� " + --life + "��");
			}
		}
		System.out.println("ANSWER : " + num);
		sc.close();
	}
}
