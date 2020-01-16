package lesson19.homework19;

public class Controller {



    public void put (Storage storage, File file) throws Exception {


        try {
            if (checkFormat(storage, file) && checkMaxSizeStorage(storage, file) && checkFile(storage, file)) {
                int count = 0;
                for (File el : storage.getFiles()) {
                    if (el != null)
                        count++;
                }

                if (count > storage.getFiles().length)
                    throw new Exception("not place in storage");

                //  File[] res = new File[storage.getFiles().length];

                for (int i = 0; i < storage.getFiles().length; i++) {
                    if (storage.getFiles()[i] == null) {
                        storage.getFiles()[i] = file;
                        break;

                    }

                }
                storage.getFiles();

            }
        }

        finally {
            System.out.println("Done");
        }
       // catch (Exception e){
         //   System.out.println("error: file id " + file.getId() + " can't put to storage id " + storage.getId());
           // System.out.println(e.getMessage());
       // }

    }
    public void delete(Storage storage,File file) throws Exception {

        try {
            for (int i = 0; i < storage.getFiles().length;i++) {
            if (storage.getFiles()[i] != null && storage.getFiles()[i].getId() == file.getId()) {
                storage.getFiles()[i] = null;
                break;
            }

        }
            storage.getFiles();
        }
        finally {

            System.out.println("Done");

        }
    }
    public void transferAll(Storage storageFrom, Storage storageTo) throws Exception{

        try {

            for (File el : storageFrom.getFiles()) {
                     if(el != null){
                         put(storageTo, el);
                            delete(storageFrom,el);
                        }
                    }


            storageTo.getFiles();
        }
        finally {
            System.out.println("Done");

        }

    }
    public void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception{

        File findFile = null;
        for(File el : storageFrom.getFiles()){
            if(el.getId() == id) {
                findFile = el;
                break;
            }
        }
        try {
            put(storageTo,findFile);
            delete(storageFrom,findFile);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    private boolean foundFileInStorage(Storage storage,File file) throws Exception{
        for(int i = 0; i < storage.getFiles().length; i++){
            if( storage.getFiles()[i].getId() == file.getId() && storage.getFiles()[i].getName().equals(file.getName())){
                return true;
            }
        }
        throw new Exception("file is not in storage");
    }
    private boolean checkFile(Storage storage, File file) {
        try{
        for(int i = 0; i < storage.getFiles().length; i++){
            if(storage.getFiles()[i] != null && storage.getFiles()[i].getId() == file.getId() && storage.getFiles()[i].getName().equals(file.getName())){
                throw new Exception("file is already in storage");
            }
        }
        return true;
    }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean checkFormat(Storage storage, File file) throws Exception {
        try {
            int count = 0;
            for (int i = 0; i < storage.getFormatsSupported().length; i++) {
                if (!storage.getFormatsSupported()[i].equals(file.getFormat()))
                    count++;
            }
            if (count == storage.getFormatsSupported().length) {
                throw new Exception("wrong file format");
            }
          return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    private boolean checkMaxSizeStorage(Storage storage, File file) throws Exception{
        try{
        if(occupiedSpaceOfStorage(storage) + file.getSize() > storage.getStorageSize()) {
            throw new Exception("no storage space");
        }
       return true;
    }
     catch (Exception e){
         System.out.println(e.getMessage());
         return false;
        }
    }

    private long occupiedSpaceOfStorage(Storage storage) {
        long sum = 0;
        for(int i = 0; i < storage.getFiles().length; i++){
            if(storage.getFiles()[i] != null) {
                sum += storage.getFiles()[i].getSize();
            }
        }
        return sum;
    }


}






