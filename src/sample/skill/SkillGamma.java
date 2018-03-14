package sample.skill;

import java.util.Map;

import sample.archetype.AbstractSkill;
import sample.command.CommandAlfa;
import sample.command.CommandCharlie;
import sample.command.CommandDelta;
import sample.command.CommandEcho;

public class SkillGamma extends AbstractSkill {
	
	public SkillGamma() {
		super.commandMap.put("AlfaStart", new CommandAlfa("AlfaStart"));
		super.commandMap.put("Delta", new CommandDelta("Delta"));
		super.commandMap.put("Charlie1", new CommandCharlie("Charlie1"));
		super.commandMap.put("Charlie2", new CommandCharlie("Charlie2"));
		super.commandMap.put("Charlie3", new CommandCharlie("Charlie3"));
		super.commandMap.put("Echo", new CommandEcho("Echo"));
		super.commandMap.put("AlfaEnd", new CommandAlfa("AlfaEnd"));
		
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
	};

}
