package lua;

import java.util.ArrayList;

public class LuaMainHandler {
	ArrayList<String> log;
	String playerList;
	
	public LuaMainHandler(){
		log = new ArrayList<String>();
		playerList = "";
	}
	
	public String hello() {
		return "hello Lua xml-RPC application :]";
	}
	public String connect(String playerList){
		updatePlayerList(playerList);
		return "conectado";
		
	}
	public String getPlayerList(){
		return playerList;
	}
	public int updatePlayerList(String newPlayerList){
		playerList = newPlayerList;
		return playerList.length();
	}
	public int logSize(){
		return log.size();
	}
	public String getMessage(int index){
		if(index < log.size()){
			return log.get(index);
		}
		else{
			return "";
		}
		
	}
	public String logMessage(String message){
		log.add(message);
		return "log success";
	}

}
