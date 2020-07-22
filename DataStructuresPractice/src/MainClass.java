public class MainClass {
    public static void main(String[] args) {
        ArrayListInt arr = new ArrayListInt();
        arr.add(19);
        arr.add(27);
        arr.add(47);
        arr.add(13);
     //   arr.add(54);
   //     System.out.println("capacity:"+arr.capacity());
    //    System.out.println("size:"+arr.size());
    //    arr.printArrayListInt();

        LinkedList list = new LinkedList();
        list.addNode(12);
        list.addNode(14);
        list.addNode(15);
        list.addNode(16);
        list.addNode(17);
        list.addNode(18);
        list.addNode(14);
        list.addNode(12);
        list.addNode(16);

    //    list.deleteDups();
        System.out.println();
    //    list.printList();
   //    list.printFromIndex(4);
        //    list.addLoopList();
        boolean isLoop = list.checkLoop();
  //      if(!isLoop)
  //      list.printList();

   //     int[] array = new int[]{-2,5,7,11,-3,16,9,14,13,4,15,-1};
        //sorted
        int[] array = new int[]{-3,-2,-1,4,5,7,9,11,13,14,15,16};
        ProblemSolving problemSolving = new ProblemSolving();
   //     problemSolving.getTwoNumbers(array,13);
        System.out.println(problemSolving.getTwoNumbers1(array,13));






    }
}
