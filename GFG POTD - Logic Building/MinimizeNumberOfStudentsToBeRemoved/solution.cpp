//User function Template for C++

class Solution {
  public:
    int removeStudents(int H[], int N) {
        // code here
        //H=[9,1,2,3,1,5]
        vector<int>ans;
        for(int i=0;i<N;i++){
            if(ans.empty() || H[i]>ans.back()){
                ans.push_back(H[i]);
            }
            else{
                int lb = lower_bound(ans.begin(),ans.end(),H[i])-ans.begin();
                ans[lb]=H[i];
            }
        }
        return N-ans.size();
    }
};