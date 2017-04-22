import java.util.*;

public class Model {
	
	List<Scacchiera> solutions = null;
	
	public List <Scacchiera> findSolutions(int dim){
		
		solutions = new ArrayList <Scacchiera>();
		
		Scacchiera scacchiera = new Scacchiera(dim);
		int step =0;
		
		recursive(scacchiera, step);
		
		return  solutions;
	}
	
	public void  recursive(Scacchiera scacchiera, int step){
		
		//Controllo condizione di terminazione
		if(step == scacchiera.getDimension()){
			System.out.println(scacchiera);
			solutions.add(new Scacchiera(scacchiera));
		}
		
		//devo generare le nuove soluzioni parziali
		// gli indici partono da 0 per comodita`
		
		for(int i =0; i< scacchiera.getDimension(); i++){
			if(!scacchiera.contains(i)){
				scacchiera.add(i);
				if( scacchiera.controllaDiagonale(step)){
					recursive(scacchiera , step +1);
				}
				scacchiera.remove(i);
			}
		}
	}

	


}
