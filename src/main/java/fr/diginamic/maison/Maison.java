package fr.diginamic.maison;

public class Maison {
    /**
     * Instance attribute: tableau de type Piece vide.
     */
    private Piece[] listOfRooms = new Piece[0];

    /**
     * Ajoute progressivment des pieces au tableau qui represent la maison
     * @param piece Objet de type Piece à rajouter à la maison
     */
    public void ajouterPiece(Piece piece){
        Piece[] newListOfRooms = new Piece[listOfRooms.length + 1];
        System.arraycopy(listOfRooms, 0, newListOfRooms, 0, listOfRooms.length);
        newListOfRooms[listOfRooms.length] = piece;
        listOfRooms = newListOfRooms;
    }

    /**
     * retourne la superficie de la maison
     * @return double
     */
    public double calculSuperficieTotale(){
        double total = 0;
        for (Piece room : listOfRooms){
            total += room.superficie;
        }
        return total;

    }

    /**
     * retourne la superficie d'un étage donné.
     * @param etage le numero de l'étage dont on veut claculer la superficie (0 = RDC)
     * @return double
     */
    public double calculSuperficieParEtage(int etage){
        double total = 0;
        for (Piece room : listOfRooms) {
            if (etage == room.numeroEtage) {
                total += room.superficie;
            }
        }
        return total;



    }
}
