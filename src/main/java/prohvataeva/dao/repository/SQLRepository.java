package prohvataeva.dao.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import prohvataeva.dao.repository.model.Customers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class SQLRepository {
    final private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public SQLRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;

    }


    public List<String> getProductName(String name) {
        List<String> customers;
        customers = namedParameterJdbcTemplate.queryForList(read("selectionOfName.sql"),
                Map.of("name", name), String.class);
        return customers;

    }

//    public Customers getProductName2(String name) {
//        List<Customers> customers;
//        Customers customers1 = namedParameterJdbcTemplate.queryForObject(read("selectionOfName.sql"),
//                Map.of("name", name),
//                (rs, rowNum) ->
//                        new Customers(rs.getString("name"), rs.getString("product_name")));
//        return customers1;
//    }





    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
