package Array;

public class 56. Merge Intervals {
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        for(int[] i : intervals){
            if(list.getLast()[1] < i[0]){
                list.add(i);
            }else{
                list.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
