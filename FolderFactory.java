class FolderFactory
{
    private FolderFactory() 
    {
          
    }
    public static Folder buildFolder(FolderType type)
    {
        Folder folder = null;
        
        Color color = Color.GREY; 
          
        switch(color)
        {
            case GREEN:
                folder = GREENFolderFactory.buildFolder(type);
                break;
                  
            case GREY:
                folder = GREYFolderFactory.buildFolder(type);
                break;
                      
            default:
                folder = DefaultFolderFactory.buildFolder(type);
  
        }
          
        return folder;
  
    }
}
  