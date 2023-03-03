/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginstanceof;

public class InstanceOf {

    public static void main(String[] args) 
    {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Arkadiusz","Włodarczyk",10000);
        osoba[1] = new Student("Radosław","Potyrała");
        
        for(Osoba person: osoba)
        {
            if(person instanceof Pracownik)
            {
                ((Pracownik)person).PobierzOpis();
            }
            
        }
    }
    
}

abstract class Osoba
{
    String imie;
    String nazwisko;
    
    Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    abstract void PobierzOpis();
}

class Pracownik extends Osoba
{
    double wynagrodzenie;
    Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void PobierzOpis() 
    {
        System.out.println("Jestem pracownikiem");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wynagrodzenie: " + wynagrodzenie);
    }
    
    void Pracuj()
    {
        System.out.println("Ja pracuje");
    }
        
    
}

class Student extends Osoba
{
    Student(String imie, String nazwisko)
    {
        super(imie, nazwisko);
    }

    @Override
    void PobierzOpis() 
    {
        System.out.println("Jestem studentem");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
    }
}
