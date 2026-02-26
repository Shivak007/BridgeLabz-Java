package designpatterns;
interface FileService { void access(); }
class RealFileService implements FileService {
    public void access(){ System.out.println("Accessing File"); }
}
class FileAccessProxy implements FileService {
    private RealFileService real = new RealFileService();
    public void access(){
        String role="USER";
        if("ADMIN".equals(role)) real.access();
        else System.out.println("Access Denied");
    }
}
public class Proxy {
    public static void main(String[] args){
        new FileAccessProxy().access();
    }
}
