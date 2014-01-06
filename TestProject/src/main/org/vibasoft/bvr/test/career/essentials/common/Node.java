package org.vibasoft.bvr.test.career.essentials.common;

public class Node {

	public enum OPERATOR {ADD, SUBTRACT, MULTIPLY, DIVIDE};
	
	private Node leftNode, rightNode;
	private Integer leftValue, rightValue;
	
	private OPERATOR operator;
	
	public Node(Node leftNode, Node rightNode, OPERATOR operator) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.operator = operator;
	}

	public final Node getLeftNode() {
		return leftNode;
	}
	
	public final void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	
	public final Node getRightNode() {
		return rightNode;
	}
	
	public final void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public final Integer getLeftValue() {
		return leftValue;
	}

	public final void setLeftValue(Integer leftValue) {
		this.leftValue = leftValue;
	}

	public final Integer getRightValue() {
		return rightValue;
	}

	public final void setRightValue(Integer rightValue) {
		this.rightValue = rightValue;
	}

	public final OPERATOR getOperator() {
		return operator;
	}

	public final void setOperator(OPERATOR operator) {
		this.operator = operator;
	}
	
	
}
