public class SimpleXMLRpcTest
{
	public String hello()
	{
		return "hello world";
	}
 
	public static void main(String[] args) throws Exception
	{
		System.out.println("starting server");
		SimpleXmlRpcServer server = new SimpleXmlRpcServer(7777);
		server.addHandler("zen", new SimpleXMLRpcTest());
		server.serve_forever();
 
		while (true)
		{
			System.out.println("");
			Thread.sleep(60 * 60 * 60);
		}
	}
}