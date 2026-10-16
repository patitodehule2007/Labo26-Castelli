package A31_ClubsFulbo;

public interface TrabajadoresClub {
     void  incorporarse(Club club) throws  RejectionContractExeption;
     void  renovarContrato(Club club) throws  RejectionContractExeption;
     String mostrarInformacion();
}
