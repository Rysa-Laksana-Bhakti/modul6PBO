package tekAnisa;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class gonanAnisa extends Application {

    public static class Gaji {
        private final SimpleStringProperty tahunMasuk, jabatan, gapok, bonus, tunjangan, lembur, totalGaji;

        private Gaji(String a, String b, String c, String d, String e, String f, String g) {
            this.tahunMasuk = new SimpleStringProperty(a);
            this.jabatan = new SimpleStringProperty(b);
            this.gapok = new SimpleStringProperty(c);
            this.bonus = new SimpleStringProperty(d);
            this.tunjangan = new SimpleStringProperty(e);
            this.lembur = new SimpleStringProperty(f);
            this.totalGaji = new SimpleStringProperty(g);
        }
        public void setTahunMasuk(String a) {
            tahunMasuk.set(a);
        }
        public void setJabatan(String a) {
            jabatan.set(a);
        }
        public void setGapok(String a) {
            gapok.set(a);
        }
        public void setBonus(String a) {
            bonus.set(a);
        }
        public void setTunjangan(String a) {
            tunjangan.set(a);
        }
        public void setLembur(String a) {
            lembur.set(a);
        }
        public void setTotalGaji(String a) {
            totalGaji.set(a);
        }

        public String getTahunMasuk() {
            return tahunMasuk.get();
        }
        public String getJabatan(){
            return jabatan.get();
        }
        public String getGapok(){
            return gapok.get();
        }
        public String getBonus() {
            return bonus.get();
        }
        public String getTunjangan() {
            return tunjangan.get();
        }
        public String getLembur() {
            return lembur.get();
        }
        public String getTotalGaji() {
            return totalGaji.get();
        }

    }

    final ObservableList<Gaji> data = FXCollections.observableArrayList(

    );

    private int selectedIndex = -1;
    TableView<Gaji> table = new TableView<>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Gaji");

        final VBox vbox = new VBox();
        final VBox vbox2 = new VBox();

        Scene scene = new Scene(new Group());
        Scene scene2 = new Scene(new Group());

        final Label label = new Label("Gaji");
        label.setFont(new Font("Arial", 20));

        TableColumn ColTahunMasuk = new TableColumn("Tahun Masuk");
        TableColumn ColJabatan = new TableColumn("Jabatan");
        TableColumn ColGapok = new TableColumn("Gapok");
        TableColumn ColBonus = new TableColumn("Bonus");
        TableColumn ColTunjangan = new TableColumn("Tunjangan");
        TableColumn ColLembur = new TableColumn("Lembur");
        TableColumn ColTotalGaji = new TableColumn("Total Gaji");

        ColTahunMasuk.setMinWidth(100);
        ColJabatan.setMinWidth(100);
        ColGapok.setMinWidth(100);
        ColBonus.setMinWidth(100);
        ColTunjangan.setMinWidth(100);
        ColLembur.setMinWidth(100);
        ColTotalGaji.setMinWidth(100);

        ColTahunMasuk.setCellValueFactory(new PropertyValueFactory<Gaji, String>("Tahun Masuk"));
        ColJabatan.setCellValueFactory(new PropertyValueFactory<Gaji, String>("Jabatan"));
        ColGapok.setCellValueFactory(new PropertyValueFactory<Gaji, String>("Gapok"));
        ColBonus.setCellValueFactory(new PropertyValueFactory<Gaji, String>("Bonus"));
        ColTunjangan.setCellValueFactory(new PropertyValueFactory<Gaji, String>("Tunjangan"));
        ColLembur.setCellValueFactory(new PropertyValueFactory<Gaji, String>("Lembur"));
        ColTotalGaji.setCellValueFactory(new PropertyValueFactory<Gaji, String>("Total Gaji"));

        ColTahunMasuk.setCellFactory(TextFieldTableCell.forTableColumn());
        ColJabatan.setCellFactory(TextFieldTableCell.forTableColumn());
        ColGapok.setCellFactory(TextFieldTableCell.forTableColumn());
        ColBonus.setCellFactory(TextFieldTableCell.forTableColumn());
        ColTunjangan.setCellFactory(TextFieldTableCell.forTableColumn());
        ColLembur.setCellFactory(TextFieldTableCell.forTableColumn());
        ColTotalGaji.setCellFactory(TextFieldTableCell.forTableColumn());

        ColTahunMasuk.setOnEditCommit(new EventHandler<CellEditEvent<Gaji, String>>() {
            @Override
            public void handle(CellEditEvent<Gaji, String> t) {
                ((Gaji)t.getTableView().getItems().get(t.getTablePosition().getRow())).setTahunMasuk(t.getNewValue());
            }
        });
        ColJabatan.setOnEditCommit(new EventHandler<CellEditEvent<Gaji, String>>() {
            @Override
            public void handle(CellEditEvent<Gaji, String> t) {
                ((Gaji) t.getTableView().getItems().get(t.getTablePosition().getRow())).setJabatan(t.getNewValue());
            }
        });
        ColGapok.setOnEditCommit(new EventHandler<CellEditEvent<Gaji, String>>(){
            @Override
            public void handle(CellEditEvent<Gaji, String> t) {
                ((Gaji) t.getTableView().getItems().get(t.getTablePosition().getRow())).setGapok(t.getNewValue());
            }
        });
        ColBonus.setOnEditCommit(new EventHandler<CellEditEvent<Gaji, String>>() {
            @Override
            public void handle(CellEditEvent<Gaji, String> t) {
                ((Gaji) t.getTableView().getItems().get(t.getTablePosition().getRow())).setBonus(t.getNewValue());
            }
        });
        ColTunjangan.setOnEditCommit(new EventHandler<CellEditEvent<Gaji, String>>() {
            @Override
            public void handle(CellEditEvent<Gaji, String> t) {
                ((Gaji) t.getTableView().getItems().get(t.getTablePosition().getRow())).setTunjangan(t.getNewValue());
            }
        });
        ColLembur.setOnEditCommit(new EventHandler<CellEditEvent<Gaji, String>>() {
            @Override
            public void handle(CellEditEvent<Gaji, String> t) {
                ((Gaji) t.getTableView().getItems().get(t.getTablePosition().getRow())).setLembur(t.getNewValue());
            }
        });
        ColTotalGaji.setOnEditCommit(new EventHandler<CellEditEvent<Gaji, String>>() {
            @Override
            public void handle(CellEditEvent<Gaji, String> t) {
                ((Gaji) t.getTableView().getItems().get(t.getTablePosition().getRow())).setTotalGaji(t.getNewValue());
            }
        });

        table.setEditable(true);
        table.setItems(data);
        table.getColumns().addAll(ColTahunMasuk,ColJabatan, ColGapok, ColBonus,  ColTunjangan, ColLembur, ColTotalGaji);
        table.setOnMouseClicked(event ->{
            selectedIndex = table.getSelectionModel().getSelectedIndex();
        });

        final TextField fieldTahunMasuk = new TextField();
        final TextField fieldJabatan = new TextField();
        final TextField fieldGapok = new TextField();
        final TextField fieldBonus = new TextField();
        final TextField fieldTunjangan = new TextField();
        final TextField fieldLembur = new TextField();
        final TextField fieldTotalGaji = new TextField();

        fieldTahunMasuk.setPromptText("Tahun Masuk");
        fieldJabatan.setPromptText("Jabatan");
        fieldGapok.setPromptText("Gapok");
        fieldBonus.setPromptText("Bonus");
        fieldTunjangan.setPromptText("Tunjangan");
        fieldLembur.setPromptText("Lembur");
        fieldTotalGaji.setPromptText("Total Gaji");

        fieldTahunMasuk.setMaxWidth(100);
        fieldJabatan.setMaxWidth(100);
        fieldGapok.setMaxWidth(100);
        fieldBonus.setMaxWidth(100);
        fieldTunjangan.setMaxWidth(100);
        fieldLembur.setMaxWidth(100);
        fieldTotalGaji.setMaxWidth(100);

        Button LihatJadwal = new Button ("Lihat Jadwal");
        Button Delete = new Button("Delete");
        Button Back = new Button("Back");
        final Button Add = new Button("Add");

        Delete.setOnAction((ActionEvent e) -> {
            data.remove(selectedIndex);
        });
        LihatJadwal.setOnAction(e -> {
            primaryStage.setScene(scene2);
        });
        Back.setOnAction((e -> {
            primaryStage.setScene(scene);
        }));
        Add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                data.add(
                        new Gaji(
                                fieldTahunMasuk.getText(),
                                fieldJabatan.getText(),
                                fieldGapok.getText(),
                                fieldBonus.getText(),
                                fieldTunjangan.getText(),
                                fieldLembur.getText(),
                                fieldTotalGaji.getText()

                        )
                );

                fieldTahunMasuk.clear();
                fieldJabatan.clear();
                fieldGapok.clear();
                fieldBonus.clear();
                fieldTunjangan.clear();
                fieldLembur.clear();
                fieldTotalGaji.clear();
            }
        });

        vbox2.setSpacing(20);

        vbox2.setPadding(new Insets(50, 50, 50, 50));
        vbox2.getChildren().addAll(fieldTahunMasuk, fieldJabatan, fieldGapok, fieldBonus, fieldTunjangan, fieldLembur,fieldTotalGaji, LihatJadwal, Add);

        ((Group) scene.getRoot()).getChildren().addAll(vbox2);

        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(label, table, Back, Delete);

        ((Group) scene2.getRoot()).getChildren().addAll(vbox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }


}

