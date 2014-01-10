package org.vibasoft.bvr.test.career.essentials.common;

import java.io.Serializable;

public class Node { // implements Serializable{

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1436274547986876733L;

	public enum OPERATOR {ADD, SUBTRACT, MULTIPLY, DIVIDE};
	private Integer lhsValue, rhsValue;
	private Node lhsNode, rhsNode;
	private OPERATOR operator = null;
	
	public Node() {}
	
	public void link(Node lhsNode, Node rhsNode) {
		this.lhsNode = lhsNode;
		this.rhsNode = rhsNode;
	}

	public final Integer getLhsValue() {
		return lhsValue;
	}

	public final void setLhsValue(Integer lhsValue) {
		this.lhsNode = null;
		this.lhsValue = lhsValue;
	}

	public final Integer getRhsValue() {
		return rhsValue;
	}

	public final void setRhsValue(Integer rhsValue) {
		this.rhsNode = null;
		this.rhsValue = rhsValue;
	}

	public final Node getLhsNode() {
		return lhsNode;
	}

	public final void setLhsNode(Node lhsNode) {
		this.lhsValue = null;
		this.lhsNode = lhsNode;
	}

	public final Node getRhsNode() {
		return rhsNode;
	}

	public final void setRhsNode(Node rhsNode) {
		this.rhsNode = null;
		this.rhsNode = rhsNode;
	}
	
	public final OPERATOR getOperator() {
		return operator;
	}

	public final void setOperator(OPERATOR operator) {
		this.operator = operator;
	}

	public int evaluate() {
		int result = 0;
		int lhs=0, rhs=0;
		
		if(lhsNode != null) {
			lhs=lhsNode.evaluate();
		} else {
			lhs = lhsValue;
		}
		
		if(rhsNode != null) {
			rhs = rhsNode.evaluate();
		} else {
			rhs = rhsValue;
		}
		
		if(operator == null) {
			throw new IllegalArgumentException("Invalid Operator:" + operator);
		}
		
		switch(operator) {
			case ADD:
				result = lhs + rhs;
				break;
			case SUBTRACT:
				result = lhs - rhs;
				break;
			case MULTIPLY:
				result = lhs * rhs;
				break;
			case DIVIDE:
				result = lhs / rhs;
				break;
		}
		
		return result;
				
	}
	
}
	