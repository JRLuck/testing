
public class Compare {
	public boolean flag;
	public boolean isbigger(int x,int y) {
		if(x>y) 
			flag=true;
		else
			flag=false;
		return flag;
	}
	public boolean issmaller(int x,int y) {
		if(x<y)
			flag=true;
		else
			flag=false;
		return flag;
	}
	public boolean isequal(int x,int y) {
		if(x==y)
			flag=true;
		else
			flag=false;
		return flag;
	}
}
