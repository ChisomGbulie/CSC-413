// File: JSPrototype.java
import java.util.HashMap;
import java.util.Map;

public class JSPrototype {
    private Map<String, Object> properties;
    private JSPrototype prototype;
    
    public JSPrototype() {
        this.properties = new HashMap<>();
        this.prototype = null;
    }
    
    public JSPrototype(JSPrototype prototype) {
        this.properties = new HashMap<>();
        this.prototype = prototype;
    }
    
    public void setProperty(String key, Object value) {
        properties.put(key, value);
    }
    
    public Object getProperty(String key) {
        // JavaScript-like prototype chain lookup
        if (properties.containsKey(key)) {
            return properties.get(key);
        } else if (prototype != null) {
            return prototype.getProperty(key);
        }
        return null;
    }
    
    public boolean hasOwnProperty(String key) {
        return properties.containsKey(key);
    }
    
    // Simulate JavaScript's Object.create()
    public static JSPrototype create(JSPrototype proto) {
        return new JSPrototype(proto);
    }
    
    // Simulate constructor pattern
    public JSPrototype callAsConstructor() {
        JSPrototype newObj = new JSPrototype(this);
        // Simulate constructor initialization if needed
        return newObj;
    }
}