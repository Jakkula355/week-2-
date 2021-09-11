class GREENFolderFactory
{
    public static Folder buildFolder(FolderType model)
    {
        Folder folder = null;
        switch (model)
        {
            case TENSLIDES:
                folder = new TENSLIDESFolder(Color.GREEN);
                break;
              
            case TWENTYSLIDES:
                folder = new TWENTYSLIDESFolder(Color.GREEN);
                break;
                  
            case FIFTYSLIDES:
                folder = new FIFTYSLIDESFolder(Color.GREEN);
                break;
                  
                default:
                break;
              
        }
        return folder;
    }
}