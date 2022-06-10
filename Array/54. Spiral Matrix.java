package Array;

class solution{

    pulic List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        if(matrix == null) return result;

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;

        while(rowBegin < rowEnd && columnBegin < columnEnd){
            
            for(int i = columnBegin; i <= columnEnd; i++){
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for(int i = rowBegin; i <= rowEnd; i++){
                result.add(matrix[i][columnEnd]);
            }
            columnEnd--;

            if(rowBegin <= rowEnd){
                for(int i = columnEnd; i > columnBegin; i--){
                    result.add(matrix[i][rowEnd]);
                }
            }
            rowEnd--;
            if(columnBegin <= columnEnd){
                for(int i = rowEnd; i> rowBegin; i--){
                    result.add(matrix[i][columnBegin]);
                }
            }
            columnBegin++;
            
        }

        return result;
    }

}