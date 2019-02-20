package com.hellsinner.demo.commponent;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvter implements Converter<String, Date> {
    private static final SimpleDateFormat FORMAT
            = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date convert(String s) {
        try {
            return FORMAT.parse(s);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
