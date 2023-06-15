package pckg_exytended_04;

import java.io.Serializable;
import java.util.Arrays;

public class Programmer implements Serializable {

    private String name;
    private String mail;
    private String experience;
    private String skills;
    private String[] languages = new String[3];
    private String area;

    public Programmer(String name, String mail, String experience, String skills, String[] languages, String area) {
        this.name = name;
        this.mail = mail;
        this.experience = experience;
        this.skills = skills;
        this.languages = languages;
        this.area = area;

    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getExperience() {
        return experience;
    }

    public String getSkills() {
        return skills;
    }

    public String[] getLanguages() {
        return languages;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", experience='" + experience + '\'' +
                ", skills='" + skills + '\'' +
                ", languages=" + Arrays.toString(languages) +
                ", area='" + area + '\'' +
                '}';
    }
}

