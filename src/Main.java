import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Staff [] staff = {
                new Staff("Фамилия Имя Отчество",
                        "Должность",
                        "Электронная почта",
                        5555555,
                        2000,
                        22 ),
                new Staff("Семенов Семен Семенович",
                        "Менеджер",
                        "email@mail.ru",
                        5553322,
                        1500,
                        44),
                new Staff("Иванова Мария Олеговна",
                        "Главный менеджер",
                        "lublykotyat@mail.ru",
                        1114466,
                        2500,
                        25),
                new Staff("Косоруков Тимур Альбертович",
                        "Региональный директор",
                        "glavniy@mail.ru",
                        3332244,
                        5000,
                        56),
                new Staff("Баба Нюра",
                        "Уборщица",
                        "Нет",
                        7779966,
                        1000,
                        70),
        };
        FilterStaffAge(staff, 40);

    }
    public static void FilterStaffAge(Staff[] staff, int Age){
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getAge() > Age){
                staff[i].InfAboutStaff();
            }
        }
    }
}
