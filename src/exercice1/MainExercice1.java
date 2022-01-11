package exercice1;

import datamocklib.Person;
import datamocklib.TxtHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainExercice1 {

    // Format du fichier : firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
    // Pas de header
    public static List<Person> parse(List<String> data) {
        ArrayList<Person> personnes = new ArrayList<Person>();

        Person p;
        String[] splited_data;

        for (int i=0; i<data.size(); i++) {
            splited_data = data.get(i).split(",");
            p = new Person(splited_data[0], splited_data[1], splited_data[2], splited_data[3], splited_data[4], splited_data[5]);

            personnes.add(p);
        }

        return personnes;
    }

    public static void main(String[] args) {
        // EXO 1
        /*
         * - Récuperez la liste des personnes sous la forme -> firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
         *   grâce à la fonction TxtHelper.getDataFromTxt("persons.txt")
         * - Parser la liste des Personnes grâce à la fonction parse())
         * - Calculer le nombre de personnes nées dans chaque ville avec les données obtenues.
         * Les données contiennent une trentaine de villes, Bonne chance !
        */
        List<Person> personnes = parse(TxtHelper.getDataFromTxt("persons.txt"));


        System.out.println(personnes);
    }
}
