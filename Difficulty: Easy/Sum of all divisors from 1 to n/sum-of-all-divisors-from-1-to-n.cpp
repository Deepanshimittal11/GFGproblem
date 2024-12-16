//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    int sumOfDivisors(int n) {
        // Write Your Code here
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            int sum = 0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    sum = sum+i;
                }
            }
            return sum + sumOfDivisors(n-1);
        }
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        int ans = ob.sumOfDivisors(N);
        cout << ans << endl;

        cout << "~"
             << "\n";
    }
    return 0;
}
// } Driver Code Ends