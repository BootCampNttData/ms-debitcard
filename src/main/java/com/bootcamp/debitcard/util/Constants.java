package com.bootcamp.debitcard.util;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@RequiredArgsConstructor
public class Constants {
    @Value("${constants.url.server}")
    public static String gwServer;

}
