

import java.io.*;
import java.util.*;

public class KisoKadati2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rnd = new Random();// RandomƒNƒ‰ƒX‚ÌƒCƒ“ƒXƒ^ƒ“ƒX‰»

		int end = 0;
		int ran = rnd.nextInt() % 101;// —”ì¬
		if (ran < 0) {// ‚à‚µ—”‚ªƒ}ƒCƒiƒX‚¾‚Á‚½‚ç-1‚ğ‚©‚¯‚Äƒvƒ‰ƒX‚É
			ran *= -1;
		}
		System.out.println("‚b‚o‚t‚ª‚P`‚P‚O‚O‚Ì”š‚ğƒ‰ƒ“ƒ_ƒ€‚Åì¬‚µ‚Ü‚·‚»‚ê‚ğ“–‚Ä‚Ä‚­‚¾‚³‚¢");
		System.out.println(ran);
		while (end == 0) {
			try {
				System.out.println("‚P`‚P‚O‚O‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢AI—¹‚·‚é‚Æ‚«‚Í1000‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
				String str = br.readLine();
				int nu = Integer.parseInt(str);
				if (nu == 1000) {
					break;
				}
				if (nu == ran) {
					System.out.println("³‰ğ‚Å‚·I");
					end = 1;
				} else if (nu > 100 || nu < 1) {
					System.out.println("‚P`‚P‚O‚O‚Ì”š‚ğ“ü‚ê‚Ä‚­‚¾‚³‚¢");
				} else if (nu > ran) {
					System.out.println("CPU‚ªì¬‚µ‚½”š‚Í‚à‚Á‚Æ¬‚³‚¢‚Å‚·");

				} else if (nu < ran) {
					System.out.println("CPU‚ªì¬‚µ‚½”š‚Í‚à‚Á‚Æ‘å‚«‚¢‚Å‚·");
				} 
			} catch (Exception e) {
				System.out.println("“ü—ÍƒGƒ‰[‚Å‚·");
			}
		}
		System.out.println("I—¹‚µ‚Ü‚µ‚½");
	}
}
