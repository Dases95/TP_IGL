
public class VectorHelper 
{
	private int[] table_1;
	private int[] table_2;
	
	
/*
 * @param	 
 * @return
 *  ajouter un element num a une des deux vecteur	
 **/

	public void addElement(int num,int[] table){
		   table[table.length] = num;	   
	}
	
	
/* @param 
 * @return
 * trier les elements d'un tableau
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
	
/*
 * @param
 * @return
 * Sommer deux victeurs
 */	
	public int[] sommeVecteur(int[] table1,int[] table2){
		return null;
	}
/*
 * @param
 * @return
 * Inverser un vecteur
 * @example {1,2,3} --> {3,2,1}
 */	
    public int[] inverseVecteur(int[] table){
    	return null;
    }
	
}
