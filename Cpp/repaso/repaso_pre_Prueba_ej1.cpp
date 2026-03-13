#include <vector>

#include <string>

#include <iostream>

using namespace std;

struct perros_t {
  string nombre;
  int edad;
  string direccion;
  string barrio;
  string raza;
};

void agregar_mascota(vector < perros_t > & lista_perros) {
  perros_t aux;
  string nombre_perro;
  int edad_perro;
  string direccion;
  string barrio;
  string raza;
  cout << endl << "nombre Perro: ";
  cin >> nombre_perro;
  cout << endl << "edad Perro: ";
  cin >> edad_perro;
  cout << endl << "direccion Perro: ";
  cin >> direccion;
  cout << endl << "barrio Perro: ";
  cin >> barrio;
  cout << endl << "raza Perro: ";
  cin >> raza;

  aux.nombre = nombre_perro;
  aux.edad = edad_perro;
  aux.direccion = direccion;
  aux.barrio = barrio;
  aux.raza = raza;

  lista_perros.push_back(aux);

}

void verMascotasRaza(vector < perros_t > lista_perros, string raza) {

  int i;

  for (i = 0; i < lista_perros.size(); i++) {
    if (lista_perros[i].raza == raza) {
      cout << lista_perros[i].nombre;
    }
  }
}

void verDireccionMascota(vector < perros_t > lista_perros, string nombre) {
  int i;

  for (i = 0; i < lista_perros.size(); i++) {
    if (lista_perros[i].nombre == nombre) {
      cout << lista_perros[i].direccion;
    }

  }
}

int main(void) {
  vector < perros_t > lista_perros;
  agregar_mascota(lista_perros);
  verMascotasRaza(lista_perros, "Jack Russell  Terrier");
  verDireccionMascota(lista_perros, "Sol");

  return 0;

}
