package net.khoroshev.sbs.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Dictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String thename;
    private String rhymp;
}
