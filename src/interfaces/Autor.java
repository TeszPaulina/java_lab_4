package interfaces;

public interface Autor {
    /* w interfejsie można deklarować i implementować zmienne stałe
     * stałe w programiw deklarujemy za pomocą operatora final */
    final String autor = "Krzysztof Muller";

    /* W interfejsie można tworzyć ciało metod przy użyciu operatora default
     * ale na ogół unika się tego */
    default String getAutor() {
        return autor + "!";
    }

}
