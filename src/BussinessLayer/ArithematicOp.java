package BussinessLayer;
import DataLinkLayer.DataConnection;
public class ArithematicOp {
	DataConnection dd=new DataConnection();
	public int add(int x,int y)
	{
		int z=x+y;
		dd.data(x,y,z,"addition");
		return z;
	}
	public int sub(int x,int y)
	{
		int z=x-y;
		dd.data(x, y, z, "subtract");
		return z;
	}
	public int mul(int x,int y)
	{
		int z=x*y;
		dd.data(x, y, z, "multiplication");
		return z;
	}
	public int div(int x,int y)
	{
		int z=x/y;
		dd.data(x, y, z, "division");
		return z;
	}
}
