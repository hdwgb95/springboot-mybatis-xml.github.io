package com.xinjock.nbteam.entity;
import com.xinjock.nbteam.enums.AuthorityEnum;
import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {

    private int id;

    private String userName;

    private AuthorityEnum authority;

}
