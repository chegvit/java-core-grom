package lesson11.biginterfaceexample;

public class File {
    private String name;
    private String path;
    private String extention;
    private int size;

    public File(String name, String path, String extention, int size) {
        this.name = name;
        this.path = path;
        this.extention = extention;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getExtention() {
        return extention;
    }

    public int getSize() {
        return size;
    }
}
