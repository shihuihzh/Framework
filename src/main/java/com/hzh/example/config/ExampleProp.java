package com.hzh.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * 获得配置文件配置
 * Created by Zhanhao Wong on 2016/10/30.
 */
@Component
@ConfigurationProperties(prefix = "example")
public class ExampleProp {

    String name;
    String description;
    String secret;
    int number;
    long bignumber;
    String uuid;

    @Value("${example.number.less.than.ten}")
    String numberLessThanTen;

    @Value("${example.number.in.range}")
    String numberInRange;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBignumber() {
        return bignumber;
    }

    public void setBignumber(long bignumber) {
        this.bignumber = bignumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNumberLessThanTen() {
        return numberLessThanTen;
    }

    public void setNumberLessThanTen(String numberLessThanTen) {
        this.numberLessThanTen = numberLessThanTen;
    }

    public String getNumberInRange() {
        return numberInRange;
    }

    public void setNumberInRange(String numberInRange) {
        this.numberInRange = numberInRange;
    }

    @Override
    public String toString() {
        return "ExampleProp{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", secret='" + secret + '\'' +
                ", number=" + number +
                ", bignumber=" + bignumber +
                ", uuid='" + uuid + '\'' +
                ", numberLessThanTen=" + numberLessThanTen +
                ", numberInRange=" + numberInRange +
                '}';
    }
}
