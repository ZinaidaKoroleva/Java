package Seminars.Seminar6;

import java.time.LocalDate;

public class Vaccination {
    private LocalDate date;
    private String produser;
    private String name;

    public Vaccination(LocalDate date, String produser, String name) {
        this.date = date;
        this.produser = produser;
        this.name = name;
    }

    public LocalDate getDate(){
        return date;
    }

    // public void setDate(LocalDate date){
    //     this.date = date;
    // }

    
    @Override
    public String toString() {
        return "Vaccination [date=" + date + ", produser=" + produser + ", name=" + name + "]";
    }

    public String getProduser() {
        return produser;
    }


    public String getName() {
        return name;
    }
    
}

