package com.kbo.form.mb.test;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookProperty implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1166684151452115746L;
	
	private String name;  
    private Object value;  
    private boolean required;  
  
    public BookProperty(String name, boolean required) {  
        this.name = name;  
        this.required = required;  
    }  
  
    public BookProperty(String name, Object value, boolean required) {  
        this.name = name;  
        this.value = value;  
        this.required = required;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public Object getValue() {  
        return value;  
    }  
  
    public Object getFormattedValue() {  
        if (value instanceof Date) {  
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM yyyy");  
  
            return simpleDateFormat.format(value);  
        }  
  
        return value;  
    }  
  
    public void setValue(Object value) {  
        this.value = value;  
    }  
  
    public boolean isRequired() {  
        return required;  
    }  
  
    public void setRequired(boolean required) {  
        this.required = required;  
    }  
}
