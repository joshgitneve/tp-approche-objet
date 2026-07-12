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
        if (piece == null) {
            System.out.println("Impossible d'ajouter une piece null");
            return;
        }
        if (piece.superficie <= 0 || piece.numeroEtage < 0) {
            System.out.println("Piece invalide — non ajoutée");
        }
        else { Piece[] newListOfRooms = new Piece[listOfRooms.length + 1];
            System.arraycopy(listOfRooms, 0, newListOfRooms, 0, listOfRooms.length);
            newListOfRooms[listOfRooms.length] = piece; listOfRooms = newListOfRooms;}

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

    public Piece[] getListOfRooms() {
        return listOfRooms;
    }

    /**
     * retourne la superficie d'un étage donné.
     * @param etage le numero de l'étage dont on veut claculer la superficie (0 = RDC)
     * @return double
     */
    public double calculSuperficieParEtage(int etage) {
        double total = 0;
        for (Piece room : listOfRooms) {
            if (etage == room.numeroEtage) {
                total += room.superficie;
            }
        }

        return total;
    }
    /**
     * Retourne superficie des pieces une maison d'un type specifique. E.g. chambre, salon.
     * @param
     */
    public double calculSuperficieParType(Class<?> type){
        double result = 0;
        for (Piece room : listOfRooms) {
            if (type.isInstance(room)){
                result += room.superficie;
            }
        }
        return result;
    }

    /**
     * Retourne le nombre des pieces une maison d'un type specifique renseigné.
     * @param type est le type de piece renseigné. E.g. Chambre, Salons, WC etc.
     *
     */
    public int calculNombreParType(Class<?> type){
        int result = 0;
        for (Piece room : listOfRooms) {
            if (type.isInstance(room)){
                result ++;
            }
        }
        return result;
    }

    /**
     * Retourne un print dynamique de la superficie des pieces de type rensiegné (e.g. Chambre).
     * @param type
     */
    public void afficherSuperficieParType(Class<?> type) {
        System.out.println("Superficie des " + type.getSimpleName() + "s : " + calculSuperficieParType(type));
    }

    /**
     * Retourne un print dynamique du nombre des pieces de type rensiegné (e.g. Salon).
     * @param type
     */
    public void afficherNombreParType(Class<?> type) {
        System.out.println("Le nombre de " + type.getSimpleName() + "s est de: " + calculNombreParType(type));
    }


}
