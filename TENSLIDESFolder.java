class TENSLIDESFolder extends Folder
{
    TENSLIDESFolder(Color color)
    {
        super(FolderType.TENSLIDES,color );
        construct();
    }
      
    @Override
    void construct()
    {
        System.out.println("TENSLIDES Folder");
    }
}