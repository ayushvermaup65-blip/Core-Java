public class Array2D {
    static void main() {

        //declaration
        int[][] arr;
        //allocation
        arr = new int [3][4];
        //intialization
        int [][] brr= {
                {1,2},
                {2,3,4,5},
                {3,4,4,5,6,7},
                {4}
                };
        //is array ko Jagged array bolte hai
//        System.out.println(brr[3][1]);
//        int rowLength = brr.length;
//
//        //jab har row me number of columns same ho tab niche wala method use karenge colLength nikalne ke liye
////        int colLength = brr[0].length;
//
//        for(int rowIndex=0; rowIndex<=rowLength-1; rowIndex++){
//            //Jaise hi main kisi new row  me aaya
//            //same point pr maine uss row ka colLength find out krlia
//            //current row -> brr[rowIndex].length
//            //to iska matlab columns -> brr[rowIndex].length
//            int colLength = brr[rowIndex].length;
//            for (int colIndex=0; colIndex<=colLength-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }

        //traversal 2D Array
        for (int rowIndex = 0; rowIndex<=brr.length-1; rowIndex++){
            for (int colIndex = 0; colIndex<=brr[rowIndex].length-1; colIndex++){
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }

    }
}
