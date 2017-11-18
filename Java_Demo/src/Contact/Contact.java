package Contact;

public class Contact {
	int contactid;
	String contactname;
	long contactnumber;
	public Contact(int i, String string, int j) {
		this.contactid = i;
		this.contactname = string;
		this.contactnumber=j;
		
	}
	public int getContactid() {
		return contactid;
	}
	public void setContactid(int contactid) {
		this.contactid = contactid;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}

/*public String toString() {
	return "Contact [contactid=" + contactid + ", contactname="
			+ contactname + ", contactnumber=" + contactnumber + "]";
}*/
public String getContactname() {
	return contactname;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + contactid;
	result = prime * result
			+ ((contactname == null) ? 0 : contactname.hashCode());
	result = prime * result
			+ (int) (contactnumber ^ (contactnumber >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Contact other = (Contact) obj;
	if (contactid != other.contactid)
		return false;
	if (contactname == null) {
		if (other.contactname != null)
			return false;
	} else if (!contactname.equals(other.contactname))
		return false;
	if (contactnumber != other.contactnumber)
		return false;
	return true;
}
}