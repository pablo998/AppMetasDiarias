package com.example.myapplication.ListaRecordatorios;



public class RecordatoriosListaItem {
    private String meta;
    private String hora;


    public RecordatoriosListaItem(String meta, String hora) {
        this.meta = meta;
        this.hora = hora;

    }

    public String getMeta() {
        return meta;
    }

    public String getHora() { return hora; }

}
