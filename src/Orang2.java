

public class Orang2 extends BaseCharacter implements IDriver{

	public Orang2(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Drive() {
		System.out.println(name +" Sedang Berkendara");
		
	}

	
	
	

}
