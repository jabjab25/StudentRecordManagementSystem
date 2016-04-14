/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author jb13abj
 */
public class Encrypt {
    private static String cipherName = "AES";
    private static byte[] keyValues = new byte[]{'d','g','3','d','7','j','a','6','9','f','r','u','4','d','g','3'};
    
    private static SecretKeySpec genKey(){
        SecretKeySpec key = new SecretKeySpec(keyValues,cipherName);
        return key;
    }
    public static String encrypt(String pWord) throws Exception
    {
        SecretKeySpec key = genKey();
        Cipher c = Cipher.getInstance(cipherName);
        c.init(Cipher.ENCRYPT_MODE,key);
        byte[] cipherText = c.doFinal(pWord.getBytes("UTF8"));
        String encPWord = new BASE64Encoder().encode(cipherText);
        return encPWord;
    }
    
    public static String decrypt(String encPWord) throws Exception
    {
        SecretKeySpec key = genKey();
        Cipher c = Cipher.getInstance(cipherName);
        c.init(Cipher.DECRYPT_MODE,key);
        byte[] decoded = new BASE64Decoder().decodeBuffer(encPWord);
        byte[] dVal = c.doFinal(decoded);
        String dText = new String(dVal);
        return dText;
    }
    
}
