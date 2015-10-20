

import java.io.*;
public class KisoKadai3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�ǂ��̃��\�b�h�ł�readLine���g�����߂����Ő錾
	public static void main(String[] args) {
		String str = ""; //�p�X���܂߂��t�@�C������ۑ�
		int No = 0; //�t�@�C���ɑ΂��閽�߂�ۑ�

		str = create(str); //�t�@�C���w��̃��\�b�h�Ăяo��
		//�I����4�����͂����܂Ń��[�v
		while(No != 4){
			String filename = new File(str).getName(); //���ݎw�肳��Ă���t�@�C�������擾
			System.out.println("���݊J����Ă���t�@�C�� : " + filename); //���ݎw�肳��Ă���t�@�C�����\��
			No = menu(); //�t�@�C���ɉ������邩���͂����߂郁�\�b�h�Ăяo��
			switch(No){
			case 1:filewrite(str); break; //�������݃��\�b�h�̌Ăяo��
			case 2:fileread(str); break; //�ǂݍ��݃��\�b�h�̌Ăяo��
			case 3:str = create(str); break; //�t�@�C���̎w�胁�\�b�h�̌Ăяo��
			case 4:System.out.println("�I�����܂�"); break; //�S�Ă̑�����I��
			default:System.out.println("�w����̐�������͂��Ă�������"); break; //1����4�ȊO�̐��������͂��ꂽ��
			}
		}
	}

	static int menu(){//��ԍŏ��̃��j���[���
		int x = 0; //����I����������ۑ�
		try{
			System.out.println("1:��������  2:�ǂݍ���  3:�t�@�C���̍Ďw��  4:�I��");
			System.out.print("���s���e�𐔎��œ��͂��Ă������� : ");
			x = Integer.parseInt(br.readLine());
		}catch(Exception e){
			System.out.println("�w�肳��Ă��鐔������͂��Ă�������");
		}
		return x; //�w�肳�ꂽ�I����Ή����Ă��鐔���ŕԂ�
	}

	static String create(String st){ //�t�@�C�����w��
		try{
			System.out.println("�ȉ��̂悤�Ƀt�@�C�������L�ڂ��Ă�������");
			System.out.println("�� - C:/Users//internous//test.txt");
			st = br.readLine(); //�t�@�C�����ƃp�X���擾
		}catch(Exception e){
			System.out.println(e);
		}
	    File file = new File(st); //�t�@�C���̑��݃`�F�b�N�A�쐬�p
		File dir = new File(file.getParent()); //�f�B���N�g���̑��݃`�F�b�N�A�쐬�p
		if(dir.exists()){ //�f�B���N�g�������݂��Ă��邩�`�F�b�N
			System.out.println("�f�B���N�g�������݂��܂�");
		}else{
			System.out.println("�V�����f�B���N�g�����쐬���܂�");
			dir.mkdir(); // �f�B���N�g���쐬
		}
		if(file.exists()){ //�t�@�C�������݂��Ă��邩�`�F�b�N
			System.out.println("�t�@�C�����J���܂�");
		}else{
			System.out.println("�V�����t�@�C�����쐬���܂�");
			try{
				file.createNewFile(); //�t�@�C���쐬
			}catch(Exception e){
				System.out.println("Error");
				System.out.println("�t�@�C���̍Ďw����s���Ă�������");
			}
		}
		return st; //�L�ڂ����t�@�C�����ƃp�X��Ԃ�
	}

	static void filewrite(String st){//�������ݗp
		int x = 0; //�I���̕ۑ��p
		while(x != 3){
			try{
				System.out.println("�������ݕ��@���w�肵�Ă�������");
				System.out.print("1:�㏑��    2:�ǋL   3:�I��    :  ");
				x = Integer.parseInt(br.readLine());
				String filestr = ""; //���͕�����̕ۑ�
				if(x == 1){//�㏑��
					FileWriter fileuwagaki = new FileWriter(new File(st)); //�p�X�Ɏw�肳�ꂽ�t�@�C���ɏ������݂��s���錾
					System.out.print("���͓��e:");
					filestr = br.readLine();
					fileuwagaki.write(filestr + "\r\n"); //���͂��ꂽ��������㏑��   //���s���@ Windows=\r\n  Linux=\n
					fileuwagaki.close();
				}else if(x == 2){//�ǋL
					FileWriter filetuiki = new FileWriter(new File(st),true); //true�����邱�ƂŎw��t�@�C���ɒǋL�ł���
					System.out.print("���͓��e:");
					filestr = br.readLine();
					filetuiki.write(filestr + "\r\n");
					filetuiki.close();
				}else if(x == 3){//�I��
					System.out.println("�������݂��I�����܂�");
				}else{//�w��O�̐��������͂��ꂽ��
					System.out.println("�w����̐�������͂��Ă�������");
				}
			}catch(Exception e){
				System.out.println("�w����̐�������͂��Ă�������");
			}
		}
	}

	static void fileread(String st){//�ǂݍ���
		try{
			BufferedReader fileread = new BufferedReader(new FileReader(new File(st))); //�w��t�@�C�����܂Ƃ߂ēǂݍ���
			String readstr = "";
			System.out.println("---" + st + "-----"); //�ǂݍ��݊J�n
			while((readstr = fileread.readLine()) != null){ //�ォ��1�s���ǂݍ���ŕ\���B���g��null(�Ȃɂ������ĂȂ�)�ɂȂ�����I��
				System.out.println(readstr);
			}
			System.out.println("---------------------------------"); //�ǂݍ��ݏI��
			fileread.close();
		}catch(Exception e){
			System.out.println("Error");
		}
	}
} 
