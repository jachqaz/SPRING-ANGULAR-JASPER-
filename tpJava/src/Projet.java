public class Projet {
    public static void main(String[] args) {
        Etudiant ali = new Etudiant();
        Primate p = ali;
        Personne per = ali;
        Enseignat koffi = new Enseignat();
        System.out.println(getNameType(ali));
        System.out.println(getNameType(koffi));
    }

    public static String getNameType(Personne per) {
        return per.getName();
    }
}
