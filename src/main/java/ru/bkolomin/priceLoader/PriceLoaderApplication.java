package ru.bkolomin.priceLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.bkolomin.priceLoader.Models.PriceItem;
import ru.bkolomin.priceLoader.Service.PriceService;

import java.util.List;

@SpringBootApplication
public class PriceLoaderApplication implements CommandLineRunner {

	static Logger logger = LoggerFactory.getLogger(PriceLoaderApplication.class);




	public static void main(String[] args) {

		logger.error("start app");

		ConfigurableApplicationContext springContext = new ClassPathXmlApplicationContext("spring-app.xml", "spring-db.xml");

		PriceService priceService = springContext.getBean(PriceService.class);

		priceService.loadAllFiles();


		SpringApplication.run(PriceLoaderApplication.class, args);

		logger.error("end app");
	}

	@Override
	public void run(String... args) {

		List<PriceItem> list = PriceService.getPriceItems("D:\\_Share\\_pricer\\Верисел.xls");

	}
}
