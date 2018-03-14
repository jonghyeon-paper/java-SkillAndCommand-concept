package sample.skill;

import java.util.Map;

import sample.archetype.AbstractSkill;
import sample.command.CommandAlfa;

public class SkillAlpha extends AbstractSkill {
	
	public SkillAlpha() {
		super.commandMap.put("Alfa", new CommandAlfa("Alfa"));
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
