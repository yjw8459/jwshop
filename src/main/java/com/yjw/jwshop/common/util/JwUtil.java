package com.yjw.jwshop.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JwUtil {

    public static String getDate24Miss(){
        return LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("yyyyMMddHHmmss")
        );
    }


}
