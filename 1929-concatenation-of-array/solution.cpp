class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n = std::size(nums);
        vector<int> ans(2*n);

        for(int i=0;i<=n-1;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }


    return ans; 
    }
};