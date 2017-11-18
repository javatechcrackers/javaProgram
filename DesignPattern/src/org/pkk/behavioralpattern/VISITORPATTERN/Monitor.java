package org.pkk.behavioralpattern.VISITORPATTERN;

public class Monitor implements ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}