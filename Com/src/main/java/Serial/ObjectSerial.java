package Serial;

import java.io.Serializable;
import java.util.Map;

public class ObjectSerial implements Serializable {
    private Step step;
    private FileSerial file;
    private Map <String, String> dir;

    public ObjectSerial(Step step, FileSerial file, Map<String, String> dir) {
        this.step = step;
        this.file = file;
        this.dir = dir;
    }

    public Step getStep() {
        return step;
    }

    public FileSerial getFile() {
        return file;
    }

    public Map<String, String> getDir() {
        return dir;
    }
}