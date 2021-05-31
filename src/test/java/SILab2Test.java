import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Integer;

import static org.junit.Assert.*;

public class SILab2Test {
    private final SILab2 pom_objekt = new SILab2();
    private List<Integer> lista_Integers (Integer... elements){
        return new ArrayList<>(Arrays.asList(elements));
    }
    private List<Time> pom_lista (Time... elements){
        return new ArrayList<>(Arrays.asList(elements));
    }
    RuntimeException pom_ex;

    @Test
    public void emptyListTest() {
        assertEquals(pom_lista().size(),0);
    }

    @Test
    public void multipleConditionTesting() {
        try {
            pom_objekt.function(pom_lista(new Time(-5,5,5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The hours are smaller than the minimum"); }

        try {
            pom_objekt.function(pom_lista(new Time(25,5,5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The hours are grater than the maximum"); }

        assertEquals(lista_Integers(3665)
                ,pom_objekt.function(pom_lista(new Time(1,1,5))));

        try {
            pom_objekt.function(pom_lista(new Time(1,-5,5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The minutes are not valid!"); }

        try {
            pom_objekt.function(pom_lista(new Time(1,65,5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The minutes are not valid!"); }

        try {
            pom_objekt.function(pom_lista(new Time(1,5,-5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The seconds are not valid"); }

        try {
            pom_objekt.function(pom_lista(new Time(1,5,65)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The seconds are not valid"); }


        assertEquals(lista_Integers(86400)
                ,pom_objekt.function(pom_lista(new Time(24,0,0))));

        try {
            pom_objekt.function(pom_lista(new Time(24,5,0)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The time is greater than the maximum"); }

        try {
            pom_objekt.function(pom_lista(new Time(24,0,5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The time is greater than the maximum"); }
    }


    @Test
    public void everyBranchTesting() {
        try {
            pom_objekt.function(pom_lista(new Time(-5,5,5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The hours are smaller than the minimum"); }

        try {
            pom_objekt.function(pom_lista(new Time(25,5,5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The hours are grater than the maximum"); }

        assertEquals(lista_Integers(3665)
                ,pom_objekt.function(pom_lista(new Time(1,1,5))));

        try {
            pom_objekt.function(pom_lista(new Time(1,-5,5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The minutes are not valid!"); }

        try {
            pom_objekt.function(pom_lista(new Time(1,65,5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The minutes are not valid!"); }

        try {
            pom_objekt.function(pom_lista(new Time(1,5,-5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The seconds are not valid"); }

        try {
            pom_objekt.function(pom_lista(new Time(1,5,65)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The seconds are not valid"); }


        assertEquals(lista_Integers(86400)
                ,pom_objekt.function(pom_lista(new Time(24,0,0))));

        try {
            pom_objekt.function(pom_lista(new Time(24,5,0)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The time is greater than the maximum"); }

        try {
            pom_objekt.function(pom_lista(new Time(24,0,5)));
        }
        catch (RuntimeException pom_ex){
            assertEquals(pom_ex.getMessage(),"The time is greater than the maximum"); }
    }

}