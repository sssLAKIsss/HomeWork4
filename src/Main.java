


public class Main {

    public static void printListBeforeSort() {
        for(Person element : ArrayListOfPersonsCreater.addPersonsInArrayList()) {
            System.out.println(element.getAge() + " " + element.getName() + " " + element.getSex());
        }

    }

    public static void printListAfterSortByAge() {
        for(Person element : Sort1.sortByAge(ArrayListOfPersonsCreater.addPersonsInArrayList())) {
            System.out.println(element.getAge() + " " + element.getName() + " " + element.getSex());
        }

    }

    public static void printListAfterSortBySex() {
        for(Person element : Sort1.sortBySex(ArrayListOfPersonsCreater.addPersonsInArrayList())) {
            System.out.println(element.getAge() + " " + element.getName() + " " + element.getSex());
        }
    }

    public static void printListAfterSortByAgeAndSex() {
        for(Person element : Sort1.sortByAge(Sort1.sortBySex(ArrayListOfPersonsCreater.addPersonsInArrayList()))) {
            System.out.println(element.getAge() + " " + element.getName() + " " + element.getSex());
        }
    }

    public static void printListAfterSortBySexAndAgeAndAlphabet() {
        for (Person element : Sort1.sortByAge (Sort1.sortByName(Sort1.sortBySex(ArrayListOfPersonsCreater.addPersonsInArrayList())))) {
            System.out.println(element.getAge() + " " + element.getName() + " " + element.getSex());
        }
    }
    public static void printListAfterSortByNameAndSex() {
        for (Person element : Sort1.sortByName(Sort1.sortBySex(ArrayListOfPersonsCreater.addPersonsInArrayList()))) {
            System.out.println(element.getName() + " " + element.getAge() + " " + element.getSex());
        }
    }

    public static void printListOfNames() {
        for (Person element : ArrayListOfPersonsCreater.randomPersonCreater()) {
            System.out.println(element.getName() + " " + element.getAge() + " " + element.getSex());
        }
    }

    public static void main(String[] args) {

        System.out.println("---------------");
        //System.out.println(ArrayListOfPersonsCreater.randomNameCreater(FileReaderOfNames.ListOfNames(FileReaderOfNames.ListOfNamesAndTrash())));
        printListOfNames();
    }
}
