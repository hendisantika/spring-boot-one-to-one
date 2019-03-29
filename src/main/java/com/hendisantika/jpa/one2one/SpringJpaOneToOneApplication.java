package com.hendisantika.jpa.one2one;

import com.hendisantika.jpa.one2one.model.Husband;
import com.hendisantika.jpa.one2one.model.Wife;
import com.hendisantika.jpa.one2one.repository.HusbandRepository;
import com.hendisantika.jpa.one2one.repository.WifeRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringJpaOneToOneApplication implements CommandLineRunner {
    private static Logger logger = LogManager.getLogger(SpringJpaOneToOneApplication.class);

    @Autowired
    WifeRepository wifeRepository;

    @Autowired
    HusbandRepository husbandRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaOneToOneApplication.class, args);
    }

    @Override
    public void run(String... arg0) {
        deleteData();
        saveData();
        showData();
    }

    @Transactional
    private void deleteData() {
        wifeRepository.deleteAll();
        husbandRepository.deleteAll();
    }

    @Transactional
    private void saveData() {
        // Store a wife to DB
        Wife lisa = new Wife("Lisa", new Husband("David"));
        wifeRepository.save(lisa);

        // Store list wifes to DB
        Wife mary = new Wife("Mary", new Husband("Peter"));
        Wife lauren = new Wife("Lauren", new Husband("Phillip"));

        wifeRepository.save(Arrays.asList(mary, lauren));
    }

    @Transactional
    private void showData() {
        // get All data
        List<Wife> wifes = wifeRepository.findAll();
        List<Husband> husbands = husbandRepository.findAll();

        logger.info("===================Wifes:==================");
        wifes.forEach(System.out::println);

        logger.info("===================Husbands:==================");
        husbands.forEach(System.out::println);
    }
}