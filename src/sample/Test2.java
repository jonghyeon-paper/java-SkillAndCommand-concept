package sample;

import sample.archetype.ArchetypeSkill;
import sample.skill.SkillGamma;

public class Test2 {

	public static void main(String[] args) {
		ArchetypeSkill skill = new SkillGamma();
		
		if (skill.hasCommand("Charlie2")) {
			// some process
			System.out.println("Have Charlie2");
			System.out.println(">> " + skill.getCommand("Charlie2").toSerializationData());
		} else {
			System.out.println("Have not Charlie2");
		}
		if (skill.hasCommand("Bravo")) {
			// some process
			System.out.println("Have Bravo");
			System.out.println(">> " + skill.getCommand("Bravo").toSerializationData());
		} else {
			System.out.println("Have not Bravo");
		}
		if (skill.hasCommand("Delta")) {
			// some process
			System.out.println("Have Delta");
			System.out.println(">> " + skill.getCommand("Delta").toSerializationData());
		} else {
			System.out.println("Have not Delta");
		}
	}

}
