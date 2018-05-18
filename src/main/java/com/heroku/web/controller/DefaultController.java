/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping(value = "/home")
public class DefaultController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        String sql="select * from departments";
        List<String> departments=jdbcTemplate.query(sql,
                new RowMapper<String>() {

            public String mapRow(ResultSet rs, int i) throws SQLException {
                return rs.getString("name");
            }
        });
        model.addAttribute("title", "Ayushman App");
        model.addAttribute("departments", departments);
        
        return "index";
    }
}
