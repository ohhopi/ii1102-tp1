public class ArbreBinaire {
	private Noeud racine;
	
	private static class Noeud {
		Noeud gauche;
		Noeud droite;
		String nom;
		
		Noeud(String NewNom){
			gauche = null;
			droite = null;
			nom = NewNom;
		}
	}
	public ArbreBinaire(){
		this.racine = null;
	}
	
	public ArbreBinaire(String nom){
		this.racine.nom = nom;
	}
	public ArbreBinaire(String nom, String gauche, String droite){
		this.racine.nom = nom;
		
	}
	
	 /**
	   Inserts the given data into the binary tree.
	   Uses a recursive helper.
	  */
	  public void insert(String nom) {
	    racine = insert(racine, nom);
	  }
	 

	  /**
	   Recursive insert -- given a node pointer, recur down and
	   insert the given data into the tree. Returns the new
	   node pointer (the standard way to communicate
	   a changed pointer back to the caller).
	  */
	  private Noeud insert(Noeud node, String nom) {
	    if (node==null) {
	      node = new Noeud(nom);
	    }
	    else {
	      if (node.gauche == null) {
	        node.gauche = insert(node.gauche, nom);
	      }else if(node.droite == null) {
	        node.droite = insert(node.droite, nom);
	      }
	    }

	    return(node); // in any case, return the new pointer to the caller
	  }
	  
	 /**
	  Prints the node values in the "inorder" order.
	  Uses a recursive helper to do the traversal.
	 */
	 public void printTree() {
	  printTree(racine);
	  System.out.println();
	 }

	 private void printTree(Noeud node) {
	  if (node == null) return;

	  // left, node itself, right
	  printTree(node.gauche);
	  System.out.print(node.nom + "  ");
	  printTree(node.droite);
	 }
	
	public static void main(String[] args){
		ArbreBinaire arbre = new ArbreBinaire();
		arbre.insert("A");
		arbre.insert("B");
		arbre.insert("C");
		arbre.insert("A");
		arbre.insert("B");
		arbre.insert("C");
		arbre.insert("Z");
		arbre.insert("Z");
		arbre.insert("Z");
		arbre.insert("Z");
		arbre.insert("Z");
		arbre.insert("Z");
		arbre.printTree();
	}
}
