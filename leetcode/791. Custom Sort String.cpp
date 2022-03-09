class Solution {
public:
    string customSortString(string order, string str) {
        string res = "";
        for(auto ch : order) {
            for(auto ch1 : str) {
                if(ch == ch1)
                    res += ch;
            }
        }
        
        for(auto ch : str) {
            if(order.find(ch) == order.npos)
                res += ch;
        }    
            
        return res;
    }
};
