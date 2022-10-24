package control;

import modelo.Alumno;

public class ArregloAlumnos {
    private Alumno aalum[] = new Alumno[3];
    private int indice = 0;
    
    public void adicionar(Alumno alumno) {
        if (indice == aalum.length) {
            ampliaAlumnos();
        }
        aalum[indice] = alumno;
        indice++;
    }
    
    private void ampliaAlumnos() {
        Alumno aux[] = aalum;
        aalum = new Alumno[indice + 3];
        for (int i = 0; i < indice; i++) {
            aalum[i] = aux[i];
        }
    }
    
    public int buscar(int cod) {
        for (int i = 0; i < indice; i++) {
            if (cod == aalum[i].getCodigo()) {
                return i;
            }
        }
        return -1;
    }
    
    public Alumno obtener(int pos) {
        return aalum[pos];
    }
    
    public int indice() {
        return indice;
    }
    
    public void eliminar(int pos) {
        for (int i = pos; i < indice - 1; i++) {
            aalum[i] = aalum[i+1];
        }
        indice--;
    }
}
