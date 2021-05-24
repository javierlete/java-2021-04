package com.ipartek.formacion;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class PasswordsEncriptadas {
	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
		String password = "prueba";
		
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[16];
		random.nextBytes(salt);
		
		byte[] salCodificada = Base64.getEncoder().encode(salt);
		String sal = new String(salCodificada);
		System.out.println(sal);
		
		for (int i = 0; i < 5; i++) {
			KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
			byte[] hash = factory.generateSecret(spec).getEncoded();
			
			byte[] encoded = Base64.getEncoder().encode(hash);
			String passwordCodificada = new String(encoded);
			System.out.println(passwordCodificada);
		}
	}
}
