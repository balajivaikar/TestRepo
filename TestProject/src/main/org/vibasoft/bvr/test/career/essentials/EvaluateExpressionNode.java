package org.vibasoft.bvr.test.career.essentials;

import org.vibasoft.bvr.test.career.essentials.common.Node;
import org.vibasoft.bvr.test.career.essentials.common.Node.OPERATOR;

public class EvaluateExpressionNode {

	Node treeNode = new Node();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

	public void constructNode() {
		//3 + 4 * (5 + 9)
		Node node1 = new Node();
		node1.setLeftValue(5);
		node1.setRightValue(9);
		node1.setOperator(OPERATOR.ADD);
		
		Node node2 = new Node();
		node2.setLeftValue(4);
		node2.setRightNode(node1);
		node2.setOperator(OPERATOR.MULTIPLY);
		
		Node node3 = new Node();
		node3.setLeftValue(3);
		node3.setRightNode(node2);
		node3.setOperator(OPERATOR.ADD);
	}
}
