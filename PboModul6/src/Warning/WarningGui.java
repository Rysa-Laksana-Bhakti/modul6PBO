package Warning;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class WarningGui extends Application{
    Stage window;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Main Menu");

        GridPane grid = new GridPane();
        grid.setHgap(7);
        grid.setVgap(7);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setAlignment(Pos.CENTER);

        scene = new Scene(grid, 300, 300);
        window.setScene(scene);

        Text title = new Text("Daftar Data Diri");
        title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));


        Label nim = new Label("NIM");
        Label nama = new Label("NAMA");
        Label fakultas = new Label("FAKULTAS");
        Label jurusan = new Label("JURUSAN");
        Label alamat = new Label("ALAMAT");
        Label kota = new Label("KOTA");
        Label hobby = new Label("HOBBY");

        int x = 0, y = 0;

        grid.add(title, 1, 0, 2, 1);
        y++;
        grid.add(nim, x, y);
        y++;
        grid.add(nama, x, y);
        y++;
        grid.add(fakultas, x, y);
        y++;
        grid.add(jurusan, x, y);
        y++;
        grid.add(alamat, x, y);
        y++;
        grid.add(kota, x, y);
        y++;
        grid.add(hobby, x, y);

        x = 1; y = 1;

        TextField Nim = new TextField();
        Nim.setPromptText("Masukkan NIM");
        grid.add(Nim, x, y);
        y++;
        TextField Nama = new TextField();
        Nama.setPromptText("Masukkan Nama");
        grid.add(Nama, x, y);
        y++;
        TextField Fakultas = new TextField();
        Fakultas.setPromptText("Masukkan Fakultas");
        grid.add(Fakultas, x, y);
        y++;
        TextField Jurusan = new TextField();
        Jurusan.setPromptText("Masukkan Jurusan");
        grid.add(Jurusan, x, y);
        y++;
        TextField Alamat = new TextField();
        Alamat.setPromptText("Masukkan Alamat");
        grid.add(Alamat, x, y);
        y++;
        TextField Kota = new TextField();
        Kota.setPromptText("Masukkan Kota");
        grid.add(Kota, x, y);
        y++;
        TextField Hobby = new TextField();
        Hobby.setPromptText("Masukkan Hobby");
        grid.add(Hobby, x, y);
        y++;

        Button Add = new Button("Tambah");
        grid.add(Add, x, y);


        Add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String NIM = Nim.getText();
                String NAMA = Nama.getText();
                String FAKULTAS = Fakultas.getText();
                String JURUSAN = Jurusan.getText();
                String ALAMAT = Alamat.getText();
                String KOTA = Kota.getText();
                String HOBBY = Hobby.getText();

                if (NIM.matches("[0-9]+")&& NIM.length()==15) {
                    systemInformation("Information", "Input Success", "Data Telah Ditambahkan");
                    GridPane gridPane = new GridPane();
                    gridPane.setAlignment(Pos.CENTER);
                    gridPane.setVgap(5);


                    Text title1 = new Text("Form Biodata");
                    title1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
                    gridPane.add(title1, 1, 0, 2, 1);


                    Label nim1 = new Label("NIM");
                    nim1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,15));
                    gridPane.add(nim1,0,1);

                    Label nama1 = new Label("NAMA");
                    nama1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,15));
                    gridPane.add(nama1,0,2);

                    Label fakultas1 = new Label("FAKULTAS");
                    fakultas1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,15));
                    gridPane.add(fakultas1,0,3);

                    Label jurusan1 = new Label("JURUSAN");
                    jurusan1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,15));
                    gridPane.add(jurusan1,0,4);

                    Label alamat1 = new Label("ALAMAT");
                    alamat1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,15));
                    gridPane.add(alamat1,0,5);

                    Label kota1 = new Label("KOTA");
                    kota1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,15));
                    gridPane.add(kota1,0,6);

                    Label hobby1 = new Label("HOBBY");
                    hobby1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,15));
                    gridPane.add(hobby1,0,7);

                    Text nim2 =new Text(" : "+NIM);gridPane.add(nim2,1,1);
                    Text nama2 =new Text(" : "+NAMA);gridPane.add(nama2,1,2);
                    Text fakultas2 =new Text(" : "+FAKULTAS);gridPane.add(fakultas2,1,3);
                    Text jurusan2 =new Text(" : "+JURUSAN);gridPane.add(jurusan2,1,4);
                    Text alamat2 =new Text(" : "+ALAMAT);gridPane.add(alamat2,1,5);
                    Text kota2 =new Text(" : "+KOTA);gridPane.add(kota2,1,6);
                    Text hobby2 =new Text(" : "+HOBBY);gridPane.add(hobby2,1,7);

                    Button Back= new Button("Back");gridPane.add(Back,1,10);

                    Back.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            start(window);
                        }
                    });

                    Scene scene1 = new Scene(gridPane,400,300);
                    window.setScene(scene1);
                    window.show();

                } else {
                    systemWarning("Warning", "NIM Error", "NIM HARUS BERUPA ANGKA & HARUS 15 DIGIT\n Tolong Input Data kembali");
                }
            }
        });
        window.show();
    }

    public void systemInformation(String title, String header, String isi) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(isi);
        alert.showAndWait();
    }

    public void systemWarning(String title, String header, String isi) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(isi);
        alert.showAndWait();
    }
}

