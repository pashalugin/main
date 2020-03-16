import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Shop {

    private String ShopName;
    private static ArrayList<Customer> customerList = new ArrayList<Customer>();

    Shop(String ShopName) {
        this.ShopName = ShopName;
    }

    public static void addCustomerToShopList(Customer customer) {
        customerList.add(customer);
    }

    List<Customer> getListName() {
        List<Customer> list = new ArrayList<Customer>(customerList);
        Collections.sort(list, new Comparator<Customer>() {

            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }

        });
        return list;
    }

    List<Customer> getListSurname() {
        List<Customer> list = new ArrayList<Customer>(customerList);
        Collections.sort(list, new Comparator<Customer>() {

            public int compare(Customer o1, Customer o2) {
                return o1.getSurname().compareToIgnoreCase(o2.getSurname());
            }
        });
        return list;
    }

    List<Customer> getListDiapasonCardNumber(int diapasonStart, int diapasonEnd) {
        List<Customer> list = new ArrayList<Customer>();
        for (Customer c : customerList) {
            if (c.getCardNumber() >= diapasonStart && c.getCardNumber() <= diapasonEnd) {
                list.add(c);
            }
        }
        return list;
    }

}

