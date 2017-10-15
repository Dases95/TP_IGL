/**
 *  la classe VectorHelper assure les operations suivantes
 *  Trier les element d'un vecteur
 *  Somme de deux vecteur
 *  Inverse les elements d'un vecteur
 *  Obtenir le min et le max d'un vecteur
 *  Appliquer une formule sous forme de fonction  a tout les elements du  vecteur 
 *  
 *@author Djebablia Abderrahim
 *@version 2017.10.14
 */
public class VectorHelper 
{

	
/**
 * Trier les elements d'un tableau
 * @param le tableaux qu'on veut  trier
 * @example {5,3,7} --> {3,5,7}
 */
	public void TriTable(int[] table){
		int contenair;
		for (int i=0 ;i<= table.length-1;i++){
			for(int j =i+1;j<=table.length;j++){
				if(table[j]<table[i]){
					contenair = table[i];
					table[i] = table[j];
					table [j] = contenair;
				}
			}
		}
	}
	
/**
 * Sommer de deux victeurs si possible
 * @param les deux tableau qu'on veut calcule 
 * @return la somme de deux victeeur
 * @throws lengthException si les deux vecteur ne sont pas de la méme taille
 * @example table1= {1,2,3} et table2 = {4,5,6} resultat = {5,7,9} 
 */	
	public int[] sommeVecteur(int[] table1,int[] table2){
		try{
			if(table1.length != table2.length){
				throw new lengthException("il faut que les deux tableau soit de meme taille");
			}
			for(int i = 0;i < table1.length;i++){
				table1[i]=table1[i]+table2[i];
			}
			return table1;
		}catch(lengthException e){
			System.out.println(e.getMessage());
			return null;
		}
	}
/**
 * Inverser les elements du vecteur
 * @param le vecteur a inverser
 * @example {1,2,3} --> {3,2,1}
 */	
	public void inverseVecteur(int[] table){
    	int index,contenair;
    	index = 0;
    	while(index <= table.length/2){
    		contenair = table[table.length-index-1];
    		table[table.length-index-1] = table[index];
    		table[index] = contenair;
    		index++;
    	}
    }
 /**
  * Obtenir le min et le max d'un vecteur
  * @param le vecteur dedier au calucle du min et amx
  * @return un vecteur de taille = 2 la premier case contier le min 
  * et la deuxieme contier le max 
  * @example {1,2,3} min = 1 max = 3
  */	
    public int[] minMax(int[] table){
    	int [] minMaxVecteur = new int[2] ;
    	minMaxVecteur[0] = table[0];
    	minMaxVecteur[1] = table[0];
    	int contenair;
    	for(int element : table){
    		if(element < minMaxVecteur[0]){
    			minMaxVecteur[0] = element;
    		}
            if(element > minMaxVecteur[1]){
            	minMaxVecteur[1] = element;
    		}
    	}
    	return minMaxVecteur;
    }
	
	
}
