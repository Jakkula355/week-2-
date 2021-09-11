class TWENTYSLIDESFolder extends Folder
{
    TWENTYSLIDESFolder(Color color)
    {
        super(FolderType.TWENTYSLIDES, color);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("TWENTYSLIDES Folder");
    }
}