

import java.io.*;
import java.util.*;

public class KisoKadati2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rnd = new Random();// Random�N���X�̃C���X�^���X��

		int end = 0;
		int ran = rnd.nextInt() % 101;// �����쐬
		if (ran < 0) {// �����������}�C�i�X��������-1�������ăv���X��
			ran *= -1;
		}
		System.out.println("�b�o�t���P�`�P�O�O�̐����������_���ō쐬���܂�����𓖂ĂĂ�������");
		System.out.println(ran);
		while (end == 0) {
			try {
				System.out.println("�P�`�P�O�O�̐�������͂��Ă��������A�I������Ƃ���1000����͂��Ă�������");
				String str = br.readLine();
				int nu = Integer.parseInt(str);
				if (nu == 1000) {
					break;
				}
				if (nu == ran) {
					System.out.println("�����ł��I");
					end = 1;
				} else if (nu > 100 || nu < 1) {
					System.out.println("�P�`�P�O�O�̐��������Ă�������");
				} else if (nu > ran) {
					System.out.println("CPU���쐬���������͂����Ə������ł�");

				} else if (nu < ran) {
					System.out.println("CPU���쐬���������͂����Ƒ傫���ł�");
				} 
			} catch (Exception e) {
				System.out.println("���̓G���[�ł�");
			}
		}
		System.out.println("�I�����܂���");
	}
}
