package devf.b7actionbarandtoolbar.model;

/**
 * Created by Luis Galvan on 11/29/2015.
 */
public class TruckFood {


    private String Tname;
    private int Tstars;
    private String Ttypefood;
    private int Timage;
    private String Tcomment;


    public TruckFood(String tcomment, int timage, String tname, int tstars, String ttypefood) {
        Tcomment = tcomment;
        Timage = timage;
        Tname = tname;
        Tstars = tstars;
        Ttypefood = ttypefood;
    }


    public String getTcomment() {
        return Tcomment;
    }

    public int getTimage() {
        return Timage;
    }

    public int getTstars() {
        return Tstars;
    }

    public String getTname() {
        return Tname;
    }

    public String getTtypefood() {
        return Ttypefood;
    }

    //   ******************    SETTERS BEGIN

    public void setTcomment(String tcomment) {
        Tcomment = tcomment;
    }

    public void setTimage(int timage) {
        Timage = timage;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public void setTstars(int tstars) {
        Tstars = tstars;
    }

    public void setTtypefood(String ttypefood) {
        Ttypefood = ttypefood;
    }
}
