abstract class Folder
{
    Folder(FolderType model, Color color)
    {
        this.model = model;
        this.color = color;
    }
   
    abstract void construct();
   
    FolderType model = null;
    Color color = null;
   
    FolderType getModel()
    {
        return model;
    }
   
    void setModel(FolderType model)
    {
        this.model = model;
    }
   
    Color geColor()
    {
        return color;
    }
   
    void setColor(Color color)
    {
        this.color = color;
    }
   
    @Override
    public String toString()
    {
        return "FolderModel - "+model + " color is "+color;
    }
}