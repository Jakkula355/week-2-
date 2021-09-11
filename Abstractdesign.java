class Abstractdesign 
{
    public static void main(String[] args)
    {
        System.out.println(FolderFactory.buildFolder(FolderType.TENSLIDES));
        System.out.println(FolderFactory.buildFolder(FolderType.TWENTYSLIDES));
        System.out.println(FolderFactory.buildFolder(FolderType.FIFTYSLIDES));
    }
}