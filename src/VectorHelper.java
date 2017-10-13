
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
		try{
			if(table1.length != table2.length){
				throw new lengthException("il faut que les deux tableau soit de meme taille");
			}
			int[] table;
			for(int i = 0;i <= table1.length;i++){
				table[i]=table1[i]+table2[i];
			}
		}catch(lengthException e){
			System.out.println(e.getMessage());
		}
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
