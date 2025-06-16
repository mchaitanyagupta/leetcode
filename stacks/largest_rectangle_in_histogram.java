class Solution {
  //for every height in the histogram we need the previous smaller element and next smaller element, to calculate the maximum that can present with the the current height.
  //we store previous smaller element in the stack and next smaller element will eventually come over iterating the heights.
  //we push the index of the height if the height is in ascending order, else we will pop the stack and calculate the area of poped height.
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        
        int maxarea = heights[0];
        st.push(0);
        for(int i=1; i<heights.length; i++){
            maxarea = Math.max(maxarea, heights[i]);
            if(!st.isEmpty() && heights[i] > heights[st.peek()]){
                st.push(i);
            }else{
              //why do-while, if height is less than previous height then we have to pop atleast one height index from the stack
                do{
                  //height of the bar and noof bars that are equal or greater than the following height of the bar on besides of the bar.
                    int poped = st.pop();
                    int area = 0;
                    int psi;
                    int nsi;
                  //then we calculate the area by noof bars times the height of the tower
                    if(st.isEmpty()){
                        area = i * heights[poped];
                    }else{
                        nsi = i;
                        psi = st.peek();
                        area = heights[poped] * (nsi - psi -1);

                    }
                    maxarea = Math.max(area, maxarea);
                }while(!st.isEmpty() && heights[st.peek()] > heights[i]);
                st.push(i);
            }
        }
      //if the stack is not empty means there are bars that next smaller element is not available, so that we will calculate the area from the last bar of heights
        while(!st.isEmpty()){
            int poped = st.pop();
            int nsi = heights.length;
            int psi = (!st.isEmpty()) ? st.peek() : -1;
            int area = heights[poped] * (nsi - psi - 1);
            maxarea = Math.max(area, maxarea);
        }
//finally return the maximum area we got after popping all heights from the stack
        return maxarea;
        
    }
}
