package skripsi;


/**
* @generated
*/
public class Rabbit {
    
    /**
    * @generated
    */
    private int KEYSTREAM_LENGTH;
    
    /**
    * @generated
    */
    private Integer[] A;
    
    /**
    * @generated
    */
    private Integer[] X;
    
    /**
    * @generated
    */
    private Integer[] C;
    
    /**
    * @generated
    */
    private byte b;
    
    /**
    * @generated
    */
    private int keyindex;
    
    /**
    * @generated
    */
    private Byte[] keystream;
    
    
    
    /**
     * @generated
     */
    public Rabbit(Integer[] X, Integer[] C, int KEYSTREAM_LENGTH, Integer[] A) {
        this.X = X;
        this.C = C;
        this.KEYSTREAM_LENGTH = KEYSTREAM_LENGTH;
        this.A = A;
    }
    

    /**
    * @generated
    */
    private int getKEYSTREAM_LENGTH() {
        return this.KEYSTREAM_LENGTH;
    }
    
    /**
    * @generated
    */
    private Integer[] getA() {
        return this.A;
    }
    
    /**
    * @generated
    */
    private Integer[] getX() {
        return this.X;
    }
    
    /**
    * @generated
    */
    private Integer[] getC() {
        return this.C;
    }
    
    /**
    * @generated
    */
    private byte getB() {
        return this.b;
    }
    
    /**
    * @generated
    */
    private byte setB(Byte b) {
        this.b = b;
    }
    
    
    /**
    * @generated
    */
    private int getKeyindex() {
        return this.keyindex;
    }
    
    /**
    * @generated
    */
    private int setKeyindex(Integer keyindex) {
        this.keyindex = keyindex;
    }
    
    
    /**
    * @generated
    */
    private Byte[] getKeystream() {
        return this.keystream;
    }
    
    /**
    * @generated
    */
    private Byte[] setKeystream(Byte[] keystream) {
        this.keystream = keystream;
    }
    
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    private int rotl() {
        //TODO
        return 0;
    }
    
    /**
    * @generated
    */
    public Rabbit() {
        //TODO
    }
    /**
    * @generated
    */
    public Character decryptChar() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public byte crypt() {
        //TODO
        return 0x0;
    }
    
    /**
    * @generated
    */
    private byte keyStream() {
        //TODO
        return 0x0;
    }
    
    /**
    * @generated
    */
    private void nextState() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void reset() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void setupIV() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void setupIV() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void setupKey() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void setupKey() {
        //TODO
    }
    
    
}
