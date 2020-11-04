package Condiment;

public class Condiment {
    private String vanilla=".50";

    private String cream=".25";

    private String chocolate="1";

    public String getVanilla() {

        return vanilla;

    }

    public String getCream() {

        return cream;

    }

    public String getChocolate() {

        return chocolate;

    }

    public String addCondiment(String num)

    {

        if(num.equals("1"))

        {

            return getVanilla();

        }

        else if(num.equals("2"))

        {

            return getCream();
        }

        else if(num.equals("3"))

        {

            return getChocolate();

        }

        else

        {

            return "0";

        }



    }
}
