/**
 *  la classe VectorHelper assure les operations suivantes
 * <ul> 
 *  <li>Trier les element d'un vecteur</li>
 *  <li>Somme de deux vecteur</li>
 *  <li>Inverse les elements d'un vecteur</li>
 *  <li>Obtenir le min et le max d'un vecteur</li>
 *  <li>Appliquer une formule sous forme de fonction  a tout les elements du  vecteur </li>
 *  </ul>
 *@author Djebablia Abderrahim
 *@version 2017.10.14
 */
public class VectorHelper 
{

	
/**
 * Trier les elements d'un tableau
 * @param table le tableaux qu'on veut  trier
 * <br><strong>Example</strong> : table = {5,3,7}   resultat = {3,5,7}--
 */
	public void TriTable(int[] table){
		int contenair = 0;
		for (int i=0 ;i<table.length;i++){
			for(int j =i+1;j<table.length;j++){
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
 * @param table1 le premier tableau de l'operation   
 * @param table2 l deuxieme tableau de l'opertation 
 * @return la somme de deux victeeur
 * <br><strong>Example</strong> : table1= {1,2,3}  table2 = {4,5,6} resultat = {5,7,9} 
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
 * @param table le vecteur a inverser
 * <br><strong>Example</strong> : table = {1,2,3} resultat = {3,2,1}
 */	
	public void inverseVecteur(int[] table){
    	int index,contenair;
    	index = 0;
    	while(index < table.length/2){
    		contenair = table[table.length-index-1];
    		table[table.length-index-1] = table[index];
    		table[index] = contenair;
    		index++;
    	}
    }
 /**
  * Obtenir le Min et le Max d'un vecteur
  * @param table le vecteur dedier au calucle du Min et Max
  * @return un vecteur de taille = 2 la premier case contier le min 
  * et la deuxieme contier le Max 
  * <br><strong>Example</strong> : table = {1,2,3} Min = 1 Max = 3
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
    /**
     * Applique l'operation puissance a tout les element d'un vecteur
     * @param table  le vecteur dedier au calucle du puissance
     * @param nbr    la puissance  
     * <br><strong>Example</strong> :  table = {1,2,3} nbr = 3 resultat {1,8,27}
	 */
    public void powerTable(int[] table,int nbr ){
  		if (nbr == 0){
  			for(int element : table){
  				element = 1;	
  			 }
  		}else{
  	      int index = 1;
  	      
  		    for(int i=0;i < table.length;i++){
  		        int contenair= table[i];
  		        while(index < nbr ){
  		            
  		     	 table[i]= contenair*table[i];
  		  		 index++;
  		  	   }
                index = 1;
  		  }
  		}
  		
  	}
}
