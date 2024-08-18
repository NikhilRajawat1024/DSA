#include<iostream>
using namespace std;
// #include<stdlib/c++>
#include<vector>
class Solution {
public:
    int trap(vector<int>& arr) {
        int i=0;
        int j=1;
        int diff=0;
        int size=arr.size();

        if(size==1)
        {
            return 0;
        }
        while(i<size && j<size)
        {
            if(arr[i]>arr[j])
            {
                if(ck(i,arr,size))
                {
                    diff+=arr[i]-arr[j];
                }
                j++;
            }
            else
            {
                i++;
                if(i==j)
                {
                    j=j+1;
                }
            }
        }
        return diff;
    }
    bool ck(int i,vector<int>& arr,int size)
    {
        int min_elm=arr[i];
        for(i;i<size;i++)
        {
            if(min_elm<arr[i])
            {
                return true;
            }
        }
        return false;
    }
};

int main()
{
    Solution s1;
    vector<int> v1={4,2,0,3,2,5};
    int ans=s1.trap(v1);
    cout<<ans;
}