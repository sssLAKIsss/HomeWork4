import org.jetbrains.annotations.Contract;

import java.util.ArrayList;

public class Sort1 implements SortInterface {

    public static ArrayList<Character> alphabet() {
        ArrayList<Character> alphabetArray  = new ArrayList<>();
        String alphabetLine = "ABCDEFGHIJKMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabetLine.length(); i++) {
            alphabetArray.add(alphabetLine.charAt(i));
        }
        return alphabetArray;
    }

    @Contract("_ -> param1")
    public static ArrayList<Person> sortByName(ArrayList<Person> list) {
        boolean endChange = false;
        for (int i = list.size() - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).getSex().equals(list.get(j + 1).getSex()) ) {
                    if (list.get(j).getName().equals(list.get(j + 1).getName())) {
                        break;
                    }
                    String name1 = (list.get(j).getName()).toUpperCase();
                    String name2 = (list.get(j + 1).getName()).toUpperCase();
                    int minNameLine;

                    if (name1.length() > name2.length()) {
                         minNameLine = name2.length(); }
                    else { minNameLine = name1.length(); }

                    for (int k = 0; k < minNameLine; k++) {
                        int indexOfChar1 = -1;
                        int indexOfChar2 = -1;
                        for (int l = 0; l < alphabet().size(); l++) {

                            if (name1.charAt(k) == alphabet().get(l)) {
                                indexOfChar1 = l;

                            }
                            if (name2.charAt(k) == alphabet().get(l)) {
                                indexOfChar2 = l;

                            }
                            if (indexOfChar1 != -1) {
                                if (indexOfChar1 != indexOfChar2) {
                                    endChange = true;
                                }
                                break;
                            }
                            if (indexOfChar2 != -1) {
                                if (indexOfChar1 == indexOfChar2) {
                                    break;
                                }
                                else {
                                    Person changeName = list.get(j);
                                    list.set(j, list.get(j + 1));
                                    list.set(j + 1, changeName);
                                    endChange = true;
                                    break;
                                }
                            }
                        }
                        if (endChange) {
                            endChange = false;
                            break;
                        }
                    }
                }
            }
        }
        return list;
    }


    public static ArrayList<Person> sortByAge(ArrayList<Person> list) {

        for (int i = list.size() - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).getName().equals(list.get(j + 1).getName()) && list.get(j).getSex().equals(list.get(j + 1).getSex())) {
                    if (list.get(j).getAge() < list.get(j + 1).getAge()) {
                        Person changeAge = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, changeAge);
                    }
                }
            }
        }
        return list;
    }

    public static ArrayList<Person> sortBySex(ArrayList<Person> list) {
        ArrayList<Person> sortBySexListOfPersons = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSex().equals(Sex.MAN_SEX)) {
                sortBySexListOfPersons.add(list.get(i));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSex().equals(Sex.WOMAN_SEX)) {
                sortBySexListOfPersons.add(list.get(i));
            }
        }

        return sortBySexListOfPersons;
    }
}
