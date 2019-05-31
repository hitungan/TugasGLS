

public class Orang1 extends BaseCharacter implements IChef{

	public Orang1(String name, String description) {
		super(name, description);
		
	}

	@Override
	public void Cook() {
		System.out.println(name +" Sedang Memasak");
		
	}

}
