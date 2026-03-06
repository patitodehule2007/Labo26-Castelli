/*
Crear la estructura Empleado que tiene un nombre, apellido, fecha de nacimiento,
sexo y salario.
Se pide la función empleadoConMayorSueldo que recibe por parámetro un vector con
todos los empleados de la empresa y otro vector vacío donde se guardarán los
empleados que tienen salario menor a $400.000.
La función deberá recorrer todos los empleados de la empresa y retornar el de mayor
sueldo. Además, a medida que va recorriendo los empleados, debe agregar al otro
vector los empleados cuyo salario es menor o igual a $400.000.
Por lo tanto, luego de llamar a la función se quiere mostrar en el main el empleado
con mayor sueldo y mostrar el nombre y apellido de todos los empleados con salario
menor o igual a $400.000
*/

#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct Fecha_t
{
    int dia;
    int mes;
    int ano;
};

struct Empleado_t
{
    string nombre;
    string apellido;
    Fecha_t fechaIngreso;
    string sexo;
    float salario;
};

Empleado_t mayorempleadoConMayorSueldo(vector<Empleado_t> ListaEmpleados, vector<Empleado_t> &ListaEmpleados_salarioMenor)
{
    int i;
    Empleado_t EmpleadoMayorSueldo = ListaEmpleados[0];
    for (i = 0; i < ListaEmpleados.size(); i++)
    {
        if (ListaEmpleados[i].salario > EmpleadoMayorSueldo.salario)
        {
            EmpleadoMayorSueldo = ListaEmpleados[i];
        }
        if (ListaEmpleados[i].salario <= 400000)
        {
            ListaEmpleados_salarioMenor.push_back(ListaEmpleados[i]);
        }
    }
    return EmpleadoMayorSueldo;
}

void MostrarListaEmpleados(vector<Empleado_t> ListaEmpleados)
{
    int i;
    for (i = 0; i < ListaEmpleados.size(); i++)
    {
        Empleado_t Empleado = ListaEmpleados[i];
        Fecha_t FechaIngreso = Empleado.fechaIngreso;

        cout << endl
             << "Nombre: " << Empleado.nombre << endl
             << "Apellido: " << Empleado.apellido << endl
             << "Fecha Ingreso: " << FechaIngreso.dia << "/" << FechaIngreso.mes << "/" << FechaIngreso.ano << endl
             << "Sexo: " << Empleado.sexo << endl
             << "salario: " << Empleado.salario << endl;
    }
}

int main(void)
{
    vector<Empleado_t> ListaEmpleados = {
        {"Juan", "Perez", {15, 3, 2020}, "Masculino", 2500.50},
        {"Maria", "Gomez", {10, 1, 2018}, "Femenino", 3200.75},
        {"Carlos", "Rodriguez", {22, 11, 2022}, "Masculino", 1800.00},
        {"Ana", "Lopez", {5, 7, 2015}, "Femenino", 4500.00},
        {"Luis", "Martinez", {30, 9, 2021}, "Masculino", 2100.20}};
    vector<Empleado_t> EmpleadosSalarioBajo;

    Empleado_t EmpleadoMayorSalario = mayorempleadoConMayorSueldo(ListaEmpleados, EmpleadosSalarioBajo);

    cout << "--------------------------" << endl
         << "El empleado con mayor sueldo es: " << endl;
    MostrarListaEmpleados({EmpleadoMayorSalario});

    cout << "--------------------------" << endl
         << "El empleados con un sueldo menor que 400.000 son: " << endl;
    MostrarListaEmpleados(EmpleadosSalarioBajo);
    cout << endl
         << endl;

    return 0;
}