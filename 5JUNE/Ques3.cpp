//if the input string of is XXIX return 10109

#include <iostream>
using namespace std;

int main()
{
    string s = "XXIX";
    string ans = "";
    for(int i = 0;i<s.size();i++){
        char ch = s[i];
        switch(ch){
            case 'M':
                ans += to_string(1000);
                break;

            case 'D':
                ans += to_string(500);
                break;

            case 'C':
                if (s[i+1] == 'D')
                {
                    ans += to_string(400);
                    i++;
                }
                else if (s[i+1] == 'M')
                {
                    ans += to_string(900);
                    i++;
                }
                else
                {
                    ans += to_string(100);
                }
                break;

            case 'L':
                ans += to_string(50);
                break;
            
            case 'X':
            ans+=to_string(10);
            break;
            
            case 'V':
            ans+=to_string(5);
            break;
            
            case 'I':
                if (s[i+1] == 'V')
                {
                    ans += to_string(4);
                    i++;
                }
                else if (s[i+1] == 'X')
                {
                    ans += to_string(9);
                    i++;
                }
                else
                {
                    ans += to_string(1);
                }
                break;
            
            default:
                break;
        }
    }
        cout<<ans<<endl;
    return 0;
}