#include <iostream>

#include <string>

#include <vector>


#define DIAS 3
#define HORARIOS 4

using namespace std;

struct pelicula_t {
  string nombrePelicula;
  int numeroSala;
  float precioEntrada;
  vector < char > listaEntradas;
};

int parseHourToID(int hora) {
  int res;
  if (hora < 14 || hora > 22) {
    res = -1;
  } else {
    res = ((hora / 2) - 7);
  }
  return res;
}

int parseDayToID(string day) {
  int id;
  if (day == "Viernes") {
    id = 0;
  } else if (day == "Sabado") {
    id = 1;
  } else if (day == "Domingo") {
    id = 2;
  } else {
    id = -1;
  }

  return id;
}

void PreguntarYmostrarPeliculaHorario(pelicula_t listaPelis[DIAS][HORARIOS]) {

  int horaPeli;
  string DiaPeli;

  int parsedDia = -1;
  int parsedHora = -1;

  while (parsedDia == -1 && parsedHora == -1) {
    cout << endl << "HoraPeli: ";
    cin >> horaPeli;
    cout << endl << "DiaPeli: ";
    cin >> DiaPeli;

    parsedDia = parseDayToID(DiaPeli);

    parsedHora = parseHourToID(horaPeli);

    if (parsedDia == -1 || parsedHora == -1) {
      cout << endl << "hora o dia invalido" << endl;
    }
    cout << listaPelis[parsedDia][parsedHora].nombrePelicula << endl;
  }

}

int parseIDtoHour(int hora) {
  return (hora * 2 + 12);
}

string parseIDtoDay(int posDia) {
  string res;
  switch (posDia) {
  case 0:
    res = "Viernes";
    break;
  case 1:
    res = "Sabado";
    break;
  case 2:
    res = "Domingo";
    break;
  default:
    res = "Dia desconocido";
  }
  return res;
}

void mostrarEntradaMasCara(pelicula_t listaPelis[DIAS][HORARIOS]) {
  int maxI = 0;
  int maxJ = 0;
  int i;
  int j;
  for (i = 0; i < DIAS; i++) {
    for (j = 0; j < HORARIOS; j++) {
      if (listaPelis[i][j].precioEntrada > listaPelis[maxI][maxJ].precioEntrada) {
        maxI = i;
        maxJ = j;
      }
    }
  }

  cout << "La mas cara fue el dia: " << parseIDtoDay(maxI) << "a la hora : " << parseIDtoHour(maxJ);
}

void mostrarEntradasMuyVendidas(pelicula_t listaPelis[DIAS][HORARIOS]) {
  int i;
  int j;
  int EntradasSuperadas = 0;

  for (i = 0; i < DIAS; i++) {
    for (j = 0; j < HORARIOS; j++) {
      if (listaPelis[i][j].listaEntradas.size() > 50) {
        EntradasSuperadas += 1;
      }
    }
  }
  cout << endl << "Hay " << EntradasSuperadas << " Peliculas que superaron las 50 entradas" << endl;

}

void mostrarPreciosNocturnos(pelicula_t listasPelis[DIAS][HORARIOS]) {
  int i;
  int j;
  float sum = 0;
  float res;

  for (i = 0; i < DIAS; i++) {
    for (j = 2; j < HORARIOS; j++) {
      sum += listasPelis[i][j].precioEntrada;
    }
  }
  res = (float) sum / (HORARIOS - 2);

  cout << "el promedio de precio es: " << res << endl;
}

int main(void) {
  pelicula_t cartelera[DIAS][HORARIOS];

  for (int i = 0; i < DIAS; i++) {
    for (int j = 0; j < HORARIOS; j++) {
      cartelera[i][j].nombrePelicula = "Movie_D" + to_string(i) + "_H" + to_string(j);
      cartelera[i][j].numeroSala = (i * HORARIOS) + j + 1; // 
      cartelera[i][j].precioEntrada = 10.50 + (i + j); // 
      cartelera[i][j].listaEntradas = {
        'A',
        'A',
        'A',
        'A',
        'A'
      };
    }
  }

  PreguntarYmostrarPeliculaHorario(cartelera);
  mostrarEntradaMasCara(cartelera);
  mostrarEntradasMuyVendidas(cartelera);
  mostrarPreciosNocturnos(cartelera);

}
