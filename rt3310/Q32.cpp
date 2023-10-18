#include <string>
#include <vector>
#include <queue>
using namespace std;

vector<int> solution(vector<string> operations) {
    vector<int> answer;
    priority_queue<int> maxpq;
    priority_queue<int> minpq;

    for (string op : operations) {
        if (op[0] == 'I') {
            int number = stoi(op.substr(2));
            maxpq.push(number);
            maxpq.push(number);
            continue;
        }

        if (op[2] == '-') {
            int max = maxpq.top();
            int min = minpq.top();
            minpq.pop();
            if (max == min) {
                maxpq.pop();
            }
            continue;
        }

        int max = maxpq.top();
        int min = minpq.top();
        maxpq.pop();
        if (max == min) {
            minpq.pop();
        }
    }
    return answer;
}