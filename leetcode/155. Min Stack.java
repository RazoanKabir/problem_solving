class MinStack {
    Stack <Integer> min= new Stack<Integer>();
    ArrayList<Integer> temp= new ArrayList<Integer>();
    int maxVal= -62;    
    
    public MinStack() {
        min.push(null);
    }    
    
    public void push(int val) {
        min.push(val);
        temp.add(val);
        if(val>maxVal) maxVal= val;
    }    
    
    public void pop() {
        int popped = min.pop();
        temp.remove(temp.size()-1);           
    }    
    
    public int top() {
        return min.peek();
    }    
    
    public int getMin() {
        if(temp.size()>0){
        int minInside= maxVal;
        for(int i=0; i <temp.size();i++){
            if(temp.get(i)< minInside){
                minInside = temp.get(i);
            }
        }
            return minInside;
        } else return 0;
    }
}
