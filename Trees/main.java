public class main {
    public static void main(String[] args) {
        binart myTree = new binart();
        System.out.println(myTree.root);
        myTree.insert(47);
        myTree.insert(21);
        myTree.insert(76);
        myTree.insert(18);
        myTree.insert(52);
        myTree.insert(82);
        myTree.insert(27);
        System.out.println(myTree.root.left.right.value);

        System.out.println(myTree.contains(81));
    }
}
