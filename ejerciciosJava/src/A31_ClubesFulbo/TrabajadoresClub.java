package A31_ClubesFulbo;

public interface TrabajadoresClub {
     void checkearIncorporacion(Club club) throws RejectionContractExeption ;
     void checkearRenovacion() throws  RejectionContractExeption;
     String mostrarInformacion();
     String getNombre();
}
