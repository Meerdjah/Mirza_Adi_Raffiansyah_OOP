package CS_Rabu_MirzaAdiRaffiansyah_OOP1;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args)
    {
        Guru guruIPA = new Guru("Mr. Budi", 20);
        MataPelajaran IPA = new MataPelajaran("IPA", guruIPA);
        Siswa Mirza = new Siswa("Mirza", 69, IPA);
        IPA.addNilai(Penilaian.UTS, 100, Penilaian.UAS, 100);
        Mirza.totalNilai();
        IPA.showDetail();
        Mirza.showDetail();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    }
