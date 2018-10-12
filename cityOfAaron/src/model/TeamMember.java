/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gjwsi
 */
enum TeamMembers 
{
    GAVIN("Gavin","Siegel"),
    LAUREN("Lauren","Allred");
    
    private String name;
    private String title;
    
    TeamMembers(String _name,String _title)
    {
        name =_name;
        title =_title;
    }
    public String getName()
    {
        return name;
    }
    public String getTitle()
    {
        return title;
    }
}




