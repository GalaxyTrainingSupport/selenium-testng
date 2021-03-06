package pe.edu.galaxy.exception;

public class Exceptions {

	public static void main(String[] args) throws Exception {
		withOutException();
	}

	public static void dividir() {
		System.out.println("Exception Handling");
		int d = 1 / 0;
		System.out.println("Test has been completed");
	}

	public static void withException() {
		try {

			System.out.println("Exception Handling");
			int d = 1 / 0;
			System.out.println("Test has been completed with Exception");

		} catch (Exception e) {
			System.out.println("Exception Bloque");
			System.out.println("Message -->" + e.getMessage());
			System.out.println("Cause -->" + e.getCause());
			e.printStackTrace();
		} finally {
			System.out.println("Finally block");
		}
	}

	public static void withOutException() throws Exception {
		try {

			System.out.println("Exception Handling");
			int d = 1 / 0;
			System.out.println("Test has been completed with Out Exception");

		} catch (Exception e) {
			System.out.println("Exception Bloque");
			System.out.println("Message -->" + e.getMessage());
			System.out.println("Cause -->" + e.getCause());
			e.printStackTrace();
		} finally {
			System.out.println("Finally block");
		}
	}

}