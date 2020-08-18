package net.khoroshev.sbs.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Dictionary {

    @Id
    @GeneratedValue
    private Long id;
    
    private String thename;
    private String rhymp;
}
