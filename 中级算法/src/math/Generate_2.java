package math;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @create: 2020-08-05-23:26
 * @author: Hey
 */
public class Generate_2 {
    public static void main(String[] args) {
        Generate_2 test = new Generate_2();
        test.generate(33);
        List<Integer> res = test.getRow(3);
        System.out.println(res);
    }
    List<List<Integer>> triangle = new ArrayList<>();
    private List<Integer> getRow(int rowIndex) {
        return triangle.get(rowIndex);
    }
    public List<List<Integer>> generate(int numRows) {
        if (numRows==0){
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);
            row.add(1);
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
