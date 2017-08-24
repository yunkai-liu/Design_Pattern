package command;

import java.util.ArrayList;
import java.util.List;

public class Waiter 
{
	private List<Command> commands = new ArrayList<Command>();
	
	public void addCommand(Command command)
	{
		commands.add(command);
	}
	
	public void undoCommand(Command command)
	{
		commands.remove(command);
	}
	
	public void executeAllCommands()
	{
		for(Command command : commands)
		{
			command.executeCommand();
		}
	}
}