import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Digest {
	public String md5Digest(String msg) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(msg.getBytes("UTF-8"), 0, msg.length());
		String md5 = DatatypeConverter.printHexBinary(md.digest());
		return md5;
	}
	
	public String sha1Digest(String msg) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		md.update(msg.getBytes("UTF-8"), 0, msg.length());
		String sha1 = DatatypeConverter.printHexBinary(md.digest());
		return sha1;
	}
	
	public String sha256Digest(String msg) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(msg.getBytes("UTF-8"), 0, msg.length());
		String sha256 = DatatypeConverter.printHexBinary(md.digest());
		return sha256;
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		Digest digest = new Digest();
		String msg = "String to digest";
		System.out.println("MD5 Digest: " + digest.md5Digest(msg));
		System.out.println("SHA-1 Digest: " + digest.sha1Digest(msg));
		System.out.println("SHA-256 Digest: " + digest.sha256Digest(msg));
	}
}
