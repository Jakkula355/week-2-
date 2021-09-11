class GREYFolderFactory
{
    static Folder buildFolder(FolderType model)
    {
        Folder folder = null;
        switch (model)
        {
            case TENSLIDES:
                folder = new TENSLIDESFolder(Color.GREY);
                break;
              
            case TWENTYSLIDES:
                folder = new TWENTYSLIDESFolder(Color.GREY);
                break;
                  
            case FIFTYSLIDES:
                folder = new FIFTYSLIDESFolder(Color.GREY);
                break;
                  
                default:
                break;
              
        }
        return folder;
    }
}
  