import flex.FlexMainHandler;
import lua.LuaMainHandler;

public class SimpleXMLRpcTest {
	public String hello() {
		return "hello world";
	}

	public static void main(String[] args) throws Exception {
		System.out.println("starting server");
		SimpleXmlRpcServer server = new SimpleXmlRpcServer(7777);
		server.addHandler("flexHandler", new FlexMainHandler());
		server.addHandler("luaHandler", new LuaMainHandler());
		server.serve_forever();
	}
}