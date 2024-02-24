package edu.eci.cvds.tdd.registry;

public class validadAge {


    public boolean checkAge(int age) throws Exception {
        boolean result = false;
        if(age < 0 || age >=137)
        {
            throw new Exception();
        }
        else if(age >= 0 && age < 18)
        {
            result = true;
        }
        else if(age >= 18)
        {
            result = false;
        }
        return result;
    }
}
