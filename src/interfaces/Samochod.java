package interfaces;
import enums.PaliwoEnum;

/* interfejsy mogą dziedziczyć po sobie (operator extends) */
public interface Samochod extends Pojazd, Autor {
    void setMarka(String marka);

    void setPrzebieg(int oryginalny, int odHandlarza);

    void setPaliwo(PaliwoEnum paliwo);

}
