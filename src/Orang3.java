

public class Orang3 extends BaseCharacter implements IChef, IDriver, IWorker, IArtist {

	public Orang3(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Paint() {
		System.out.println(name +" Sedang Menggambar");
		
		
	}
	@Override
	public void Work() {
		System.out.println(name +" Sedang Bekerja");
		
		
	}

	@Override
	public void Drive() {
		System.out.println(name +" Sedang Berkendara");
		
	}

	@Override
	public void Cook() {
		System.out.println(name +" Sedang Memasak");
		
	}




}
