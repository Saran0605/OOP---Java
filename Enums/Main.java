package Enums;

public class Main {
    //enums are grouped collections of values years,months,days
    //also have index 0 .. n
    //.ordinal() for first index
    enum Week{
        Monday, Tuesaday, Wednesday, Thursday,Friday,Saturday ,Sunday
        //these are enum constants
        //every var is public,static and final
        //its final,cant create child enum
        //type is week
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week w : Week.values()){
            System.out.println(w);
        }
    }
}
