package CS_Rabu_MirzaAdiRaffiansyah_OOP1;


/**
 * Write a description of class MataPelajaran here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MataPelajaran
{
    // instance variables - replace the example below with your own
    public String namaMataPelajaran;
    public Guru guru;
    public Penilaian UTS;
    public Penilaian UAS;
    public float nilaiUTS;
    public float nilaiUAS;

    /**
     * Constructor for objects of class MataPelajaran
     */
    public MataPelajaran(String namaMataPelajaran, Guru guru)
    {
        this.namaMataPelajaran = namaMataPelajaran;
        this.guru = guru;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addNilai (Penilaian UTS, float nilaiUTS, Penilaian UAS, float nilaiUAS)
    {
        this.UTS = UTS;
        this.nilaiUTS = nilaiUTS;
        this.UAS = UAS;
        this.nilaiUAS = nilaiUAS;
    }
    
    public void showDetail()
    {
        System.out.println("Mata Pelajaran:" + namaMataPelajaran);
        System.out.println("Nama Guru:" + guru.name);
        System.out.println("Nilai UTS:" + nilaiUTS);
        System.out.println("Nilai UAS:" + nilaiUAS);
    }
}
