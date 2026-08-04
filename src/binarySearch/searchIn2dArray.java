package binarySearch;

//https://leetcode.com/problems/search-a-2d-matrix/submissions/2088135650/
public class searchIn2dArray {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 4, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        System.out.println(searchMatrix3(matrix, target));
    }

//    Passed
    public static boolean searchMatrix3(int[][] matrix, int target){
        int colStart=0, colEnd=matrix[0].length-1,rowStart=0,rowEnd=matrix.length-1;
        int colMid=(colStart+colEnd)/2,rowMid=0;
        while(rowStart<=rowEnd){
            rowMid=(rowStart+rowEnd)/2;
            if(matrix[rowMid][colMid]==target){
                return true;
            }else if(matrix[rowMid][colMid]>target){
                rowEnd=rowMid-1;
            }else{
                rowStart=rowMid+1;
            }
        }
        if(searchingThroughIndicesInMatrix(matrix, rowEnd, 0, colMid, target)){
            return true;
        }else if(searchingThroughIndicesInMatrix(matrix, rowEnd, colMid, colEnd, target)){
            return true;
        }else if(searchingThroughIndicesInMatrix(matrix, rowStart, 0, colMid, target)){
            return true;
        }else if(searchingThroughIndicesInMatrix(matrix, rowStart, colMid, colEnd, target)){
            return true;
        }
        return false;
    }

    public static boolean searchingThroughIndicesInMatrix(int[][] matrix, int rowValue, int colStart, int colEnd, int target){
        int colMid =0;
        if(rowValue<0 || rowValue==matrix.length){
            return false;
        }
        while(colStart<=colEnd){
            colMid = (colStart+colEnd)/2;
            if(matrix[rowValue][colMid]==target){
                return true;
            }else if(matrix[rowValue][colMid]>target){
                colEnd=colMid-1;
            }else if(matrix[rowValue][colMid]<target){
                colStart=colMid+1;
            }
        }
        return false;
    }

//    Line 3: Staircase search from a matrix corner is O(m + n) and is explicitly prohibited by the restrictions.
    public static boolean searchMatrix2(int[][] matrix, int target){
        int row=0, col=matrix[0].length-1, rowLength=matrix.length;
        while(row!=rowLength && col!=-1){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                row++;
            }else if(matrix[row][col]>target){
                col--;
            }
        }
        return false;
    }

//    Line 3: The solution performs a linear scan of the rows, resulting in O(m log n) time complexity.
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        for(int[] arr: matrix){
            if(search(arr, target)){
                found=true;
                break;
            }
        }
        return found;
    }

    public static boolean search(int[] nums, int target){
        int start=0, end=nums.length-1,mid=0;
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}
