package sample.archetype;

import java.util.Map;

public interface ArchetypeCommand {
	
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
	
	//TODO 필요한 메소드 등록..
}
