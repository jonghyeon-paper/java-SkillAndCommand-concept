package sample;

import sample.archetype.ArchetypeSkill;
import sample.skill.SkillAlpha;
import sample.skill.SkillBeta;
import sample.skill.SkillGamma;

public class Test1 {

	public static void main(String[] args) {
		ArchetypeSkill skill1 = new SkillAlpha();
		System.out.println(skill1.toSerializationData());
		
		ArchetypeSkill skill2 = new SkillBeta();
		System.out.println(skill2.toSerializationData());
		
		ArchetypeSkill skill3 = new SkillGamma();
		System.out.println(skill3.toSerializationData());
	}

}
