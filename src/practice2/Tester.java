package practice2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>(Arrays.asList(
                new Human(20,  "Георгий", "Савчук", LocalDate.of(2004, 1, 28), 73),
                new Human(20,  "Алескей", "Григорьев", LocalDate.of(2004, 6, 17), 54),
                new Human(20,  "Кирилл", "Ермаков", LocalDate.of(2004, 2, 13), 56),
                new Human(20,  "Криштиану", "Роналду", LocalDate.of(1985, 2, 5), 89),
                new Human(20,  "Трэвис", "Скотт", LocalDate.of(1991, 4, 30), 80),
                new Human(20,  "Лионеля", "Месси", LocalDate.of(1987, 6, 24), 72),
                new Human(20,  "Килиан", "Мбаппе", LocalDate.of(1998, 12, 20), 85)
        ));
        List<Human> firstFiveHumans = humans
                .stream()
                .limit(5)
                .toList();
        System.out.println("Список первых пяти элементов:");
        firstFiveHumans.forEach(System.out::println);
        List<Human> sortedByBirthDateHumans = humans
                .stream()
                .sorted((human1, human2) -> {
                    if(human1.birthDate.isBefore(human2.birthDate)) return -1;
                    else if (human1.birthDate.isAfter(human2.birthDate)) return 1;
                    else return 0;
                })
                .toList();
        System.out.println("------------------\nОтсортированный по дате рождения список:");
        sortedByBirthDateHumans.forEach(System.out::println);
        List<Human> humansWeighingLessThan60 = humans
                .stream()
                .filter(human -> human.weight < 60)
                .toList();
        System.out.println("------------------\nЛюди с весом меньше 60:");
        humansWeighingLessThan60.forEach(System.out::println);
        System.out.println("------------------\nВывод имени и фамилии каждого человека в списке:");
        humans.forEach(human -> System.out.println(human.firstName + " " + human.lastName));
    }
}
