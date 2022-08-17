package com.book.proj;

import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {
		try {
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			int ch = 0;
			while(ch!=7) {
				System.out.println("+++++++++Menu+++++++++");
				System.out.println("1. Add books:");
				System.out.println("2. View curent stock:");
				System.out.println("3. View all book:");
				System.out.println("4. View book by author:");
				System.out.println("5. View book by genre:");
				System.out.println("6. Sell book:");
				System.out.println("7. Exit:");
				System.out.println("Enter your choice: ");
				ch=sc1.nextInt();
				switch(ch) {
				case 1:System.out.println("Enter the book name:");
						String bName= sc2.nextLine();
						System.out.println("Enter the author name: ");
						String aName= sc2.nextLine();
						System.out.println("Enter the genre:");
						String gen = sc2.nextLine();
						System.out.println("Enter the price:");
						double bPrice = sc1.nextDouble();
						BookValidation.addBook(bName, aName, gen, bPrice);
						break;
						
				case 2:
					System.out.println("The current book stock is "+BookValidation.bs.size());
					System.out.println("Available book lists are:");
					BookValidation.viewBook();
					break;
					
				case 3:BookValidation.viewBook();
					break;
					
				case 4:System.out.println("Enter the author name to search");
						String bookAuthorName = sc2.nextLine();
						BookValidation.viewAuthor(bookAuthorName);
					break;
					
				case 5: System.out.println("Enter genre you want to search");
						String bookGenreName = sc2.nextLine();
						BookValidation.viewGenre(bookGenreName);
					break;
					
				case 6:System.out.println("Enter the book name you want :");
						String sellBookName = sc2.nextLine();
						BookValidation.sellBook(sellBookName); 
						System.out.println("Available book lists are:");
						BookValidation.viewBook();
					break;
				case 7:System.exit(0);
					break;
				default:System.out.println("Enter numbers only 1-7");
					
				}
			}
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			main(args);
		}
	}

}
