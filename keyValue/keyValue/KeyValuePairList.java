package keyValue;

/**
 * @author Kevin Mora
 *
 * @param <K>
 * @param <V>
 */
public class KeyValuePairList <K extends Comparable<K>,V> 
	implements Comparable <KeyValuePairList<K,V>> {
	
    private K key;
    private V value;

    /**
     * Extension from KeyValuePair's
     * constructor with new reference
     * type arguments.
     */
    public KeyValuePairList(K key,V value){
        this.key = key;
        this.value = value;
    }

    /**
     * @return the value of k 
     * of reference type Key.
     */
    public K getKey(){
        return key;
    }
    public void setKey(K key){
        this.key = key;
    }
    
    /**
     * @return the Value value 
     * of reference type Value.
     */
    public V getValue(){
        return value;
    }
    public void setValue(V value){
        this.value = value;
    }

    @Override
    /**
     * Key generator.
     */
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    /**
     * Specify the restriction on type K only once 
     * - when you first introduce the type parameter.
     */
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        KeyValuePairList<?, ?> other = ((KeyValuePairList<?, ?>) obj);
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    /**
     * Converts value to String characters.
     */
    public String toString(){
        return key + ": " + value;
    }

    @Override
    /**
     * Finds out whether a key value 
     * is smaller or greater.
     */
    public int compareTo(KeyValuePairList<K, V> o){
        if(this.key.hashCode() > o.getKey().hashCode())
            return 1;
        else if(this.key.hashCode() < o.getKey().hashCode())
            return -1;
        else return 0;
    }
}
