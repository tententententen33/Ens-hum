class MembersSkill {
	public static void main(String[] args) {
		String[] devSkills = {"Java","SQL","Git","Game"};
		String[] humSkills = {"Communication","calculator","typing","SQL"};
		boolean isFind = false;
		System.out.println("--- 部門間共通スキルの特定 ---");
		for (String dskill : devSkills) {
			for (String hskill : humSkills) {
				if (hskill.equals(dskill)) {
					System.out.println("共通スキルが見つかりました：" + dskill);
					isFind = true;
					break;
				}
			}
		}
		if (!isFind) {
			System.out.println("共通スキルは見つかりませんでした。");
		}
	}
}