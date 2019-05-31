import java.util.ArrayList;
import java.util.Scanner;

 

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<BaseCharacter> listCharacter = new ArrayList<>();
	
	String name;
	String description;
	
	public Main() {
		listCharacter.add(new Orang1("Chef", " someone who can cooks"));
		listCharacter.add(new Orang2("Driver", " someone who can drives"));
		listCharacter.add(new Orang3("SuperHuman", " someone who can do everything"));
		listCharacter.add(new Orang4("Worker", " someone who can works"));
		listCharacter.add(new Orang5("Artist", " someone who can paint"));
		listCharacter.add(new Orang6("LazyPerson", " someone who can't do everything"));
		
		String input;
		
		System.out.println("Tugas GLS");
		System.out.println("0 : Chef");
		System.out.println("1 : Driver");
		System.out.println("2 : SuperHuman");
		System.out.println("3 : Worker");
		System.out.println("4 : Artist");
		System.out.println("5 : LazyPerson");
		do {
			System.out.print("Ketik [Info/Cook/Drive/Work/Art] Dan nomor : ");
			input = scan.nextLine();
		}while(!input.contains("Info") && !input.contains("Cook") && !input.contains("Drive") && !input.contains("Work") && !input.contains("Art"));
		
		String jobDesk = input.substring(0, input.indexOf(" "));
		String ID = input.substring(input.indexOf(" ")+1);
		
		for(int x=0;x<ID.length();x+=2) {
			Integer id = Integer.parseInt(ID.substring(x, x+1));

			switch(jobDesk) {
			case "Info" :
				listCharacter.get(id).getInfo();
				break;
			case "Cook" :
				if(listCharacter.get(id) instanceof IChef) {
					((IChef)listCharacter.get(id)).Cook();
				}else {
					System.out.println(listCharacter.get(id).name+ " can't do cook");
				}
				break;
			case "Drive" :
				if(listCharacter.get(id) instanceof IDriver) {
					((IDriver)listCharacter.get(id)).Drive();
				}else {
					System.out.println(listCharacter.get(id).name + " can't do drive");
				}
				break;
			case "Art" :
				if(listCharacter.get(id) instanceof IArtist) {
					((IArtist)listCharacter.get(id)).Paint();
				}else {
					System.out.println(listCharacter.get(id).name + " can't do art");
				}
				break;
			case "Work" :
				if(listCharacter.get(id) instanceof IWorker) {
					((IWorker)listCharacter.get(id)).Work();
				}else {
					System.out.println(listCharacter.get(id).name + " can't do work");
				}
				break;
			
			}
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
