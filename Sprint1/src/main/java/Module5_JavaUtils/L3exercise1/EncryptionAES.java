package Module5_JavaUtils.L3exercise1;

import javax.crypto.*;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EncryptionAES {

   public static void encrypt(String file1){
       try {
           KeyGenerator key = KeyGenerator.getInstance("AES");
           SecretKey secretKey = key.generateKey();
           Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
           cipher.init(Cipher.ENCRYPT_MODE, secretKey);
           FileInputStream utilsFile = new FileInputStream(file1);
           FileOutputStream filesEncrypted = new FileOutputStream("encryptedFiles.txt");
           CipherInputStream utilsCipher = new CipherInputStream(utilsFile, cipher);
           byte[] data = new byte[100];
           int i = utilsCipher.read(data);
           while (i != -1){
               filesEncrypted.write(data, 0, i);
               i = utilsCipher.read(data);
           }
           utilsFile.close();
           filesEncrypted.close();
           utilsCipher.close();

           FileInputStream encryptedFile = new FileInputStream("encryptedFiles.txt");
           FileOutputStream decryptedOutput = new FileOutputStream("decryptedFiles.txt");
           Cipher cipherDecrypt = Cipher.getInstance("AES/ECB/PKCS5Padding");
           cipherDecrypt.init(Cipher.DECRYPT_MODE, secretKey);
           CipherInputStream decryptedFile = new CipherInputStream(encryptedFile, cipherDecrypt);

           i = decryptedFile.read(data);
           while (i != -1){
               decryptedOutput.write(data, 0, i);
               i = decryptedFile.read(data);
           }
           BufferedReader decryptionBuffer = new BufferedReader(new FileReader("decryptedFiles.txt"));
           String line;
           while((line = decryptionBuffer.readLine()) != null){
               System.out.println(line);
           }
           decryptedFile.close();
           encryptedFile.close();
           decryptedOutput.close();
           decryptionBuffer.close();

       } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException
                | IOException err){
           System.out.println(err.getMessage());
       }
   }
}
