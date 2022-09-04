import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.security.SecureRandom;
import java.util.logging.Logger;

public class Main {
	public static Logger logger = Logger.getLogger("Random Digit");
	
	public static void main(String[] args) {
		System.out.println("__________                    .___              \r\n"
				+ "\\______   \\_____    ____    __| _/____   _____  \r\n"
				+ " |       _/\\__  \\  /    \\  / __ |/  _ \\ /     \\ \r\n"
				+ " |    |   \\ / __ \\|   |  \\/ /_/ (  <_> )  Y Y  \\\r\n"
				+ " |____|_  /(____  /___|  /\\____ |\\____/|__|_|  /\r\n"
				+ "        \\/      \\/     \\/      \\/            \\/ ");
		System.out.println("_____.___.             .__ \r\n"
				+ "\\__  |   |____  _______|__|\r\n"
				+ " /   |   \\__  \\ \\___   /  |\r\n"
				+ " \\____   |/ __ \\_/    /|  |\r\n"
				+ " / ______(____  /_____ \\__|\r\n"
				+ " \\/           \\/      \\/   ");
		logger.info("Yazýlar yazilar.txt dosyasýna iþleniyor.");
		String easy = RandomString.digits + "AQWERTYUIOPLKJHGFDSZXCVBNMÝÜÖÇÐ0123456789qwertyuiopasdfghjklzxcvbnmçýöü.";
		for (int is = 0; is < Integer.MAX_VALUE; is++) {
			for (int i = 4; i < 17; i++) {
				try {
					RandomString tickets = new RandomString(i, new SecureRandom(), easy);				
				    String str = tickets.nextString();
				    Writer output;
				    output = new BufferedWriter(new FileWriter("yazilar.txt", true));  //clears file every time
				    output.append(str + System.lineSeparator());
				    output.close();	
				    logger.info(str + " -> " + i + " harfli random yazý eklendi.");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}	
		}
		logger.info("Ekleme iþlemi sona erdi :)");
		logger.info("program kapatýlýyor.");
	}
	
}
