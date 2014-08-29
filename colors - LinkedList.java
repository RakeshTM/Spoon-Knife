import java.util.*;;
class Main
{
	public static void main(String[] fel)
	{
		LinkedList<String> colors = new LinkedList<String>();
		
		colors.add("red");
		colors.addLast("green");
		System.out.println(colors);
		colors.addFirst("Orange");
		System.out.println(colors);
		colors.addFirst("blue");

		
		System.out.println(colors.getFirst());
		System.out.println(colors.getLast());
		System.out.println(colors.remove());
		System.out.println(colors.removeFirst());
		System.out.println(colors.removeLast());
		System.out.println(colors);
	}
}