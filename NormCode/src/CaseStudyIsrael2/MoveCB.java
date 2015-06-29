package CaseStudyIsrael2;

import jamder.behavioural.Action;
import jamder.behavioural.Condition;
import jamder.norms.NormType;

public class MoveCB extends Action {
	
	Table table;

	public MoveCB(String name, Table table) {
		super(name);
		this.table=table;
	}
	
	public void execute() {
		Block ba=table.findBlock("C");
		Block bb=table.findBlock("B");
		if (ba.isClear() && bb.isClear())
			if (ba.getOn().getName().equalsIgnoreCase("table")){
				table.move(ba, table, bb);
				System.out.println("MoveCB");
			}
	}
}