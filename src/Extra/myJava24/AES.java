/*package myJava24;

//package DBHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class AES {
    public static void main(String[] args) {
        try {
            System.out.println(
            decrypt(encrypt("hello 123")));
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }

    public static SecretKeySpec getKeySpec() throws IOException, NoSuchAlgorithmException {
        byte[] bytes = new byte[16];
        File f = new File("key.ks");
        SecretKey key = null;
        SecretKeySpec spec = null;
        if (f.exists()) {
            new FileInputStream(f).read(bytes);
        } else 
        {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128);
            key = kgen.generateKey();
            bytes = key.getEncoded();
            new FileOutputStream(f).write(bytes);
        }
        spec = new SecretKeySpec(bytes, "AES");
        return spec;
    }

    public static String encrypt(String text) throws Exception {
        SecretKeySpec spec = getKeySpec();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, spec);
        BASE64Encoder enc = new BASE64Encoder();
        String ret = enc.encode(cipher.doFinal(text.getBytes()));
        System.out.println(ret);
        return ret;
    }

    public static String decrypt(String text) throws Exception {
        SecretKeySpec spec = getKeySpec();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, spec);
        BASE64Decoder dec = new BASE64Decoder();
        return new String(cipher.doFinal(dec.decodeBuffer(text)));
    }
}
*/