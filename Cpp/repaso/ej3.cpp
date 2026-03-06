#include <iostream>
using namespace std;

const int N = 5;

void mostrarMatriz(char matriz[N][N])
{
    int i;
    int j;

    for (i = 0; i < N; i++)
    {
        cout << endl;
        for (j = 0; j < N; j++)
        {
            cout << matriz[i][j];
        }
    }
}

void girarDerecha(char origen[N][N], char destino[N][N])
{
    int i;
    int j;
    for (i = 0; i < N; i++)
    {
        for (j = 0; j < N; j++)
        {
            destino[j][i] = origen[N - (i + 1)][j];
        }
    }
}

void limpiarPantalla()
{
    for (int i = 0; i < 30; i++)
    {
        cout << endl;
    }
}

int main()
{
    char matriz[N][N] = {
        {'.', '.', '#', '.', '.'},
        {'.', '#', '#', '#', '.'},
        {'#', '#', '#', '#', '#'},
        {'.', '.', '#', '.', '.'},
        {'.', '.', '#', '.', '.'}};

    char girada[N][N];

    char giarada2[N][N];

    girarDerecha(matriz, girada);
    girarDerecha(girada, giarada2);

    cout << "Matriz original:\n\n";
    mostrarMatriz(matriz);

    cout << "\nPresionar Enter para girarla...";
    cin.get();

    limpiarPantalla();

    cout << "Matriz girada 90 grados a la derecha:\n\n";
    mostrarMatriz(girada);
    cout << endl;
    mostrarMatriz(giarada2);

    return 0;
}