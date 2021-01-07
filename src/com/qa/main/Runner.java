package com.qa.main;

public class Runner {
	
	// 1.
	public static void main(String[] arg) {
		int input = 28;
		if(input<10 || input>99) {
			System.out.println("Value must be between 10 and 99.");
		} else {
			int tens = input/10;
			int unit = input - tens*10;
			System.out.println(tens + unit);
			System.out.println(unit);

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
					System.out.println(word);
				} else {
				switch(unit) {
				case 0:
					System.out.println(word);
				case 1:
					word = word + "one";
					System.out.println(word);
					break;
				case 2:
					String worda = word + "two";
					System.out.println(worda);
					break;
				case 3:
					String wordb = word + "three";
					System.out.println(wordb);
					break;
				case 4:
					String wordc = word + "four";
					System.out.println(wordc);
					break;
				case 5:
					String aword = word + "five";
					System.out.println(aword);
					break;
				case 6:
					String words = word + "six";
					System.out.println(words);
					break;
				case 7:
					String worde = word + "seven";
					System.out.println(worde);
					break;
				case 8:
					String wordr = word + "eight";
					System.out.println(wordr);
					break;
				case 9:
					String wordg = word + "nine";
					System.out.println(wordg);
					break;	
				}
				}
				}
			}
		}
	}

					
					
					
				
				
			

