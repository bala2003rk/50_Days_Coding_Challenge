class Solution {
    public int findClosest(int x, int y, int z) {
        int X = Math.abs(z-x);
        int Y = Math.abs(z-y);

        if(X < Y){
            return 1;
        }
        else if(X > Y){
            return 2;
        }
        return 0;
    }
}