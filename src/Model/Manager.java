package Model;

import java.io.Serializable;

public class Manager implements Serializable
{
    private String manager_id;
    private String manager_name;
    private String manager_pswd;

    public Manager(){}
    public Manager(String manager_id,String manager_name,String manager_pswd)
    {
        this.manager_id = manager_id;
        this.manager_name = manager_name;
        this.manager_pswd = manager_pswd;
    }

    public String getManager_id()
    {
        return manager_id;
    }
    public void setManager_id(String id)
    {
        manager_id = id;
    }

    public String getManager_name()
    {
        return manager_name;
    }
    public void setManager_name(String name)
    {
        manager_name = name;
    }

    public String getMamager_pswd()
{
    return manager_pswd;
}
    public void setManager_pswd(String pswd)
    {
        manager_pswd = pswd;
    }
}
