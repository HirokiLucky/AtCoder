#include <iostream>

using namespace std;

int main(){
    
        int n;
        int y;
        int sub;

        cin >> n;
        cin >> y;

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                sub = n - (i + j);
                if(10000 * i + 5000 * j + 1000 * sub  == y && sub >= 0){
                    cout << i << " " << j << " " << sub;
                    return 0;
                }
            }
        }

        cout << -1 << " " << -1 << " " << -1;
        return 0;
}
