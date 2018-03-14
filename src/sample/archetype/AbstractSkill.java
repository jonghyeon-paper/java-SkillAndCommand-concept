package sample.archetype;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class AbstractSkill implements ArchetypeSkill {
	
	protected static final String NEWLINE = System.getProperty("line.separator");
	
	protected Map<String, ArchetypeCommand> commandMap = new LinkedHashMap<>();
	
	@Override
	public boolean hasCommand(String aliasName) {
		return commandMap.containsKey(aliasName);
	}
	
	@Override
	public ArchetypeCommand getCommand(String aliasName) {
		return commandMap.get(aliasName);
	}
	
	@Override
	public String toSerializationData() {
		StringBuilder sb = new StringBuilder();
		for (String key : commandMap.keySet()) {
			sb.append(key).append(" : ").append(commandMap.get(key).toSerializationData());
			sb.append(NEWLINE);
		}
		return sb.toString();
	}

}
