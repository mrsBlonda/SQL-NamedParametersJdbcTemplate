package prohvataeva.dao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import prohvataeva.dao.repository.SQLRepository;
import prohvataeva.dao.repository.model.Customers;

import java.util.List;

@RestController
public class SQLController {

    final
    SQLRepository sqlRepository;

    public SQLController(SQLRepository sqlRepository) {
        this.sqlRepository = sqlRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam("name") String name) {
        return sqlRepository.getProductName(name);
    }
}
