module com.diogo.iftm.projetoagendatelefone {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.diogo.iftm.projetoagendatelefone to javafx.fxml;
    exports com.diogo.iftm.projetoagendatelefone;
}