package com.zrzy.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/15
 * Time: 16:58
 */
public class Person {

    private Integer age;
    private String name;
    private Dog dog=new Dog();
    private List<String> address;
    private Set<String> hobby;
    private Map<String,String> dream;
    private Properties properties; // 性能

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, String> getDream() {
        return dream;
    }

    public void setDream(Map<String, String> dream) {
        this.dream = dream;
    }

    public Set<String> getHobby() {
        return hobby;
    }

    public void setHobby(Set<String> hobby) {
        this.hobby = hobby;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Person() {
    }

    public Person(Integer age, String name, Dog dog) {
        this.age = age;
        this.name = name;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
