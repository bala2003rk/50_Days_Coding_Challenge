class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        // double maxDiagonal = 0;
        // int maxArea = 0;

        // for (int i = 0; i < dimensions.length; i++) {
        //     int length = dimensions[i][0];
        //     int breadth = dimensions[i][1];
        //     double diagonal = Math.sqrt(length * length + breadth * breadth);
        //     int area = length * breadth;

        //    if (diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)) {
        //     maxDiagonal = diagonal;
        //     maxArea = area;
        //     }

        // }

        // return maxArea;
        int maxDiaSq = 0;
        int maxArea = 0;
        for (int[] dim : dimensions) {
            int l = dim[0];
            int w = dim[1];
            int diaSq = l * l + w * w;
            int area = l * w;
            if (diaSq > maxDiaSq) {
                maxDiaSq = diaSq;
                maxArea = area;
            } else if (diaSq == maxDiaSq) {
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}