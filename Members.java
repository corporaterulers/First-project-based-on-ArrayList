public class Members
{
    String name;
    String gender;
    String skill;
    //Set by constructor
    public Members(String n,String g)
    {
        name = n;
        gender = g;
        //skill = s;
    }
    public String toString()
    {
        return "Member of coders" + ": " +
                " Name : " + name +" "+"\n"+
                "Gender " + gender;
        //"Skill" + skill;
    }


}
