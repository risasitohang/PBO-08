package mapping;
// Generated Jul 8, 2020 8:52:38 AM by Hibernate Tools 4.3.1



/**
 * Hasil generated by hbm2java
 */
public class Hasil  implements java.io.Serializable {


     private int id;
     private String nama;
     private String hasil;

    public Hasil() {
    }

	
    public Hasil(int id) {
        this.id = id;
    }
    public Hasil(int id, String nama, String hasil) {
       this.id = id;
       this.nama = nama;
       this.hasil = hasil;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getHasil() {
        return this.hasil;
    }
    
    public void setHasil(String hasil) {
        this.hasil = hasil;
    }




}


