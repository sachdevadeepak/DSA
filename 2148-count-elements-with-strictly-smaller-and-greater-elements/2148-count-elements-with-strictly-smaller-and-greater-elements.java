class Solution {
   public int countElements(int[] a){
        int min = Arrays.stream(a).min().getAsInt(), max = Arrays.stream(a).max().getAsInt();
        return (int)Arrays.stream(a).filter(n -> min < n && n < max).count();
    }
}