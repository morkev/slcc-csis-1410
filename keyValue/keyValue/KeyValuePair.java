package keyValue;

/**
 * @author Kevin Mora
 *
 * Declaration of <code>KeyValuePair</> 
 * as a generic class with two type 
 * parameters, K and V.
 *
 * @param <Key>
 * @param <Value>
 */
class KeyValuePair<Key, Value> {
   private Key k;
   private Value v;

   /**
    * @return the value of k 
    * of reference type Key.
    */
   public Key getK(){
      return k;
   }
   public void setK(Key k){
      this.k = k;
   }

   /**
    * An instance of a KeyValuePair<K, V> 
    * is smaller if and only if the key value 
    * is smaller. Similarly, an instance of a 
    * KeyValuePair<K, V> is greater than another 
    * if and only if the key value is greater.
    */
   public KeyValuePair(Key k, Value v){
      this.k = k;
      this.v = v;
   }

   @Override
   /**
    * Specify the restriction on type K only once 
    * - when you first introduce the type parameter.
    */
   public boolean equals(Object o){
      if (this == o) {
    	  return true; 
      }
      if (!(o instanceof KeyValuePair)){
    	  return false; 
      }
      KeyValuePair<?, ?> that = (KeyValuePair<?, ?>) o;
   
      if (k != null ? !k.equals(that.k) : that.k != null){
    	  return false;
      }
      return !(v != null ? !v.equals(that.v) : that.v != null);
   }

   @Override
   /**
    * Key generator.
    */
   public int hashCode(){
      int result = k != null ? k.hashCode() : 0;
      result = 31 * result + (v != null ? v.hashCode() : 0);
      return result;
   }

   @Override
   /**
    * Converts value to String characters.
    */
   public String toString(){
      return "(" + k + ", " + v + ")";
   }
}