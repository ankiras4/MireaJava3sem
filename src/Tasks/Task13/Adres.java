package Tasks.Task13;

import java.util.StringTokenizer;

public class Adres {
    private String country, region, city, street, house, housing, flat;

    public Adres(String stringToParse) {
        String[] s;
        StringTokenizer st = new StringTokenizer(stringToParse, ",.;");
        s = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) s[i++] = st.nextToken();


        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}