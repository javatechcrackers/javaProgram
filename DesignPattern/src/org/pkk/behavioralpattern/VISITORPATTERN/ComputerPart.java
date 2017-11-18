package org.pkk.behavioralpattern.VISITORPATTERN;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}