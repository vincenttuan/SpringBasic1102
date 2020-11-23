package com.mycompany.springbasic1102.jdbc.invoice.dao;

import com.mycompany.springbasic1102.jdbc.invoice.entity.Item;
import java.util.List;
import org.simpleflatmapper.jdbc.spring.JdbcTemplateMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiceDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public List<Item> queryIntem() {
        // SimpleFlatMapper
        ResultSetExtractor<List<Item>> mapper = JdbcTemplateMapperFactory
                .newInstance()
                .addKeys("id")
                .newResultSetExtractor(Item.class);
        String sql = "SELECT  im.ID, im.AMOUNT, \n"
                + "inv.ID as invoice_id, inv.INVDATE as invoice_invdate,\n"
                + "ip.ID as product_id, ip.TEXT as product_text, ip.PRICE as product_price, \n"
                + "ip.INVENTORY as product_inventory \n"
                + "FROM ITEM im, Invoice inv, ItemProduct ip \n"
                + "WHERE im.INVID = inv.ID AND im.IPID = ip.ID";
        List<Item> items = jdbcTemplate.query(sql, mapper);
        return items;
    }
}
