package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer, Customer> customerMap;

    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1, "Huỳnh", "huynh@codegym.vn", "Thái Nguyên", "image/1.JPG"));
        customerMap.put(2, new Customer(2, "Tuấn Anh", "tuananh@codegym.vn", "Hưng Yên", "image/2.JPG"));
        customerMap.put(3, new Customer(3, "Thu", "thu@codegym.vn", "Hà Nội", "image/3.JPG"));
        customerMap.put(4, new Customer(4, "Khánh", "khanh@codegym.vn", "Hà Tĩnh", "image/4.JPG"));
        customerMap.put(5, new Customer(5, "Nghĩa", "nghia@codegym.vn", "Hà Nội", "image/5.JPG"));
        customerMap.put(6, new Customer(6, "Tùng", "tung@codegym.vn", "Hưng Yên", "image/6.JPG"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
