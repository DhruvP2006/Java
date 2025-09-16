#include <iostream>

using namespace std;

int main() {
    int numberOfPlayers;

    cout << "Enter the number of players: ";
    cin >> numberOfPlayers;

    int** playerScores = new int*[numberOfPlayers];
    int* matchCounts = new int[numberOfPlayers];

    for (int i = 0; i < numberOfPlayers; ++i) {
        cout << "\nEnter the number of matches played by player " << (i + 1) << ": ";
        cin >> matchCounts[i];

        playerScores[i] = new int[matchCounts[i]];

        cout << "Enter the runs for each match for player " << (i + 1) << ":" << endl;
        for (int j = 0; j < matchCounts[i]; ++j) {
            cout << "Match " << (j + 1) << ": ";
            cin >> playerScores[i][j];
        }
    }

    cout << "\n-----------------------------------------" << endl;
    cout << "           Player Statistics           " << endl;
    cout << "-----------------------------------------" << endl;

    for (int i = 0; i < numberOfPlayers; ++i) {
        int totalRuns = 0;
        for (int j = 0; j < matchCounts[i]; ++j) {
            totalRuns += playerScores[i][j];
        }

        double average = 0.0;
        if (matchCounts[i] > 0) {
            average = static_cast<double>(totalRuns) / matchCounts[i];
        }

        cout << "\nPlayer " << (i + 1) << endl;
        cout << "  Total Runs: " << totalRuns << endl;
        
        cout << "  Batting Average: ";
        int integerPart = static_cast<int>(average);
        int fractionalPart = static_cast<int>((average - integerPart) * 100);
        
        cout << integerPart << ".";
        if (fractionalPart < 10) {
            cout << '0';
        }
        cout << fractionalPart << endl;
    }

    for (int i = 0; i < numberOfPlayers; ++i) {
        delete[] playerScores[i];
    }
    delete[] playerScores;
    delete[] matchCounts;

    return 0;
}
