package Condiment;

public class Condiment {
    private String sugar =".50";

    private String cream=".25";

    private String milk ="1";

    public String getSugar() {

        return sugar;

    }

    public String getCream() {

        return cream;

    }

    public String getMilk() {

        return milk;

    }

    public String addCondiment(String num)

    {

        if(num.equals("1"))

        {

            return getSugar();

        }

        else if(num.equals("2"))

        {

            return getCream();
        }

        else if(num.equals("3"))

        {

            return getMilk();

        }

        else

        {

            return "0";

        }



    }
}
