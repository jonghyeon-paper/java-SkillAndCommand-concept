package sample.archetype;

public abstract class AbstractCommand implements ArchetypeCommand {
	
	protected String aliasName;
	
	@Override
	public String toSerializationData() {
		return this.getClass().getSimpleName() + "(" + aliasName + ")";
	}
	
}
