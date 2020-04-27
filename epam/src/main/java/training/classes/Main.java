package training.classes;

import java.util.List;

public class Main {
    public static void main(String args[]){
        /* Main task
 Создать классы, спецификации которых приведены ниже.
 Определить конструкторы и методы setТип(), getТип(), toString().
 Определить дополнительно методы в классе, создающем массив объектов.
 Задать критерий выбора данных и вывести эти данные на консоль.
 В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.]
 2. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
 Создать массив объектов. Вывести:
 a) список покупателей в алфавитном порядке;
 b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.*/

        Shop market = new Shop("Keshenya");
        market.addCustomerToShopList(new Customer("Павел", "Лугин", "Михайлович", "ул. Темерязева д.23", 56456654, 213123));
        market.addCustomerToShopList(new Customer("Ваня", "Гавриенко", "Васильевич","ул. Новикова д.10", 45645665, 1663218));
        market.addCustomerToShopList(new Customer("Алексей", "Лугин", "Андреевич","ул. Василькова д.9", 5454354, 1554598));
        market.addCustomerToShopList(new Customer("Виктор", "Бодриенко", "Михайлович","ул. Гароедова д.15", 5435455, 47656585));
        market.addCustomerToShopList(new Customer("Артём", "Гордей", "Павлович","ул. Павлушнкина д.10", 6576576, 26569));

        System.out.println("\nsort by name:");
        List<Customer> listSortByName = market.getListName();
        for (Customer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nsort by surname:");
        List<Customer> listSortBySurname = market.getListSurname();
        for (Customer c : listSortBySurname) {
            System.out.println(c);
        }

        System.out.println("\ndiapason card number:");
        List<Customer> diapasonCardumber = market.getListDiapasonCardNumber(2545482, 5544556);
        for (Customer c : diapasonCardumber) {
            System.out.println(c);
        }

    }
}
