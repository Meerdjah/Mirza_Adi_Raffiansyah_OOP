package CS_Rabu_MirzaAdiRaffiansyah_OOP1;


/**
 * Write a description of class Siswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Siswa implements Showing
{
    // instance variables - replace the example below with your own
    public String nama;
    public String status;
    public int id;
    public float totalNilai;
    public MataPelajaran mataPelajaran;

    /**
     * Constructor for objects of class Siswa
     */
    public Siswa(String nama, String status, int id, MataPelajaran mataPelajaran)
    {
        this.nama = nama;
        this.status = status;
        this.id = id;
        this.mataPelajaran = mataPelajaran;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void totalNilai()
    {
        totalNilai = (40*mataPelajaran.nilaiUTS)/100 + (60*mataPelajaran.nilaiUAS)/100;
        if(totalNilai >= 75)
        {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }
    }
    
    public void showDetail()
    {
        System.out.println("Nama Siswa:" + nama);
        System.out.println("ID:" + id);
        System.out.println("Mata Pelajaran:" + mataPelajaran);
        System.out.println("Total Nilai:" + totalNilai);
        System.out.println("Status:" + status);
    }
}
