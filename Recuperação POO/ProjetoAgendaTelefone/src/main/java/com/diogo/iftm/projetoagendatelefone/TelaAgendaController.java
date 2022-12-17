package com.diogo.iftm.projetoagendatelefone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TelaAgendaController implements Initializable {

    @FXML
    private Button botaoDeletar;

    @FXML
    private TextField emailContato;

    @FXML
    private Button botaoSalvar;

    @FXML
    private TextField nomeContato;

    @FXML
    private TextField buscarContato;

    @FXML
    private Button botaoBuscar;

    @FXML
    private TextField telefoneContato;

    List <AgendaContatos> listaContatos = new ArrayList<>();
    AgendaContatos contatos = new AgendaContatos("Diogo", "1234", "asdfasdfkasçdlfk@asdf");


    @FXML
    void salvarContato(ActionEvent event) {
        String nome = nomeContato.getText();
        String telefone = telefoneContato.getText();
        String email = emailContato.getText();
    }

    @FXML
    void buscarContato(ActionEvent event) {

        boolean existecontato = false;
        String buscaContato = buscarContato.getText();
        for (AgendaContatos obj: listaContatos ) {
            if (buscaContato.equals(obj.getTelefone())) {
                nomeContato.setText(obj.getNome());
                telefoneContato.setText(obj.getTelefone());
                emailContato.setText(obj.getEmail());
                existecontato = true;
            }
        }
        if (existecontato == false){
            //Notificacao.
        }
        botaoDeletar.setDisable(false);

    }

    @FXML
    void deletarContato(ActionEvent event) {

    }

    /*public TelaAgendaController(Button botaoDeletar, TextField emailContato, Button botaoSalvar, TextField nomeContato, TextField buscarContato, Button botaoBuscar, TextField telefoneContato) {
        this.botaoDeletar = botaoDeletar;
        this.emailContato = emailContato;
        this.botaoSalvar = botaoSalvar;
        this.nomeContato = nomeContato;
        this.buscarContato = buscarContato;
        this.botaoBuscar = botaoBuscar;
        this.telefoneContato = telefoneContato;*
    }*/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listaContatos.add(contatos);

    }
}

