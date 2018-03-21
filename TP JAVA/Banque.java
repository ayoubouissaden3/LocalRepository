class Banque {
    private int nbClients=0;
    private Client [] clients=new Client[100];
    
    public void ajouterClient(String nom) {
	nbClients+=1;
	    ayoub ouissade ;
	clients[nbClients]=new Client(nom);
    }
    
    public void afficherBilan() {  
	for (int i=1;i<=nbClients;i++) 
	    clients[i].afficherBilan();
	System.out.println();
    }
	
    public void interaction() {
	boolean fini=false;
	while (!fini) {
	    System.out.println("Quelle operation voulez-vous effectuer?");
	    System.out.println(" 1) Ajouter un client");
	    System.out.println(" 2) Afficher le bilan de la banque");
	    System.out.println(" 3) Effectuer une operation sur un client");
	    System.out.println(" 4) Quitter le programme");
	    int reponse=Console.readInt("Votre choix:");
	    switch(reponse){
	    case 1:
		String nom=Console.readString("Entrez le nom du client: ");
		ajouterClient(nom);
		System.out.println("Le client a été ajouté");
		System.out.println();
		break;
	    case 2:
		afficherBilan();
		break;
	    case 3:
		System.out.println("Choisissez le client:");
		for (int i=1;i<=nbClients;i++)
		    System.out.println(" "+i+") "+clients[i].getNom());
		int numero=Console.readInt("Votre choix:");
		clients[numero].interaction();
		break;
	    case 4:
		fini=true;
	    }
	}
    }
}
  
  
