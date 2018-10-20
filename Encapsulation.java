//Hakikid Amana
//M0517019
//Informatika 2017

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//create Scanner object
			Collection col = new Collection();//create Collection object
			boolean check = false; //initialize check variable for looping
			
			while(check == false) {
			System.out.println("Insert Command :\n1. Insert film data\n2. Show film collection\n3. Delete data\n4. Find film\n5. Out");
			int option = 0;//scan integer data type from input for switch case
			check = true;
			try {
			    option = Integer.parseInt(sc.nextLine());//using nextLine and parsing it because of nextLine usage in switch case
			} catch (NumberFormatException e) {
			    e.printStackTrace();
			}
			switch(option) {
			case 1 : System.out.println("Insert film title :");
			String title = sc.nextLine();//nextLine for input with more than 1 word
			col.setTitle(title);//add input to title arraylist
			System.out.println("Insert film genre : ");
			String genre = sc.nextLine();
			col.setGenre(genre);//add input to genre arraylist
			System.out.println("Insert film release year :");
			String year = sc.nextLine();
			col.setYear(year);//add input to year arraylist
			System.out.println();
			check = false;//check = false for continuing the loop
			break;
			case 2 : System.out.println("Film Collection : ");
			col.showCollection();//call showCollection method
			check = false;//check = false for continuing the loop
			System.out.println();
			break;
			case 3 : System.out.println("Delete collection (Type title/genre/year) : ");
			String del = sc.nextLine();
			col.delete(del);//call delete method
			check = false;//check = false for continuing the loop
			System.out.println();
			break;
			case 4 : System.out.println("Find collection (Type title/genre/year) : ");
			String data = sc.nextLine();
			col.find(data);	//call find method
			check = false;//check = false for continuing the loop
			System.out.println();
			break;
			case 5 : System.out.println("Out from program");
			check = true;//check = true for stopping the loop
			break;
			default : System.out.println("Invalid input\n");
			check = false;//check = false for continuing the loop
			break;
			}
		}	
	}
}

class Collection{
	private ArrayList<String> title = new ArrayList<String>();//create arraylist to store title
	private ArrayList<String> genre = new ArrayList<String>();//create arraylist to store genre
	private ArrayList<String> year = new ArrayList<String>();//create arraylist to store year

	public void setTitle(String title) {//add input to title arraylist
		this.title.add(title);
	}

	public void setGenre(String genre) {//add input to genre arraylist
		this.genre.add(genre);
	}

	public void setYear(String year) {//add input to year arraylist
		this.year.add(year);
	}

	public void showCollection() {//show title, genre, & year arraylist 
		for(int i = 0; i < title.size(); i++) { 
			System.out.println(i+1+". "+title.get(i) +" ("+genre.get(i)+", "+year.get(i)+")");
		}
	}
	
	public void delete(String del) {//delete data
		for(int i = 0; i < title.size(); i++) {
		if(title.get(i).contains(del)) {//if there is(are) data(s) from the title arraylist
			deleteAll(i);//call deleteAll method
			i--;
		}
		else if(genre.get(i).contains(del)) {//if there is(are) data(s) from the genre arraylist
			deleteAll(i);//call deleteAll method
			i--;
		}
		else if(year.get(i).contains(del)) {//if there is(are) data(s) from the year arraylist
			deleteAll(i);//call deleteAll method
			i--;
		}
	}
}
	public void deleteAll(int x) {//delete all (title, genre, year) data at x index
		title.remove(x);
		genre.remove(x);
		year.remove(x);
	}
	public void find(String a) {//find data
		for(int i = 0; i < title.size(); i++) {//search data index by index
		if(title.get(i).contains(a)) {//if there is(are) data(s) from the title arraylist
			System.out.println(title.get(i) +" ("+genre.get(i)+", "+year.get(i)+")");
		}
		else if(genre.get(i).contains(a)) {//if there is(are) data(s) from the genre arraylist
			System.out.println(title.get(i) +" ("+genre.get(i)+", "+year.get(i)+")");
		}
		else if(year.get(i).contains(a)) {//if there is(are) data(s) from the genre arraylist
			System.out.println(title.get(i) +" ("+genre.get(i)+", "+year.get(i)+")");
		}
	}
	}
}
