public class Driver{

	public static void main(String [] arg) {
		//fish actually is a data type
		//fish nemo; == int x;
		
		// nemo adalah object, Fish adalah kelas
		Fish nemo = new Fish();

		nemo.Swim();
		//nemo.color = "red"; //tukar value
		nemo.SetColor("red");
		nemo.Swim();

		Shark fierce = new Shark();
		fierce.Eat();
		fierce.Swim();
		fierce.SetSharpTeeth(150);
		fierce.Eat();

		//Fish dory = new Fish();
		//dory.Swim();
		//dory.color = "orange";
		//dory.SetColor("orange");
		//dory.Swim();
		Aquarium fancyAquarium = new Aquarium();
		fancyAquarium.fillFish();
	}
}