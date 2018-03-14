package sample.command;

import java.util.Map;

import sample.archetype.AbstractCommand;

public class CommandBravo extends AbstractCommand {

	public CommandBravo(String aliasName) {
		super.aliasName = aliasName;
	}

	@Override
	public void toInstanceObject(String data) {
		// TODO 스트링 데이터를 객체정보로 전환
	}

	@Override
	public <K, V> void toInstanceObject(Map<K, V> data) {
		for (K key : data.keySet()) {
			// 어떤 타입인지 확인하고 적절하게 처리
		}
	}
}
