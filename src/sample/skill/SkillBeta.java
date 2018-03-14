package sample.skill;

import java.util.Map;

import sample.archetype.AbstractSkill;
import sample.command.CommandAlfa;
import sample.command.CommandCharlie;
import sample.command.CommandDelta;

public class SkillBeta extends AbstractSkill {
	
	public SkillBeta() {
		super.commandMap.put("Alfa", new CommandAlfa("Alfa"));
		super.commandMap.put("Charlie", new CommandCharlie("Charlie"));
		super.commandMap.put("Delta", new CommandDelta("Delta"));
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
