package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		demoFirst();
	}

	public static void showMaps(Map<String, String> cookies) {
		System.out.println();
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		System.out.println();
	}

	public static void demoFirst() {
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "997812233");
		showMaps(cookies);

		System.out.println("Remove cookie : email");
		cookies.remove("email");
		showMaps(cookies);

		System.out.println("Update cookie : phone");
		cookies.put("phone", "99997000");
		showMaps(cookies);

		System.out.println("Contains [phone] key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
	}

}
