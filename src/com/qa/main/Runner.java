package com.qa.main;

public class Runner {
	
	// 1.
	public static void main(String[] arg) {
		int input = 30;
		if(input<10 || input>99) {
			System.out.println("Value must be between 10 and 99.");
		} else {
			int tens = input/10;
			int unit = input - tens*10;
			System.out.println(tens + unit);

			//2.
			
			String word = "";
			if(input<15 && input!=14) {
				switch(input) {
				case 10:
					System.out.println("Ten");
					break;
				case 11:
					System.out.print("Eleven");
					break;
				case 12:
					System.out.print("Tweleve");
					break;
				case 13:
					System.out.print("Thirteen");
					break;
				case 15:
					System.out.print("Fifteen");
					break;
				}
			} else if(input<20) {
					switch(unit) {
					case 6:
						word = "Six";
					case 7:
						word = "Seven";
					case 8:
						word = "Eight";
					case 9:
						word = "Nine";
					default:
						word = word + "teen";
						System.out.println(word);
						break;
					}
			} else {
				switch(tens) {
				case 2:
					word = "Twenty";
				case 3:
					word = "Thirty";
				case 4:
					word = "Forty";
				case 5:
					word = "Fifty";
				case 6:
					word = "Sixty";
				case 7:
					word = "Seventy";
				case 8:
					word = "Eighty";
				case 9:
					word = "Ninety";
				} if (unit>0) {
					word = word + "-";
				} else {
				switch(unit) {
				case 0:
					System.out.println(word);
				case 1:
					word = word + "one";
					System.out.println(word);
					break;
				case 2:
					word = word + "two";
					System.out.println(word);
					break;
				case 3:
					word = word + "three";
					System.out.println(word);
					break;
				case 4:
					word = word + "four";
					System.out.println(word);
					break;
				case 5:
					word = word + "five";
					System.out.println(word);
					break;
				case 6:
					word = word + "six";
					System.out.println(word);
					break;
				case 7:
					word = word + "seven";
					System.out.println(word);
					break;
				case 8:
					word = word + "eight";
					System.out.println(word);
					break;
				case 9:
					word = word + "nine";
					System.out.println(word);
					break;	
				}
				}
				}
			}
		}
	}

					
					
					
				
				
			

