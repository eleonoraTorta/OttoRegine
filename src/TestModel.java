import java.util.List;

public class TestModel {

	public static void main(String[] args) {

		Model model = new Model();
		List<Scacchiera> solutions = model.findSolutions(8);

		if (solutions != null) {
			for (Scacchiera sc : solutions) {
				System.out.println(sc);
			}

			int counter = solutions.size();
			System.out.println(String.format("Numero di soluzioni trovate: %d\n", counter));
		}
	}

}