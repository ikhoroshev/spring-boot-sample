package net.khoroshev.sbs.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Dictionary {
    @Id
    private long id;
    private String thename;
    private String rhymp;
}
