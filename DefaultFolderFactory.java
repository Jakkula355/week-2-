class DefaultFolderFactory
{
    public static Folder buildFolder(FolderType model)
    {
        Folder folder = null;
        switch (model)
        {
            case TENSLIDES:
                folder = new TENSLIDESFolder(Color.DEFAULT);
                break;
              
            case TWENTYSLIDES:
                folder = new TWENTYSLIDESFolder(Color.DEFAULT);
                break;
                  
            case FIFTYSLIDES:
                folder = new FIFTYSLIDESFolder(Color.DEFAULT);
                break;
                  
                default:
                break;
              
        }
        return folder;
    }
}