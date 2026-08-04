public class Friend {
private final String Name;
private static int lastId=0;
private  int Id;
public Friend(String name)
{
    lastId=lastId+1;
    Id=lastId;
   this.Name=name;
}
public String getName()
{

    return this.Name;
}
public int getid()
{
    return this.Id;
}

}
