package sample.archetype;

import java.util.Map;

public interface ArchetypeSkill {
	
	/**
	 * 커맨드 조회
	 * @param aliasName
	 * @return
	 */
	boolean hasCommand(String aliasName);
	
	/**
	 * 커맨드 접근
	 * @param aliasName
	 * @return
	 */
	ArchetypeCommand getCommand(String aliasName);
	
	/**
	 * 오브젝트 데이터를 직렬화
	 * @return
	 */
	String toSerializationData();
	
	/**
	 * 직렬 데이터를 오브젝트화
	 * @param data
	 */
	void toInstanceObject(String data);
	<K, V> void toInstanceObject(Map<K, V> data);
}
