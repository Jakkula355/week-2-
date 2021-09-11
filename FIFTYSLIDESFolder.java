class FIFTYSLIDESFolder extends Folder
{
    FIFTYSLIDESFolder(Color color)
    {
        super(FolderType.FIFTYSLIDES, color);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("FIFTYSLIDES Folder");
    }
}