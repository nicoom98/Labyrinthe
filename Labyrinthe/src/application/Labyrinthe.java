package application;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Labyrinthe implements Explorable {
	
	private int labyrinthe[][];
	private List<String> lignes;
	private int nbligne;
	private int nbcolone;
	private Coordonnees startingBox;
	private Coordonnees arrivalBox;
	private String NameLab;
	
	/**
 	* Builder of the Labyrinth
 	* @param file Base file
 	*/
	public Labyrinthe(String file) {
		chargerFichier(file);
		labyrinthe = new int[nbligne][nbcolone];
		createLabyrinthe();
	}
	
	/**
	 * Loading the file
	 * @param file Base file
	 */
	public void chargerFichier(String file) {
		Path road = Paths.get(file);
		try {
			String start;
			String end;
			String size[];
			lignes = Files.readAllLines(road);
			String info;
			NameLab = lignes.get(0);
			start = lignes.get(1);
			end = lignes.get(2);
			size = lignes.get(3).split("	");
			int taille[] = new int[2];
			taille[0] = Integer.parseInt(size[0]);
			taille[1] = Integer.parseInt(size[1]);
			nbligne = taille[0];
			nbcolone =  taille[1];
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("ERROR : Le fichier ne s'ouvre pas...");
		}
	}
	
	/**
	 * Creation of the labyrinth
	 */
	public void createLabyrinthe() {
		char pointage;
		for (int i=4; i<lignes.size(); i++)
		{
			System.out.println();
			for (int j=0; j<lignes.get(i).length(); j++) {
				pointage = lignes.get(i).charAt(j);

				if (pointage == ' ') {
					labyrinthe[i-4][j] = 0;
				}
				else
				{
					labyrinthe[i-4][j] = 1;
				}
			}
		}
	}
	
	/*
	 * Generate starting box
	 */
	public void generateStartingBox() {
		
	}
	
	/*
	 * Generate arrival box
	 */
	public void generateArrivalBox() {
		
	}
	
	/*
	 * Turn the labyrinth upside down
	 */
	public int[][] getLabyrinthe() {
		return labyrinthe;
	}
	
	/*
	 * Return the name of the labyrinth
	 */
	public String getNameLabyrinthe() {
		return NameLab;
	}
	
	/*
	 * Return starting box
	 */
	//public Step getStartingBox() {
		
		
		
	//}
	
	/*
	 * Return arrival box
	 */
	//public Step getArrivalBox() {
		
	//}

	//generateAdjacentBox(int hashCode)
	//return liste Step
	
	
	
	
	
	//Divers...
	
	@Override
	public Step getDepart() {
		
		//return new Step(startingBox.hashCode());
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Step getArrivee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean estArrivee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getCasesVoisines() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//GénérerDepart
	//GénérerSortie
	//RatournerDépart
	//RetournerSortie
	
	
	
	//Cherche case départ
	//Chercher case d'arrivée
	//getCaseDépart
	//getCaseArrivée
	//getCaseVoisine
	
	
	
}
