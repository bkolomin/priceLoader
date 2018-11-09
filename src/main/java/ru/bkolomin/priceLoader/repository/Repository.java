package ru.bkolomin.priceLoader.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.bkolomin.priceLoader.Models.PriceItem;

@Repository
public class Repository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public Repository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void save(PriceItem newsItem){

        /*jdbcTemplate.update("REPLACE INTO `_reader_news` (url,type,title, description, commentsNum) VALUES (?, ?, ?, ?, ?)",
               newsItem.getUrl(), newsItem.getType(), newsItem.getTitle(), newsItem.getDescription(), newsItem.getCommentsCount());
               */
    }

}
