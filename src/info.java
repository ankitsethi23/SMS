
public class info
{
private String sname;
private int sid;
private String sphone;

public info(String sname, int sid, String sphone)
  {
	super();
	this.sname = sname;
	this.sid = sid;
	this.sphone = sphone;
  }

public void displayinfo()
  {
    System.out.println("Student Name: "+sname);
    System.out.println("Student Id: "+sid);
    System.out.println("Student Phone: "+sphone);
  }
}
