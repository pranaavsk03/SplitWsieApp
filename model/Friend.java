package model;

public class Friend {
private final String Name;
private static int lastId=0;
private  int Id;




    /**
     * @param  name  its string variable to  get the name of friend
     * It is method with a parameter and no return value
     */
public Friend(String name)
{

    lastId=lastId+1;
    Id=lastId;
   this.Name=name;
}

    /**
     * its accessor method to return the name of friend
     *   @return the  name value
     */
public String getName()
{

    return this.Name;
}
    /**
     *  its also accessor method to return the id
     * @return id of friend
     */
public int getid()
{


    return this.Id;
}

}
