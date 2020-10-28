import java.util.ArrayList;

public class ArrayListOfPersonsCreater {

    public static ArrayList<Person> randomPersonCreater() {
        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10000; i ++) {
            persons.add(new Person(randomAgeCreater(), randomSexCreater(), randomNameCreater(FileReaderOfNames.ListOfNames(FileReaderOfNames.ListOfNamesAndTrash())) ));
        }

        return persons;
    }

    public static int randomAgeCreater() {
        return (int) (1 + Math.random() * 100);
    }

    public static String randomSexCreater() {
        String SexParameter;
        if ((int) (Math.random() * 2) == 0) {
            SexParameter = Sex.MAN_SEX;
        }
        else { SexParameter = Sex.WOMAN_SEX;
        }
        return SexParameter;
    }

    public static String randomNameCreater(ArrayList<String> list) {
        String randomName = list.get((int) (Math.random() * 1000));
        return randomName;
    }


    public static ArrayList<Person> addPersonsInArrayList() {
        ArrayList<Person> persons = new ArrayList<>();

        Person person1 = new Person(16, Sex.WOMAN_SEX, "Alla");
        Person person2 = new Person(32, Sex.MAN_SEX, "Sema");
        Person person3 = new Person(18, Sex.WOMAN_SEX, "Masha");
        Person person4 = new Person(41, Sex.MAN_SEX, "Abdrey");
        Person person5 = new Person(38, Sex.WOMAN_SEX, "Sveta");
        Person person6 = new Person(78, Sex.MAN_SEX, "Vsevolod");
        Person person7 = new Person(54, Sex.WOMAN_SEX, "Alina");
        Person person8 = new Person(21, Sex.MAN_SEX, "Andrey");
        Person person9 = new Person(42, Sex.WOMAN_SEX, "Milla");
        Person person10 = new Person(23, Sex.MAN_SEX, "Anton");
        Person person11 = new Person(98, Sex.MAN_SEX, "Andrey");
        Person person12 = new Person(13, Sex.MAN_SEX, "Andrey");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
        persons.add(person11);
        persons.add(person12);

        return persons;
    }


}
