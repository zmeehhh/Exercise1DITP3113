public class Aquarium
{
	//Attribute or data member or fields
	public int length, height, width;

	public void fillFish(){
		Fish fish1 = new Fish();

		fish1.SetColor("grey");

		System.out.println("Many " + fish1.GetColor() + " fish here");
	
		fish1.Swim();
	}
}