/*
ENUNCIADO

2. Se quieren almacenar los productos de un supermercado. De estos interesa conocer
 el nombre, código de barra, marca, precio y si tiene fecha de vencimiento o no.
 Los pasillos del supermercado están compuestos por góndolas de 3 filas y 4 columnas.
 Ingresar tantos productos como sea necesario para llenar un pasillo y determinar:
 a) Columna de la góndola que tiene al precio de mayor valor.
 b) Nombre del producto de la 2 fila, columna 3.
 c) Promedio de precios de todo ese pasillo.
 d) Cantidad de productos con fecha de vencimiento.

 */

#include <iostream>
#include <string>
#include <vector>

#define LARGO_GONDOLA 3
#define ALTO_GONDOLA 4

using namespace std;

struct Producto
{
    string nombre;
    vector<int> codigoDeBarra;
    string marca;
    float precio;
    bool vence;
};

int obtenerColumnaConMayorPrecio(Producto gondola[LARGO_GONDOLA][ALTO_GONDOLA])
{
    int maxi = 0;
    int maxj = 0;
    int i;
    int j;
    for (i = 0; i < LARGO_GONDOLA; i++)
    {
        for (j = 0; j < ALTO_GONDOLA; j++)
        {
            if (gondola[i][j].precio > gondola[maxi][maxj].precio)
            {
                maxi = i;
                maxj = j;
            }
        }
    }
    return maxj;
}

int CantidadQueVencen(Producto gondola[LARGO_GONDOLA][ALTO_GONDOLA])
{
    int cantidadQueVencen = 0;
    int i;
    int j;
    for (i = 0; i < LARGO_GONDOLA; i++)
    {
        for (j = 0; j < ALTO_GONDOLA; j++)
        {
            if (gondola[i][j].vence)
            {
                cantidadQueVencen++;
            }
        }
    }
    return cantidadQueVencen;
}

float obtenerPromedioPrecio(Producto gondola[LARGO_GONDOLA][ALTO_GONDOLA])
{

    int i;
    int j;
    int total = 0;
    for (i = 0; i < LARGO_GONDOLA; i++)
    {
        for (j = 0; j < ALTO_GONDOLA; j++)
        {
            total += gondola[i][j].precio;
        }
    }
    return (float)(total / (LARGO_GONDOLA * ALTO_GONDOLA));
}

int main(void)
{

    Producto gondola[LARGO_GONDOLA][ALTO_GONDOLA] = {
        // Fila 0
        {
            {"Leche", {1, 2, 3, 4}, "La Serenisima", 1200.50, true},
            {"Arroz", {5, 6, 7, 8}, "Gallo", 950.00, false},
            {"Cafe", {9, 0, 1, 2}, "Cabrales", 500.00, true},
            {"Azucar", {3, 4, 5, 6}, "Ledesma", 800.25, false}},
        // Fila 1
        {
            {"Fideos", {7, 8, 9, 0}, "Matarazzo", 1100.00, false},
            {"Aceite", {1, 1, 2, 2}, "Cocinero", 2100.50, true},
            {"Yerba", {3, 3, 4, 4}, "Playadito", 200.00, true},
            {"Sal", {5, 5, 6, 6}, "Celusal", 400.00, false}},
        // Fila 2
        {
            {"Galletas", {7, 7, 8, 8}, "Trafilat", 750.00, true},
            {"Jabon", {9, 9, 0, 0}, "Rexona", 600.00, false},
            {"Shampoo", {1, 2, 1, 2}, "Sedal", 280000000.00, true},
            {"Pan", {3, 4, 3, 4}, "Bimbo", 150990.00, true}}};

    cout << "La columna con el productor con el mayor precio es:  " << obtenerColumnaConMayorPrecio(gondola) + 1 << endl;

    cout << endl
         << "El nombre del producto en la fila 2 columna 3 es : " << gondola[2 - 1][3 - 1].nombre << endl;

    cout << endl
         << "El promedio de precio de la gondola es de: " << obtenerPromedioPrecio(gondola) << endl;

    cout << endl
         << "La cantidad de productos que vencen son : " << CantidadQueVencen(gondola) << endl
         << endl;
    return 0;
}